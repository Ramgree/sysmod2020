import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Lab5Test3Mary {

    @Test
    public void playMancalaAsMary() throws InterruptedException, IOException, JSONException {

        String response = Lab5Tests.connectToServerAs("Mary");
        Thread.sleep(2500);

        assert !response.equals("null");

        response = Lab5Tests.challengePlayer("Mary", "Dave");

        Thread.sleep(1000);

        assert !response.equals("null");

        while (true) {
            Thread.sleep(2000);
            System.out.println("Woke from Thread.sleep for Mary.");
            int gameId = Lab5Tests.getGameId("Dave", "Mary");
            System.out.println("Mary found gameID " + gameId);
            if (gameId != -1) {
                JSONObject game = Lab5Tests.getGame(gameId);
                System.out.println("Game exists!");
                String playerTurn = game.getString("playerTurn");
                System.out.println("Mary found playerTurn " + playerTurn);
                if (playerTurn.equals("Mary")) {
                    ArrayList<Integer> validPitIds = new ArrayList<>();
                    JSONObject pits = game.getJSONObject("player_1").getJSONObject("pits");
                    for (int i = 6; i < 12; i++) {
                        int pebblesInPit = Integer.parseInt(pits.getJSONObject("pit_" + i).getString("pebbles"));
                        if (pebblesInPit != 0) {
                            validPitIds.add(i);
                        }
                    }
                    System.out.println("Mary has validPits " + validPitIds);
                    if (validPitIds.size() > 0) {
                        System.out.println("My turn! Making a random valid move from " + validPitIds.toString());
                        Lab5Tests.sendMove("Mary", gameId, validPitIds.get(new Random().nextInt(validPitIds.size())));
                    } else {
                        System.out.println("No more valid moves left!");
                    }
                } else {
                    System.out.println("Not Mary's turn yet!");
                }

                if (game.has("winner")) {
                    String winnerPlayer = game.getString("winner");
                    System.out.println(winnerPlayer + " won the game! Exiting!");
                    break;
                }
            }
        }
    }

}
