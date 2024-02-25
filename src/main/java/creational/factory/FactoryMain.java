package creational.factory;

import creational.factory.character.Character;
import creational.factory.character.CharacterType;

public class FactoryMain {
    public static void main(String[] args) {
        // 마법사 캐릭터 생성 후 공격
        Character character = CharacterFactory.createCharacter(CharacterType.WIZARD);
        character.attack();
    }
}
