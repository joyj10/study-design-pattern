package creational.builder.book;

public interface BookOrderBuilder {
    BookOrderBuilder selectBook(Book book);
    BookOrderBuilder setQuantity(int quantity);
    BookOrderBuilder setShippingAddress(String address);
    BookOrder build();
}
