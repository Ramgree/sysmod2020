import java.time.Instant;

public class Player {
    private String name;
    private Instant time;
    private Pit pit;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Instant getTime() {
        return this.time;
    }

    public Player withTime(Instant time) {
        this.time = time;
        return this;
    }
}
