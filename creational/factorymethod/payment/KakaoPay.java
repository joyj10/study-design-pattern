package payment;

public class KakaoPay implements Payment {
    @Override
    public void connect() {
        System.out.println("payment.KakaoPay.connect");
    }

    @Override
    public void pay(int price) {
        System.out.println("payment.KakaoPay.pay price : " + price);
    }

    @Override
    public void cancel(int price) {
        System.out.println("payment.KakaoPay.cancel price: " + price);
    }
}
