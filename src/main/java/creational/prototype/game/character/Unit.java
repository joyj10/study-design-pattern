package creational.prototype.game.character;

public abstract class Unit implements Cloneable {
    private String name;
    private int attack;
    private int defense;

    public Unit(String name, int attack, int defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

    @Override
    public Unit clone() throws CloneNotSupportedException {
        return (Unit) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
    }

    public abstract void performAction();
}
