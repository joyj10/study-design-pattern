package command.editor;

public class EditorMain {
    public static void main(String[] args) {
        Editor editor = new Editor();

        // 텍스트 추가 커맨드 실행
        Command insertCommand1 = new InsertTextCommand(editor, "Hello design ");
        editor.executeCommand(insertCommand1);
        print("에디터 텍스트 추가 : ", editor);

        // 두 번째 텍스트 추가 커맨드 실행
        Command insertCommand2 = new InsertTextCommand(editor, "world!");
        editor.executeCommand(insertCommand2);
        print("에디터 텍스트 추가 : ", editor);

        // 삭제 커맨드 실행
        Command deleteCommand = new DeleteTextCommand(editor, 16, 19);
        editor.executeCommand(deleteCommand);
        print("에디터 텍스트 삭제 : ", editor);

        // 실행 취소 1
        editor.undoLastCommand();
        print("에디터 실행 취소 : ", editor);

        // 실행 취소 2
        editor.undoLastCommand();
        print("에디터 실행 취소 : ", editor);
    }

    public static void print(String prefix, Editor editor) {
        System.out.println(prefix + editor.getContent());
    }
}
