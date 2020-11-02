import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mancala {

    private String playerTurn;
    private List<Player> players;
    private int ID;
    private List<Pit> pits;
    private List<Pit> playerPits;
    private String winnerPlayer = null;


    public String getWinnerPlayer() {
        return winnerPlayer;
    }

    public void setWinnerPlayer(String winnerPlayer) {
        this.winnerPlayer = winnerPlayer;
    }

    public Mancala(List<Player> players, int ID) {
        this.players = players;
        playerTurn = players.get(0).getName();
        this.ID = ID;
        this.pits = new ArrayList<>();
        for (int i=0; i<6; i++) {
            this.pits.add(new Pit(players.get(0)).setPebbles(3));
        }
        for (int i=0; i<6; i++) {
            this.pits.add(new Pit(players.get(1)).setPebbles(3));
        }
        //System.out.println("Created a game with " + this.pits.size() + " pits total, with players " + players.get(0).getName() + " and " + players.get(1).getName());

        this.playerPits = new ArrayList<>();
        this.playerPits.add(new Pit(players.get(0)).setPebbles(0));
        this.playerPits.add(new Pit(players.get(1)).setPebbles(0));
    }

    public String getPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(String playerTurn) {
        this.playerTurn = playerTurn;
    }

    public Player getPlayerByName(String name) {
        for (Player player: players) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getID() {
        return this.ID;
    }

    public List<Pit> getPits() {
        return this.pits;
    }

    public List<Pit> getPlayerPits() {
        return playerPits;
    }
}
