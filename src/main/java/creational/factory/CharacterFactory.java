package creational.factory;

import creational.factory.character.Character;
import creational.factory.character.CharacterType;
import creational.factory.character.Warrior;
import creational.factory.character.Wizard;

public class CharacterFactory {
    private CharacterFactory() {
        throw new IllegalStateException("Factory class");
    }

    public static Character createCharacter(CharacterType type) {
        return switch (type) {
            case WARRIOR -> new Warrior();
            case WIZARD -> new Wizard();
        };
    }
}
