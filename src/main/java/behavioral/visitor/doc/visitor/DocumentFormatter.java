package behavioral.visitor.doc.visitor;

import behavioral.visitor.doc.ImageElement;
import behavioral.visitor.doc.TextElement;
import behavioral.visitor.doc.visitor.Visitor;

public class DocumentFormatter implements Visitor {
    @Override
    public void visit(TextElement element) {
        System.out.println("Formatting text: " + element.getText());
        // 텍스트를 서식을 적용하여 출력하는 로직
    }

    @Override
    public void visit(ImageElement element) {
        System.out.println("Formatting image: " + element.getImageUrl());
        // 이미지를 서식을 적용하여 출력하는 로직
    }
}
