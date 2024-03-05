package behavioral.memento.game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        GameStateCaretaker caretaker = new GameStateCaretaker();

        // 게임 진행
        game.play();
        game.displayState();

        // 게임 자동 저장
        caretaker.addMemento(game.saveState());

        // 게임 진행 중 + 강제 종료
        System.out.println("게임 진행 중 + 강제 종료");
        game.play();
        game.displayState();

        // 게임 상태 복원
        System.out.println("마지막 저장 상태로 복원");
        game.restoreState(caretaker.getMemento(0));
        game.displayState();
    }
}
