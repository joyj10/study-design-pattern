package behavioral.state.game.mario;

import behavioral.state.game.MarioStateMachine;
import behavioral.state.game.State;

public class SmallMario implements Mario {
    private static final  SmallMario instance = new SmallMario();
    private SmallMario() {}

    public static SmallMario getInstance() {
        return instance;
    }

    @Override
    public State getName() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(SuperMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() + State.SUPER.getScore());
        System.out.println("스몰 > 슈퍼 마리오로 변신");
    }

    @Override
    public void obtainCape(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(CapeMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() + State.CAPE.getScore());
        System.out.println("스몰 > 망토 마리오로 변신");
    }

    @Override
    public void obtainFireFlower(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(FireMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() + State.FIRE.getScore());
        System.out.println("스몰 > 파이어 마리오로 변신");
    }

    @Override
    public void meetMonster(MarioStateMachine stateMachine) {
        stateMachine.setScore(0);
        System.out.println("마리오가 죽었습니다.");
    }
}
