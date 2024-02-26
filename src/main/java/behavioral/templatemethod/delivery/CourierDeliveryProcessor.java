package behavioral.templatemethod.delivery;

public class CourierDeliveryProcessor extends DeliveryOrderProcessor {
    @Override
    protected void selectDeliveryMethod() {
        System.out.println("택배 배송 방법 선택 로직");
    }

    @Override
    protected void deliverItems() {
        System.out.println("상품 택배 배송");
    }
}
