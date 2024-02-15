package builder.book;

import builder.book.Book;
import builder.book.BookOrder;
import builder.book.BookOrderBuilder;

public class OnlineBookOrderBuilder implements BookOrderBuilder {
    private Book book;
    private int quantity;
    private String shippingAddress;

    @Override
    public BookOrderBuilder selectBook(Book book) {
        this.book = book;
        return this;
    }

    @Override
    public BookOrderBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    @Override
    public BookOrderBuilder setShippingAddress(String address) {
        this.shippingAddress = address;
        return this;
    }

    @Override
    public BookOrder build() {
        return new BookOrder(book, quantity, shippingAddress);
    }
}
