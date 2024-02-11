package payment;

public class KakaoPay implements Payment {
    @Override
    public void connect() {
        System.out.println("payment.KakaoPay.connect");
    }

    @Override
    public void pay(double price) {
        System.out.println("payment.KakaoPay.pay price : " + price);
    }

}
