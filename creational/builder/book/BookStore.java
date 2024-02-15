package builder.book;

public class BookStore {
    private BookOrderBuilder bookOrderBuilder;

    public void setBookOrderBuilder(BookOrderBuilder bookOrderBuilder) {
        this.bookOrderBuilder = bookOrderBuilder;
    }

    public BookOrderBuilder getBookOrderBuilder() {
        return bookOrderBuilder;
    }

    public BookOrder order(Book book, int quantity, String address) {
        return bookOrderBuilder.selectBook(book)
                .setQuantity(quantity)
                .setShippingAddress(address)
                .build();
    }
}
