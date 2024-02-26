package behavioral.templatemethod.delivery;

public class PickupProcessor extends DeliveryOrderProcessor {
    @Override
    protected void selectDeliveryMethod() {
        System.out.println("직접 수령 배송 선택 로직");
    }

    @Override
    protected void deliverItems() {
        System.out.println("직접 수령");
    }
}
