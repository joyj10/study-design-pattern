package abstractfactory.widget.textbox;

public class BlackTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("블랙 스타일 텍스트 박스 랜더링");
    }

    @Override
    public void input(String text) {
        System.out.println("블랙 스타일 텍스트 박스 입력 : " + text);

    }
}
