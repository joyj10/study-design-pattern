package behavioral.state.game;

public class GamePlay {

    public static void main(String[] args) {
        MarioStateMachine marioStateMachine = new MarioStateMachine();
        marioStateMachine.obtainMushRoom();
        marioStateMachine.meetMonster();
        marioStateMachine.obtainFireFlower();
        marioStateMachine.meetMonster();
        marioStateMachine.meetMonster();
    }
}
