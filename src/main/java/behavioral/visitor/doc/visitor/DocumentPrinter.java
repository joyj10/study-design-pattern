package behavioral.visitor.doc.visitor;

import behavioral.visitor.doc.ImageElement;
import behavioral.visitor.doc.TextElement;
import behavioral.visitor.doc.visitor.Visitor;

public class DocumentPrinter implements Visitor {
    @Override
    public void visit(TextElement element) {
        System.out.println("Text: " + element.getText());
    }

    @Override
    public void visit(ImageElement element) {
        System.out.println("Image: " + element.getImageUrl());
    }
}
