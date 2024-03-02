package behavioral.state.game;

import behavioral.state.game.mario.Mario;
import behavioral.state.game.mario.SmallMario;

public class MarioStateMachine {
    private int score;
    private Mario currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = SmallMario.getInstance();
    }

    public void obtainMushRoom() {
        System.out.println();
        System.out.println("버섯을 먹었습니다.");
        this.currentState.obtainMushRoom(this);
    }

    public void obtainCape() {
        System.out.println();
        System.out.println("망토를 먹었습니다.");
        this.currentState.obtainCape(this);
    }

    public void obtainFireFlower() {
        System.out.println();
        System.out.println("불꽃을 먹었습니다.");
        this.currentState.obtainFireFlower(this);
    }

    public void meetMonster() {
        System.out.println();
        System.out.println("몬스터를 만났습니다.");
        this.currentState.meetMonster(this);
    }

    public int getScore() {
        return score;
    }

    public Mario getCurrentState() {
        return currentState;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setCurrentState(Mario currentState) {
        this.currentState = currentState;
    }
}
