package mancala;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LobbyController {
    @FXML
    private ListView playerListView;
    @FXML
    private Label nameLabel;

    private String playerName;
    private boolean gameHasStarted = false;

    @FXML
    public void initialize() throws IOException, JSONException {
        playerListView.setItems(fetchPlayers());

        // loop that is run every second
        Timeline gameLoop = new Timeline();
        gameLoop.setCycleCount( Timeline.INDEFINITE );
        KeyFrame kf = new KeyFrame(
            Duration.seconds(1),
            new EventHandler<ActionEvent>()
            {
                public void handle(ActionEvent ae)
                {
                    try {
                        playerListView.setItems(fetchPlayers());

                        if(gameHasStarted){
                            gameLoop.stop();
                        } else {
                            checkGameStart(); // Opens the game window if a game has started
                        }
                    } catch (IOException | JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
        gameLoop.getKeyFrames().add( kf );
        gameLoop.play();
    }

    public void challenge(ActionEvent actionEvent) throws IOException {
        String selectedPlayerName = (String)playerListView.getSelectionModel().getSelectedItem();
        System.out.println(selectedPlayerName);

        if(selectedPlayerName != null) {
            sendChallengeToServer(playerName, selectedPlayerName);
        }
    }

    public void setPlayerName(String playerName) throws IOException, JSONException {
        this.playerName = playerName;
        nameLabel.setText("Challenge someone, " + this.playerName + "!");
        checkGameStart();
    }

    private ObservableList fetchPlayers() throws IOException, JSONException {
        String command = "curl -H \"Content-Type: application/json; charset=UTF-8\"  -X GET  http://localhost:40080/players";
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String response = in.readLine();
        System.out.println("Connection result for /players: " + response);

        JSONObject obj = new JSONObject(response);
        JSONArray names = obj.getJSONArray("names");

        ObservableList<String> players = FXCollections.observableArrayList();

        for (int i = 0; i < names.length(); i++) {
            String player = names.getString(i);
            if(!player.equals(this.playerName)) {
                players.add(player);
            }
        }

        return players;
    }

    private String sendChallengeToServer(String player1, String player2) throws IOException {
        String command = "curl -H \"Content-Type: application/json; charset=UTF-8\"  -X POST  http://localhost:40080/add_challenge/" + player1 + "/" + player2;
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String response = in.readLine();
        System.out.println("Connection result for adding challenge against " + player2 + ": " + response);
        return response;
    }

    private void checkGameStart() throws IOException, JSONException {
        String command = "curl -H \"Content-Type: application/json; charset=UTF-8\"  -X GET  http://localhost:40080/games";
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String response = in.readLine();
        System.out.println("Connection result for /games: " + response);

        JSONObject obj = new JSONObject(response);
        JSONArray games = obj.getJSONArray("games");

        int id = -1;
        for (int i = 0; i < games.length(); i++) {
            String player1Json = games.getJSONObject(i).getString("player_1");
            String player2Json = games.getJSONObject(i).getString("player_2");
            if (player1Json.equals(playerName) || player2Json.equals(playerName)){
                id = Integer.parseInt(games.getJSONObject(i).getString("id"));
            }
        }

        if(id != -1) {
            // create new window
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
            stage.setTitle("Mancala");
            stage.setScene(new Scene(loader.load(), 700, 300));
            stage.show();

            GameController gameController = loader.getController();
            gameController.setActivePlayer(playerName);
            gameController.setGame_id(id);

            // close last window
            playerListView.getScene().getWindow().hide();

            gameHasStarted = true;
        }
    }
}
