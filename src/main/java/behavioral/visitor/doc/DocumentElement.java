package behavioral.visitor.doc;

import behavioral.visitor.doc.visitor.Visitor;

public interface DocumentElement {
    void accept(Visitor visitor);
}
