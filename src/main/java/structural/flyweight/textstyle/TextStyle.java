package structural.flyweight.textstyle;

public class TextStyle {
    private String font;
    private int size;
    private String color;

    public TextStyle(String font, int size, String color) {
        this.font = font;
        this.size = size;
        this.color = color;
    }

    public void applyStyle(String text) {
        System.out.println("Applying style - Font: " + font + ", Size: " + size +
                ", Color: " + color + " to text: " + text);
    }
}
