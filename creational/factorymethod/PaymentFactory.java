import payment.KakaoPay;
import payment.NaverPay;
import payment.Payment;
import payment.PaymentType;

public class PaymentFactory {
    private PaymentFactory() {
        throw new IllegalStateException("Factory class");
    }

    public static Payment createPayment(PaymentType type) {
        return switch (type) {
            case KAKAO_PAY -> new KakaoPay();
            case NAVER_PAY -> new NaverPay();
        };
    }
}
