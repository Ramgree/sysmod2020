import org.json.JSONObject;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static spark.Spark.*;

public class WebConnect {

    static class Challenge {
        public String player1;
        public String player2;
        public Instant time = Instant.now();

        public Challenge(String player_1, String player_2, Instant time) {
            this.player1 = player_1;
            this.player2 = player_2;
            this.time = time;
        }

        public void setTime(Instant time) {
            this.time = time;
        }
    }

    private static int GAME_COUNTER = 0;
    private static int DROP_TIME = 600;
    private static List<Player> players = new ArrayList<>();
    // Challenges are name pairs, directional.
    private static List<Challenge> challenges = new ArrayList<>();
    private static List<Mancala> games = new ArrayList<>();

    public static void runLobby() {
        port(40080);

        //Example URL for adding player named 'dave': http://localhost:40080/add_player/dave
        post("/add_player/*", (req, res) -> {
            String[] params = req.splat();
            String playerName = params[0];
            JSONObject json = new JSONObject();
            json.put("result", "OK");
            boolean needToAdd = true;
            for (Player player : players) {
                if (player.getName().equals(playerName)) {
                    needToAdd = false;
                    player.withTime(Instant.now());
                    break;
                }
            }
            if (needToAdd) {
                System.out.println(String.format("Adding player %s", playerName));
                players.add(new Player(playerName).withTime(Instant.now()));
            }
            return json.toString();
        });

        //URL for getting all players : http://localhost:40080/players
        get("/players", (req, res) -> {
            JSONObject json = new JSONObject();
            json.put("result", "OK");
            List<String> names = new ArrayList<>();
            for (Player player : players) {
                names.add(player.getName());
            }
            json.put("names", names);
            return json.toString();
        });

        //URL for getting all challenges : http://localhost:40080/challenges
        get("/challenges", (req, res) -> {
            JSONObject json = new JSONObject();
            json.put("result", "OK");
            List<String> challengeStrings = new ArrayList<>();
            for (Challenge challenge : challenges) {
                challengeStrings.add(challenge.player1 + "|" + challenge.player2);
            }
            json.put("challenges", challengeStrings.toString());
            System.out.println("Sending back challenges: " + challengeStrings.toString());
            return json.toString();
        });

        //Example URL for adding a challenge from 'dave' towards 'mary' : http://localhost:40080/add_challenge/dave/mary
        post("/add_challenge/*/*", (req, res) -> {
            //System.out.println("queryParams: " + req.queryMap());
            String[] params = req.splat();
            String player_1 = params[0];
            String player_2 = params[1];
            challenges.removeIf(challenge -> challenge.player1.equals(player_1));
            System.out.println(String.format("Adding challenge %s -> %s", player_1, player_2));
            challenges.add(new Challenge(player_1, player_2, Instant.now()));
            JSONObject json = new JSONObject();
            json.put("result", "OK");
            return json.toString();
        });

        //URL for getting all games : http://localhost:40080/games
        get("/games", (req, res) -> {
            JSONObject json = new JSONObject();
            json.put("result", "OK");
            List<JSONObject> gamesJson = new ArrayList<>();
            for (Mancala game : games) {
                JSONObject gameJson = new JSONObject();
                gameJson.put("player_1", game.getPlayers().get(0).getName());
                gameJson.put("player_2", game.getPlayers().get(1).getName());
                gameJson.put("id", game.getID());
                gamesJson.add(gameJson);
            }
            json.put("games", gamesJson);
            System.out.println("Sending back games: " + gamesJson.toString());
            return json.toString();
        });

        //URL for getting a game with ID 0 : http://localhost:40080/games/0
        get("/games/*", (req, res) -> {
            JSONObject json = new JSONObject();
            json.put("result", "OK");
            JSONObject gameJson = new JSONObject();
            String[] params = req.splat();
            int ID = Integer.parseInt(params[0]);
            for (Mancala game : games) {
                if (game.getID() == ID) {
                    for (Player player : game.getPlayers()) {
                        int index = game.getPlayers().indexOf(player);
                        JSONObject playerJson = new JSONObject();
                        playerJson.put("name", player.getName());
                        JSONObject pitsJson = new JSONObject();
                        for (Pit pit : game.getPits()) {
                            int pitIndex = game.getPits().indexOf(pit);
                            if (pitIndex >= index * 6 && pitIndex < (index + 1) * 6) {
                                JSONObject pitJson = new JSONObject();
                                pitJson.put("pebbles", pit.getPebbles());
                                pitsJson.put("pit_" + pitIndex, pitJson);
                            }
                        }
                        playerJson.put("pits", pitsJson);

                        playerJson.put("playerPit", game.getPlayerPits().get(index).getPebbles());
                        gameJson.put("player_" + index, playerJson);
                    }
                    gameJson.put("playerTurn", game.getPlayerTurn());
                    if (game.getWinnerPlayer() != null) {
                        gameJson.put("winner", game.getWinnerPlayer());
                    }
                    break;
                }
            }
            json.put("game", gameJson);
            System.out.println("Sending back game with ID " + ID + ": " + gameJson.toString());
            return json.toString();
        });

        //URL for sending a move in game 0 by player named 'dave' in pit 3: http://localhost:40080/games/0/dave/3
        post("/games/*/*/*", (req, res) -> {
            String[] params = req.splat();
            String gameId = params[0];
            String playerName = params[1];
            String pitID = params[2];
            System.out.println("Receieved move. Player " + playerName + " triggered pit " + pitID);

            Mancala gameToUpdate = null;
            for (Mancala game : games) {
                if (game.getID() == Integer.parseInt(gameId)) {
                    System.out.println("Updating game " + game.getID());
                    gameToUpdate = game;
                    break;
                }
            }
            updateGame(gameToUpdate, playerName, pitID);
            JSONObject json = new JSONObject();
            json.put("result", "OK");
            return json.toString();
        });

        // Server state updating.
        while (true) {
            try {

                // Check inactivity/challenges etc every 800 milliseconds.
                Thread.sleep(800);

                //Check for inactive players
                //System.out.println("Checking player inactivity for " + players.size() + " active players.");
                Iterator<Player> iter = players.iterator();
                while (iter.hasNext()) {
                    Player player = iter.next();
                    long time = Instant.now().getEpochSecond() - player.getTime().getEpochSecond();
                    //System.out.println("Time for player " + player.getName() + " is " + time);
                    if (Instant.now().getEpochSecond() - player.getTime().getEpochSecond() > DROP_TIME) {
                        System.out.println("Dropping player " + player.getName() + " due to inactivity.");
                        iter.remove();
                    }
                }

                //Check for challenges, remove old ones and create games if needed.

                List<Challenge> challengesToRemove = new ArrayList<>();

                for (Challenge challenge1 : challenges) {
                    for (Challenge challenge2 : challenges) {
                        // Check that the challenges are not identical and that they are not already used up.
                        if (challenge1 != challenge2 && !challengesToRemove.contains(challenge1) && !challengesToRemove.contains(challenge2)) {
                            if (challenge1.player1.equals(challenge2.player2) && challenge2.player1.equals(challenge1.player2)) {
                                System.out.println("Creating game between " + challenge1.player1 + " and " + challenge1.player2);
                                List<Player> twoPlayers = new ArrayList<>();
                                twoPlayers.add(new Player(challenge1.player1));
                                twoPlayers.add(new Player(challenge1.player2));
                                Mancala game = new Mancala(twoPlayers, GAME_COUNTER++);
                                challengesToRemove.add(challenge1);
                                challengesToRemove.add(challenge2);
                                games.add(game);
                                printGameToConsole(game);
                            }
                        }
                    }
                }
                for (Challenge challenge : challengesToRemove) {
                    challenges.remove(challenge);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void updateGame(Mancala game, String playerName, String pitIDString) {
        try {
            int pitID = Integer.parseInt(pitIDString);

            int playerIndex = 0;
            for (Player player : game.getPlayers()) {
                if (player.getName().equals(playerName)) {
                    playerIndex = game.getPlayers().indexOf(player);
                }
            }
            System.out.println("Current player turn should be: " + game.getPlayerTurn() + ". The move was from " + playerName);
            if (!playerName.equals(game.getPlayerTurn())) {
                throw new IllegalArgumentException("Cannot make two turns for the same player unless last pebble ended in Kalah!");
            }
            int pebblesToDistribute = 0;
            for (Pit pit : game.getPits()) {
                int pitIndex = game.getPits().indexOf(pit);
                if (pitIndex == pitID) {
                    pebblesToDistribute = pit.getPebbles();
                    pit.setPebbles(0);
                    break;
                }
            }
            Pit lastDepositedPit = null;
            System.out.println("About to distribute " + pebblesToDistribute + " pebbles from pit " + pitID);
            // Iterate over remaining pebbles.
            int activePitId = pitID;
            for (int i = pebblesToDistribute; i > 0; i--) {
                //System.out.println(i + " pebbles remaining.");
                if (activePitId == 5 || activePitId == 11) {
                    int kalahIndex = activePitId == 5 ? 1 : 0;
                    System.out.println("At playerPit of " + game.getPlayers().get(kalahIndex).getName() + ". Putting a pebble here.");
                    game.getPlayerPits().get(kalahIndex).increment();
                    activePitId++;
                    activePitId %= 12;
                    lastDepositedPit = game.getPlayerPits().get(kalahIndex);
                }
                // Else: regular move: put 1 pit and keep moving to next.
                else {
                    activePitId++;
                    activePitId %= 12;
                    //System.out.println("Depositing pebble at regular pit " + activePitId);
                    game.getPits().get(activePitId).increment();
                    lastDepositedPit = game.getPits().get(activePitId);
                }
            }

            // If the last pebble ends in an empty pit, capture that and pebbles in opposite.
            if (game.getPits().get(activePitId).getPebbles() == 1) {
                int currentPebbles = game.getPlayerPits().get(playerIndex).getPebbles();
                Pit oppositePit = game.getPits().get(getOppositePitId(activePitId));
                int newAmount = currentPebbles + oppositePit.getPebbles();
                System.out.println("Last pebble ended in empty pit. New Kalah pebble count = " + currentPebbles + " + " + oppositePit.getPebbles());
                game.getPlayerPits().get(playerIndex).setPebbles(newAmount);
                oppositePit.setPebbles(0);
                // game.getPits().get(activePitId).setPebbles(0);
            }

            //If last piece ends in Mancala, then player turn is the same.
            if (lastDepositedPit == game.getPlayerPits().get(0) || lastDepositedPit == game.getPlayerPits().get(1)) {
                System.out.println("Last pebble ended in own Mancala, not yielding turn.");
            } else {
                String nextPlayer = game.getPlayerTurn().equals(game.getPlayers().get(0).getName()) ? game.getPlayers().get(1).getName() : game.getPlayers().get(0).getName();
                System.out.println("Yielding turn to other player.");
                game.setPlayerTurn(nextPlayer);
            }
            printGameToConsole(game);

        } catch (
                Exception e) {
            e.printStackTrace();
        }
        int winnerPlayerIndex = -1;
        if (game.getPits().subList(0, 6).stream().mapToInt(Pit::getPebbles).sum() == 0 || game.getPits().subList(6, 12).stream().mapToInt(Pit::getPebbles).sum() == 0) {
            winnerPlayerIndex = game.getPlayerPits().get(0).getPebbles() > game.getPlayerPits().get(1).getPebbles() ? 0 : 1;
        }
        game.setWinnerPlayer(game.getPlayers().get(winnerPlayerIndex).getName());
        System.out.println("GAME WAS WON BY " + game.getWinnerPlayer());
    }

    private static void printGameToConsole(Mancala game) {
        String firstLine = "  ";
        for (int i = 5; i >= 0; i--) {
            firstLine += game.getPits().get(i).getPebbles() + "  ";
        }
        System.out.println(firstLine);

        System.out.println(game.getPlayerPits().get(1).getPebbles() + "                   " + game.getPlayerPits().get(0).getPebbles());

        String secondLine = "  ";
        for (int i = 6; i < 12; i++) {
            secondLine += game.getPits().get(i).getPebbles() + "  ";
        }
        System.out.println(secondLine);
    }

    public static int getOppositePitId(int activePitId) {
        int oppositePitId;
        if (activePitId < 6) {
            oppositePitId = activePitId + ((5 - activePitId) * 2 + 1);
        } else {
            oppositePitId = (activePitId + ((11 - activePitId) * 2 + 1)) % 12;
        }
        System.out.println("Opposite of " + activePitId + " is " + oppositePitId);
        return oppositePitId;
    }
}
