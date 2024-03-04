package structural.flyweight.textstyle;

public class Main {
    public static void main(String[] args) {
        TextStyleFactory factory = new TextStyleFactory();

        // 플라이웨이트 통해 텍스트 스타일링 적용
        TextStyle style1 = factory.getStyle("맑은고딕", 12, "Red");
        style1.applyStyle("Hello");

        TextStyle style2 = factory.getStyle("맑은고딕", 12, "Red");
        style2.applyStyle("Flyweight");

        TextStyle style3 = factory.getStyle("맑은고딕", 12, "Black");
        style3.applyStyle("Black Hello");

        // 동일 스타일 가진 객체 공유
        System.out.println("style1 == style2 : " + (style1 == style2));
        System.out.println("style1 == style3 : " + (style1 == style3));
    }
}
