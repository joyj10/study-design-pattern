import payment.Payment;
import payment.PaymentType;

public class FactoryMain {
    public static void main(String[] args) {
        // 전달 타입에 따라 결제 시스템 타입이 변경
        Payment payment = PaymentFactory.createPayment(PaymentType.KAKAO_PAY);

        payment.connect();
        int price = 10000;
        payment.pay(price);
        payment.cancel(price);
    }
}
