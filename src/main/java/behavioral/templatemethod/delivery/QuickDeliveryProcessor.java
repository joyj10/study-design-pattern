package behavioral.templatemethod.delivery;

public class QuickDeliveryProcessor extends DeliveryOrderProcessor {
    @Override
    protected void selectDeliveryMethod() {
        System.out.println("퀵 배송 업체 선택 로직");
    }

    @Override
    protected void deliverItems() {
        System.out.println("퀵 배송 진행");
    }
}
