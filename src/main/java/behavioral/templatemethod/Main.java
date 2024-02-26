package behavioral.templatemethod;

import behavioral.templatemethod.delivery.CourierDeliveryProcessor;
import behavioral.templatemethod.delivery.DeliveryOrderProcessor;
import behavioral.templatemethod.delivery.PickupProcessor;
import behavioral.templatemethod.delivery.QuickDeliveryProcessor;

public class Main {
    public static void main(String[] args) {
        // 직접 수령 주문 처리
        DeliveryOrderProcessor pickupOrderProcessor = new PickupProcessor();
        pickupOrderProcessor.processOrder();

        System.out.println();

        // 택배 배송 주문 처리
        DeliveryOrderProcessor courierOrderProcessor = new CourierDeliveryProcessor();
        courierOrderProcessor.processOrder();

        System.out.println();

        // 퀵 배송 주문 처리
        DeliveryOrderProcessor quickOrderProcessor = new QuickDeliveryProcessor();
        quickOrderProcessor.processOrder();
    }
}
