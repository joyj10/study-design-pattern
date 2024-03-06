package creational.prototype.game;

import creational.prototype.game.character.Mage;
import creational.prototype.game.character.Unit;
import creational.prototype.game.character.Warrior;

public class GameMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        //유닛 매니저 생성
        UnitManager unitManager = new UnitManager();

        // 프로토 타입 유닛 등록
        unitManager.addPrototype("warrior", new Warrior("Warrior", 10, 5));
        unitManager.addPrototype("mage", new Mage("Mage", 5, 10));

        System.out.println("===Game Start===");
        //워리어 유닛 생성
        Unit warrior = unitManager.create("warrior");
        warrior.display();
        warrior.performAction();

        //마법사 유닛 생성
        Unit mage = unitManager.create("mage");
        mage.display();
        mage.performAction();
    }
}
