package creational.abstractfactory.widget.factory;

import creational.abstractfactory.widget.button.BlackButton;
import creational.abstractfactory.widget.button.Button;
import creational.abstractfactory.widget.textbox.TextBox;
import creational.abstractfactory.widget.textbox.BlackTextBox;

public class BlackWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new BlackButton();
    }

    @Override
    public TextBox createTextBox() {
        return new BlackTextBox();
    }
}
