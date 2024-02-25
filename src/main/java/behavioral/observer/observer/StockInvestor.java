package behavioral.observer.observer;

public class StockInvestor implements StockObserver {
    private String name;

    public StockInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("# update name = " + name + ", stockName = " + stockName + ", price = " + price);
    }
}
