package abstractfactory.widget.factory;

import abstractfactory.widget.button.Button;
import abstractfactory.widget.textbox.TextBox;

public interface WidgetFactory {
    Button createButton();
    TextBox createTextBox();
}
