package payment;

public interface Payment {
    void connect();
    void pay(int price);
    void cancel(int price);
}
