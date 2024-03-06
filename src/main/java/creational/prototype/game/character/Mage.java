package creational.prototype.game.character;

public class Mage extends Unit {
    public Mage(String name, int attack, int defense) {
        super(name, attack, defense);
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " casts a fireball!");
    }
}
