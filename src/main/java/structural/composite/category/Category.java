package structural.composite.category;

import java.util.ArrayList;
import java.util.List;

public class Category implements ItemComponent {
    private String name;
    private List<ItemComponent> products;
    private int productCount;

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
        this.productCount = 0;
    }

    @Override
    public void display() {
        System.out.println("Category = " + name);
        for (ItemComponent product : products) {
            product.display();
        }
    }

    @Override
    public int count() {
        return productCount;
    }

    public void addProduct(ItemComponent product) {
        products.add(product);
        productCount += product.count();
    }

    public void removeProduct(ItemComponent product) {
        products.remove(product);
        productCount -= product.count();
    }
}
