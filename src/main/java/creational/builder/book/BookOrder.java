package creational.builder.book;

public class BookOrder {
    private Book book;
    private int quantity;
    private String shippingAddress;

    public BookOrder(Book book, int quantity, String shippingAddress) {
        this.book = book;
        this.quantity = quantity;
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return "BookOrder{" +
                "book=" + book +
                ", quantity=" + quantity +
                ", shippingAddress='" + shippingAddress + '\'' +
                '}';
    }
}
