package structural.flyweight.textstyle;

import java.util.HashMap;
import java.util.Map;

public class TextStyleFactory {
    private Map<String, TextStyle> styles = new HashMap<>();

    public TextStyle getStyle(String font, int size, String color) {
        String key = font + size + color;
        return styles.computeIfAbsent(key, k -> new TextStyle(font, size, color));
    }
}
