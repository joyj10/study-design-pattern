package behavioral.visitor.doc;

import behavioral.visitor.doc.visitor.Visitor;

public class TextElement implements DocumentElement {
    private String text;

    public TextElement(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
