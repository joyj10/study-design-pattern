package behavioral.visitor.doc.visitor;

import behavioral.visitor.doc.ImageElement;
import behavioral.visitor.doc.TextElement;

public interface Visitor {
    void visit(TextElement element);
    void visit(ImageElement element);
}
