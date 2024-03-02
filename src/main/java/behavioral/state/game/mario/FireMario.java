package behavioral.state.game.mario;

import behavioral.state.game.*;

public class FireMario implements Mario {
    private static final FireMario instance = new FireMario();
    private FireMario() {}

    public static FireMario getInstance() {
        return instance;
    }

    @Override
    public State getName() {
        return State.SUPER;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(SuperMario.getInstance());
        stateMachine.setScore(State.SUPER.getScore());
        System.out.println("파이어 > 슈퍼 마리오로 변신");
    }

    @Override
    public void obtainCape(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(FireMario.getInstance());
        stateMachine.setScore(State.CAPE.getScore());
        System.out.println("파이어 > 망토 마리오로 변신");
    }

    @Override
    public void obtainFireFlower(MarioStateMachine stateMachine) {
        System.out.println("이미 파이어 마리오 입니다.");
    }

    @Override
    public void meetMonster(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(SmallMario.getInstance());
        stateMachine.setScore(State.SMALL.getScore());
        System.out.println("스몰 마리오가 되었습니다.");
    }
}
