import character.Character;
import character.CharacterType;
import character.Warrior;
import character.Wizard;

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
