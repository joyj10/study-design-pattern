package behavioral.state.game.mario;

import behavioral.state.game.MarioStateMachine;
import behavioral.state.game.State;

public class SuperMario implements Mario {
    private static final SuperMario instance = new SuperMario();
    private SuperMario() {}

    public static SuperMario getInstance() {
        return instance;
    }

    @Override
    public State getName() {
        return State.SUPER;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine stateMachine) {
        System.out.println("이미 슈퍼 마리오 입니다.");
    }

    @Override
    public void obtainCape(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(CapeMario.getInstance());
        stateMachine.setScore(200);
        System.out.println("슈퍼 > 망토 마리오로 변신");
    }

    @Override
    public void obtainFireFlower(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(FireMario.getInstance());
        stateMachine.setScore(300);
        System.out.println("슈퍼 > 파이어 마리오로 변신");
    }

    @Override
    public void meetMonster(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(SmallMario.getInstance());
        stateMachine.setScore(State.SMALL.getScore());
        System.out.println("스몰 마리오가 되었습니다.");
    }
}
