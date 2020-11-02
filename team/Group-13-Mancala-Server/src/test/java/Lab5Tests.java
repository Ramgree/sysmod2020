import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Lab5Tests {

    /*
    1. This test should show and verify how to capture all pebbles from the opposite pit when ending
    in an empty pit. You can either implement a shortcut web api to create an initial situation or play
    turn by turn to the point that this move is possible and verify the result. Write the scenario/story
    in the comments of your test.
     */

    /**
     * Scenario: Dave and Mary start a new game of Mancala. The 12 side pits are numbered 0 to 11, starting from the
     * top right (near player 1) and moving counter-clockwise. The two player pits are numbered 0 (belonging to player 1)
     * and 1 (belonging to player 2).
     * Dave starts the game and picks up the stones in pit number 3, placing a pebble in pits 4, 5 and Mary's Kalah.
     * Mary picks up pebbles in pit number 6, placing pebbles in pits 7, 8 and 9.
     * Dave then picks up the pebbles in pit number 0, placing pebbles in pits 1, 2 and 3. Since pit number 3 is empty,
     * Dave picks up the 4 pebbles in pit 8 and places them to his Kalah, which will now contain 4 pebbles.
     */
    @Test
    public void captureOppositeTest() {
        Player dave = new Player("Dave");
        Player mary = new Player("Mary");

        List<Player> players = Arrays.asList(dave, mary);
        Mancala game = new Mancala(players, 0);
        WebConnect.updateGame(game, "Dave", "4");
        WebConnect.updateGame(game, "Mary", "6");
        WebConnect.updateGame(game, "Dave", "1");

        // Check that player Dave has 5 pebbles in his Kalah.
        assert(game.getPlayerPits().get(0).getPebbles() == 5);
        assert(game.getPlayerPits().get(1).getPebbles() == 1);

        // The pebble counts in pits should be the following (starting from top right, moving counter clockwise):
        int[] pebbleCount = new int[] {3, 0, 4, 4, 1, 4, 0, 0, 4, 4, 3, 3};
        for (int pitId=0; pitId<12; pitId++) {
            assert(game.getPits().get(pitId).getPebbles() == pebbleCount[pitId]);
        }
    }
    /*
    2. This test should verify that the player gets another turn when landing with the last pebble in the
    current turn in the Kalah. You can either implement a shortcut web api to create an initial situation or
    play turn by turn to the point that this move is possible and verify the result. Write the scenario/story
    in the comments of your test.
     */

    /**
     * Scenario: Dave and Mary start a new game of Mancala.
     * Dave picks up the pebbles in pit 3. Since it has 3 pebbles in the beginning, they are deposited in the pits
     * 4, 5 and Mary's Kalah. Since the last pebble was put inside a Kalah, Dave gets a new turn.
     */
    @Test
    public void getAnotherTurnTest() {
        Player dave = new Player("Dave");
        Player mary = new Player("Mary");

        List<Player> players = Arrays.asList(dave, mary);
        Mancala game = new Mancala(players, 0);
        WebConnect.updateGame(game, "Dave", "3");

        assert(game.getPlayerPits().get(1).getPebbles() == 1);
        assert(game.getPlayerTurn().equals("Dave"));

    }

    /*
    3. This is a two-part test and should play through a whole round of Mancala (yes each turn). Implement
    this as two sub tests, launched in parallel, one for each player. If you did not think of a way to
    synchronize this and wait for each other’s turn yet, define a way to do this and reflect it in your
    API and eventually if necessary even in your data model. Comment the relevant steps in both subtests
    (in story style - less detailed than in the previous tasks).
     */
    /*
    @Test
    public void Lab5Test3() throws InterruptedException {
        Result result = JUnitCore.runClasses(ParallelComputer.methods(), Lab5Test3Dave.class);
        System.out.print(result.wasSuccessful());
    }
    */

    public static String connectToServerAs(String name) throws IOException {
        String command = "curl -H \"Content-Type: application/json; charset=UTF-8\"  -X POST  http://localhost:40080/add_player/" + name;
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String response = in.readLine();
        System.out.println("Connection result for " + name + ": " + response);
        return response;
    }

    public static String challengePlayer(String challenger, String challengee) throws IOException {
        String command = "curl -H \"Content-Type: application/json; charset=UTF-8\"  -X POST  http://localhost:40080/add_challenge/"
                + challenger + "/" + challengee;
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String response = in.readLine();
        System.out.println("Add challenge result for " + challenger + " -> " + challengee + ": " + response);
        return response;
    }

    public static int getGameId(String player1, String player2) throws IOException, JSONException {
        String command = "curl -H \"Content-Type: application/json; charset=UTF-8\"  -X GET  http://localhost:40080/games";
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String response = in.readLine();
        System.out.println("Response for /games: " + response);
        //{"result":"OK","games":[{"player_1":"Mary","player_2":"Dave","id":0}]}
        JSONObject obj = new JSONObject(response);
        JSONArray games = obj.getJSONArray("games");
        for (int i = 0; i < games.length(); i++) {
            String player1Json = games.getJSONObject(i).getString("player_1");
            String player2Json = games.getJSONObject(i).getString("player_2");
            if (player1Json.equals(player1) && player2Json.equals(player2) || player1Json.equals(player2) && player2Json.equals(player1)) {
                return games.getJSONObject(i).getInt("id");
            }
        }
        return -1;
    }

    public static JSONObject getGame(int id) throws IOException, JSONException {
        String command = "curl -H \"Content-Type: application/json; charset=UTF-8\"  -X GET  http://localhost:40080/games/" + id;
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String response = in.readLine();
        System.out.println("Response for /games/ " + id + " is " + response);
        return new JSONObject(response).getJSONObject("game");
    }

    public static void sendMove(String player, int gameID, int pitNumber) throws IOException, JSONException {
        String values = gameID + "/" + player + "/" + pitNumber;
        String command = "curl -H \"Content-Type: application/json; charset=UTF-8\"  -X POST  http://localhost:40080/games/" + values;
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String response = in.readLine();
        System.out.println("Response for sent move: " + response);
    }
}
