package abstractfactory.widget.factory;

import abstractfactory.widget.button.Button;
import abstractfactory.widget.textbox.TextBox;
import abstractfactory.widget.button.BlackButton;
import abstractfactory.widget.textbox.BlackTextBox;

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
