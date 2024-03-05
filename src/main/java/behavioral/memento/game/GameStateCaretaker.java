package behavioral.memento.game;

import java.util.ArrayList;
import java.util.List;

public class GameStateCaretaker {
    private List<GameStateMemento> mementos = new ArrayList<>();

    public void addMemento(GameStateMemento memento) {
        mementos.add(memento);
    }

    public GameStateMemento getMemento(int index) {
        return mementos.get(index);
    }
}
