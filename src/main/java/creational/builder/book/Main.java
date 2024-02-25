package creational.builder.book;

public class Main {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        bookStore.setBookOrderBuilder(new OnlineBookOrderBuilder());

        Book book = new Book("디자인 패턴", "김패턴", "출판사A", 20000);
        BookOrder bookOrder = bookStore.order(book, 1, "판교");
        System.out.println("== 주문 완료 : " + bookOrder);
    }
}
