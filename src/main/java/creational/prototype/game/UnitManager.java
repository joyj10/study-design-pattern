package creational.prototype.game;

import creational.prototype.game.character.Unit;

import java.util.HashMap;
import java.util.Map;

public class UnitManager {
    private Map<String, Unit> prototypes = new HashMap<>();

    public void addPrototype(String key, Unit prototype) {
        prototypes.put(key, prototype);
    }

    public Unit create(String key) throws CloneNotSupportedException {
        Unit prototype = prototypes.get(key);
        if (prototype != null) {
            return prototype.clone();
        }
        return null;
    }
}
