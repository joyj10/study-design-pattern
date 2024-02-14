package abstractfactory.widget.textbox;

public class ClassicTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("클래식 스타일 텍스트 박스 랜더링");
    }

    @Override
    public void input(String text) {
        System.out.println("클래식 스타일 텍스트 박스 입력 : " + text);

    }
}
