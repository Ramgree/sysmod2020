import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Lab5Test3Dave {

    @Test
    public void playMancalaAsDave() throws InterruptedException, IOException, JSONException {

        String response = Lab5Tests.connectToServerAs("Dave");
        Thread.sleep(500);

        assert !response.equals("null");

        response = Lab5Tests.challengePlayer("Dave", "Mary");

        Thread.sleep(500);

        assert !response.equals("null");

        while (true) {
            Thread.sleep(2000);
            System.out.println("Woke from Thread.sleep for Dave.");
            int gameId = Lab5Tests.getGameId("Dave", "Mary");
            if (gameId != -1) {
                JSONObject game = Lab5Tests.getGame(gameId);
                System.out.println("Game exists!");
                if (game.getString("playerTurn").equals("Dave")) {
                    ArrayList<Integer> validPitIds = new ArrayList<>();
                    JSONObject pits = game.getJSONObject("player_0").getJSONObject("pits");
                    for (int i = 0; i < 6; i++) {
                        int pebblesInPit = Integer.parseInt(pits.getJSONObject("pit_" + i).getString("pebbles"));
                        if (pebblesInPit != 0) {
                            validPitIds.add(i);
                        }
                    }
                    if (validPitIds.size() > 0) {
                        System.out.println("My turn! Making a random valid move from " + validPitIds.toString());
                        Lab5Tests.sendMove("Dave", gameId, validPitIds.get(new Random().nextInt(validPitIds.size())));
                    } else {
                        System.out.println("No more valid moves left!");
                    }
                } else {
                    System.out.println("Not Dave's turn yet!");
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
