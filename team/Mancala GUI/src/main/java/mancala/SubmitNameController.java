package mancala;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubmitNameController {
    @FXML
    private TextField nameField;

    public void joinLobby(ActionEvent actionEvent) throws IOException, JSONException {
        String playerName = nameField.getText();
        if (!playerName.equals("")){
            // create new window
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("lobby.fxml"));
            stage.setTitle("Lobby");
            stage.setScene(new Scene(loader.load(), 300, 275));
            stage.show();

            connectToServerAs(playerName);

            LobbyController lobbyController = loader.getController();
            lobbyController.setPlayerName(playerName);

            // close last window
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
        }
    }

    private String connectToServerAs(String name) throws IOException {
        String command = "curl -H \"Content-Type: application/json; charset=UTF-8\"  -X POST  http://localhost:40080/add_player/" + name;
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String response = in.readLine();
        System.out.println("Connection result for " + name + ": " + response);
        return response;
    }
}
