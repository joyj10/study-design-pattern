package creational.abstractfactory.widget.button;

public class ClassicButton implements Button {
    @Override
    public void render() {
        System.out.println("클래식 스타일 버튼 랜더링");
    }

    @Override
    public void click() {
        System.out.println("클래식 스타일 버튼 클릭");
    }
}
