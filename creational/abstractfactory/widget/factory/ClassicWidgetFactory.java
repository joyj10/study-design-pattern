package abstractfactory.widget.factory;

import abstractfactory.widget.button.Button;
import abstractfactory.widget.button.ClassicButton;
import abstractfactory.widget.textbox.ClassicTextBox;
import abstractfactory.widget.textbox.TextBox;

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
