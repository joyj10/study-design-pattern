package command.editor;

public class DeleteTextCommand implements Command {
    private final Editor editor;
    private final String deletedText;
    private final int startIndex;

    public DeleteTextCommand(Editor editor, int startIndex, int endIndex) {
        this.editor = editor;
        this.deletedText = editor.getContent().substring(startIndex, endIndex);
        this.startIndex = startIndex;
    }

    @Override
    public void execute() {
        editor.setContent(editor.getContent().replace(deletedText, ""));
    }

    @Override
    public void undo() {
        StringBuilder sb = new StringBuilder(editor.getContent());
        sb.insert(startIndex, deletedText);
        editor.setContent(sb.toString());
    }
}
