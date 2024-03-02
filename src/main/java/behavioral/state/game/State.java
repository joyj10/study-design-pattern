package behavioral.state.game;

public enum State {
    SMALL(0, 0),
    SUPER(1, 100),
    FIRE(2, 300),
    CAPE(3, 200),
    ;

    private int value;
    private int score;

    private State(int value, int score) {
        this.value = value;
        this.score = score;
    }

    public int getValue() {
        return value;
    }

    public int getScore() {
        return score;
    }
}
