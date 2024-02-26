package behavioral.templatemethod.delivery;

public abstract class DeliveryOrderProcessor {
    // 템플릿 메서드: 배송 주문 처리 과정을 정의
    public final void processOrder() {
        confirmPayment();
        selectDeliveryMethod();
        prepareItems();
        deliverItems();
    }

    // 결제 확인 단계
    protected void confirmPayment() {
        System.out.println("결제 확인 로직");
    }

    // 배송 방법 선택 단계
    protected abstract void selectDeliveryMethod();

    // 상품 준비 단계
    protected void prepareItems() {
        System.out.println("상품 준비 로직");
    }

    // 상품 배송 단계
    protected abstract void deliverItems();
}
