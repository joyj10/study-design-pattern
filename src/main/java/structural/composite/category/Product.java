package structural.composite.category;

public class Product implements ItemComponent {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Product : name = " + name + ", price = " + price);
    }

    @Override
    public int count() {
        return 1;
    }
}
