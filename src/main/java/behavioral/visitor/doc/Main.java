package behavioral.visitor.doc;

import behavioral.visitor.doc.visitor.DocumentFormatter;
import behavioral.visitor.doc.visitor.DocumentPrinter;
import behavioral.visitor.doc.visitor.Visitor;

public class Main {
    public static void main(String[] args) {
        //문서 요소 생성
        DocumentElement textElement = new TextElement("Hello. Visitor!");
        DocumentElement imageElement = new ImageElement("https://example.com/image.png");

        //formatter visitor 생성
        Visitor formatter = new DocumentFormatter();
        //print visitor 생성
        Visitor printer = new DocumentPrinter();

        //문서 요소 서식 적용
        textElement.accept(formatter);
        imageElement.accept(formatter);

        //문서 요소 인쇄
        textElement.accept(printer);
        imageElement.accept(printer);
    }
}
