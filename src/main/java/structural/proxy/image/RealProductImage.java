package structural.proxy.image;

import java.awt.*;
import java.awt.image.BufferedImage;

public class RealProductImage implements ProductImage {
    private String imageUrl; // 이미지 URL
    private Image image;

    public RealProductImage(String imageUrl) {
        this.imageUrl = imageUrl;
        loadFromUrl();
    }

    @Override
    public Image loadImage() {
        // 이미지를 실제로 로드하는 코드
        // 이 예시에서는 슬립으로 느린 이미지 로딩을 가정하겠습니다.
        // 이미지가 로드되면 반환
        System.out.println("RealProductImage - Loaded image from URL: " + imageUrl);
        return image;
    }

    private void loadFromUrl() {
        // 이미지를 실제로 로드하는 코드
        // 이 예시에서는 URL을 사용하여 이미지를 다운로드하는 것으로 가정
        // 실제로는 데이터베이스에서 이미지를 가져오거나 외부 서버에 요청하여 이미지를 가져올 수 있음
        try {
            Thread.sleep(1000); // 가정적으로 1초 동안 이미지를 다운로드하는 시간이 소요됨
            // 실제로 이미지를 로드한 후에는 image 변수에 이미지를 저장
            // 이 예시에서는 임시로 이미지를 생성하여 할당
            this.image = createImage();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Image createImage() {
        try {
            // 예시로 이미지를 생성
            BufferedImage bufferedImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
            Graphics graphics = bufferedImage.getGraphics();
            graphics.fillRect(0, 0, 100, 100);
            graphics.dispose();
            return bufferedImage;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
