package creational.abstractfactory.widget.factory;

import creational.abstractfactory.widget.button.Button;
import creational.abstractfactory.widget.textbox.TextBox;

public interface WidgetFactory {
    Button createButton();
    TextBox createTextBox();
}
