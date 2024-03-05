package behavioral.memento.game;

public class GameStateMemento {
    private int level;
    private int health;

    public GameStateMemento(int level, int health) {
        this.level = level;
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }
}
