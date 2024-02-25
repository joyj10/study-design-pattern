package creational.abstractfactory.widget.factory;

import creational.abstractfactory.widget.button.Button;
import creational.abstractfactory.widget.button.ClassicButton;
import creational.abstractfactory.widget.textbox.ClassicTextBox;
import creational.abstractfactory.widget.textbox.TextBox;

public class ClassicWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new ClassicButton();
    }

    @Override
    public TextBox createTextBox() {
        return new ClassicTextBox();
    }
}
