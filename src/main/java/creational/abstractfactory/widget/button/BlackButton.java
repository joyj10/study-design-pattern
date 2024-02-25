package creational.abstractfactory.widget.button;

public class BlackButton implements Button {
    @Override
    public void render() {
        System.out.println("블랙 스타일 버튼 랜더링");
    }

    @Override
    public void click() {
        System.out.println("블랙 스타일 버튼 클릭");
    }
}
