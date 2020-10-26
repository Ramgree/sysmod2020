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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class GameController {
    @FXML private ArrayList<Label> pits;
    @FXML private Label turnLabel;
    @FXML private Label player1Label;
    @FXML private Label player2Label;
    @FXML private Label player1KalahNameLabel;
    @FXML private Label player2KalahNameLabel;
    @FXML private Label player1KalahNrLabel;
    @FXML private Label player2KalahNrLabel;
    @FXML private Label activePlayerLabel;

    private int game_id;
    private String activePlayer;
    private boolean isActiveTurn;
    private String player1Name;
    private String player2Name;

    @FXML
    public void initialize(){
        Timeline gameLoop = new Timeline();
        gameLoop.setCycleCount( Timeline.INDEFINITE );
        KeyFrame kf = new KeyFrame(
            Duration.seconds(1),
            new EventHandler<ActionEvent>()
            {
                public void handle(ActionEvent ae)
                {
                    try {
                        updateGame();
                    } catch (IOException | JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
        gameLoop.getKeyFrames().add( kf );
        gameLoop.play();
    }

    private void updateGame() throws IOException, JSONException {
        String command = "curl -H \"Content-Type: application/json; charset=UTF-8\"  -X GET  http://localhost:40080/games/" + game_id;
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String response = in.readLine();
        System.out.println("Connection result for the game: " + response);

        JSONObject obj = new JSONObject(response);
        JSONObject game = obj.getJSONObject("game");
        // {"result":"OK",
        // "game":{
        // "player_1":{"playerPit":0,"name":"bob","pits":{"pit_7":{"pebbles":3},"pit_11":{"pebbles":3},
        // "pit_6":{"pebbles":3},"pit_9":{"pebbles":3},"pit_8":{"pebbles":3},"pit_10":{"pebbles":3}}},
        // "player_0":{"playerPit":0,"name":"kk","pits":{"pit_3":{"pebbles":3},"pit_2":{"pebbles":3},
        // "pit_1":{"pebbles":3},"pit_0":{"pebbles":3},"pit_5":{"pebbles":3},"pit_4":{"pebbles":3}}},
        // "playerTurn":"kk"}
        // }

        String playerTurn = game.getString("playerTurn");
        if(playerTurn.equals(activePlayer)){
            isActiveTurn = true;
            turnLabel.setText("It's your turn, make your move.");
        } else {
            isActiveTurn = false;
            turnLabel.setText("It's your opponents turn, please wait.");
        }

        JSONObject player1Board = game.getJSONObject("player_0");
        player1Name = player1Board.getString("name");
        player1Label.setText(player1Name);
        player1KalahNameLabel.setText(player1Name + " Kalah");
        player1KalahNrLabel.setText(player1Board.getString("playerPit"));
        JSONObject player1Pits = player1Board.getJSONObject("pits");
        pits.get(0).setText(player1Pits.getJSONObject("pit_0").getString("pebbles"));
        pits.get(1).setText(player1Pits.getJSONObject("pit_1").getString("pebbles"));
        pits.get(2).setText(player1Pits.getJSONObject("pit_2").getString("pebbles"));
        pits.get(3).setText(player1Pits.getJSONObject("pit_3").getString("pebbles"));
        pits.get(4).setText(player1Pits.getJSONObject("pit_4").getString("pebbles"));
        pits.get(5).setText(player1Pits.getJSONObject("pit_5").getString("pebbles"));

        JSONObject player2Board = game.getJSONObject("player_1");
        player2Name = player2Board.getString("name");
        player2Label.setText(player2Name);
        player2KalahNameLabel.setText(player2Name + " Kalah");
        player2KalahNrLabel.setText(player2Board.getString("playerPit"));
        JSONObject player2Pits = player2Board.getJSONObject("pits");
        pits.get(6).setText(player2Pits.getJSONObject("pit_6").getString("pebbles"));
        pits.get(7).setText(player2Pits.getJSONObject("pit_7").getString("pebbles"));
        pits.get(8).setText(player2Pits.getJSONObject("pit_8").getString("pebbles"));
        pits.get(9).setText(player2Pits.getJSONObject("pit_9").getString("pebbles"));
        pits.get(10).setText(player2Pits.getJSONObject("pit_10").getString("pebbles"));
        pits.get(11).setText(player2Pits.getJSONObject("pit_11").getString("pebbles"));
    }

    public void takeTurn(ActionEvent actionEvent) throws IOException, JSONException {
        int pitID = Integer.parseInt(((Button) actionEvent.getSource()).getId());
        if(isButtonActive(pitID)){
            // Send turn to server
            String command = "curl -H \"Content-Type: application/json; charset=UTF-8\"  -X POST  http://localhost:40080/games/" + game_id + "/" + activePlayer + "/" + pitID;
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String response = in.readLine();
            System.out.println("Connection result for taking a turn: " + response);

            updateGame();
        }

    }

    public void setGame_id(int game_id) throws IOException, JSONException {
        this.game_id = game_id;
        updateGame();
    }

    public void setActivePlayer(String activePlayer) {
        this.activePlayer = activePlayer;
        activePlayerLabel.setText("Player: " + activePlayer);
    }

    private boolean isButtonActive(int id){
        if(isActiveTurn && activePlayer.equals(player1Name) && id >= 0 && id <= 5){
            return true;
        } else if (isActiveTurn && activePlayer.equals(player2Name) && id >= 6 && id <= 11){
            return true;
        } else {
            return false;
        }
    }
}
