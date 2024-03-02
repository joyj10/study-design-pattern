package behavioral.state.game.mario;

import behavioral.state.game.MarioStateMachine;
import behavioral.state.game.State;

public interface Mario {
    State getName();

    void obtainMushRoom(MarioStateMachine stateMachine);
    void obtainCape(MarioStateMachine stateMachine);
    void obtainFireFlower(MarioStateMachine stateMachine);
    void meetMonster(MarioStateMachine stateMachine);
}
