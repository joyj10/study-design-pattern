package behavioral.command.editor;

import behavioral.command.editor.Command;
import behavioral.command.editor.Editor;

public class InsertTextCommand implements Command {
    private final Editor editor;
    public final String text;

    public InsertTextCommand(Editor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.setContent(editor.getContent() + text);
    }

    @Override
    public void undo() {
        editor.setContent(editor.getContent()
                .substring(0, editor.getContent().length() - text.length()));
    }
}
