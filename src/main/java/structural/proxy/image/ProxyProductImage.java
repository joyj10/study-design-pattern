package structural.proxy.image;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ProxyProductImage implements ProductImage {
    private String imageUrl; // 이미지 URL
    private RealProductImage realImage; // 실제 이미지 객체
    private static Map<String, Image> cache = new HashMap<>(); // 이미지 캐시

    public ProxyProductImage(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public Image loadImage() {
        // 이미지 캐시에 이미지가 있는지 확인
        if (cache.containsKey(imageUrl)) {
            System.out.println("ProxyProductImage - Loaded image from cache: " + imageUrl);
            return cache.get(imageUrl);
        } else {
            // 이미지가 캐시에 없으면 실제 이미지 로딩
            if (realImage == null) {
                realImage = new RealProductImage(imageUrl);
            }
            // 실제 이미지 로딩 및 캐시에 추가
            Image image = realImage.loadImage();
            cache.put(imageUrl, image);
            return image;
        }
    }
}
