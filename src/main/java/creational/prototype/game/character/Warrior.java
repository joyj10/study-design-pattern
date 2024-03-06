package creational.prototype.game.character;

public class Warrior extends Unit {
    public Warrior(String name, int attack, int defense) {
        super(name, attack, defense);
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " attacks with sword!");
    }
}
