public class Pit {

    private Player player;
    private int pebbles;

    public Pit(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public int getPebbles() {
        return pebbles;
    }

    public Pit setPebbles(int pebbles) {
        this.pebbles = pebbles;
        return this;
    }

    public void increment() {
        this.pebbles++;
    }
}
