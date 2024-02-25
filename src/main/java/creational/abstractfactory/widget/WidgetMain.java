package creational.abstractfactory.widget;


import creational.abstractfactory.widget.button.Button;
import creational.abstractfactory.widget.factory.BlackWidgetFactory;
import creational.abstractfactory.widget.factory.ClassicWidgetFactory;
import creational.abstractfactory.widget.textbox.TextBox;

public class WidgetMain {
    public static void main(String[] args) {
        // 클래식 스타일 위젯 생성
        ClassicWidgetFactory classicWidgetFactory = new ClassicWidgetFactory();
        Button classicButton = classicWidgetFactory.createButton();
        TextBox classicTextBox = classicWidgetFactory.createTextBox();

        classicButton.render();
        classicButton.click();
        classicTextBox.render();
        classicTextBox.input("클랙식 위젯!");

        System.out.println("=========");

        // 블랙 스타일 위젯 생성
        BlackWidgetFactory blackWidgetFactory = new BlackWidgetFactory();
        Button blackButton = blackWidgetFactory.createButton();
        TextBox blackTextBox = blackWidgetFactory.createTextBox();

        blackButton.render();
        blackButton.click();
        blackTextBox.render();
        blackTextBox.input("블랙 위젯!");

    }
}
