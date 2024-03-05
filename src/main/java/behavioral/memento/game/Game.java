package behavioral.memento.game;

public class Game {
    private int level = 1;
    private int health = 100;

    public void play() {
        // 플레이 진행 시 level, health 변경
        level++;
        health -= 10;
    }

    public GameStateMemento saveState() {
        return new GameStateMemento(level, health);
    }

    public void restoreState(GameStateMemento memento) {
        this.level = memento.getLevel();
        this.health = memento.getHealth();
    }

    public void displayState() {
        System.out.println("Level: " + level);
        System.out.println("Health: " + health);
        System.out.println("======");
    }
}
