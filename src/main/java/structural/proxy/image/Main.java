package structural.proxy.image;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // 프록시를 사용하여 이미지 캐싱 예시 실행
        ProductImage productImage = new ProxyProductImage("https://example.com/image.jpg");
        // 이미지를 로드하면서 이미지 캐싱도 수행됨
        Image image = productImage.loadImage();
    }
}
