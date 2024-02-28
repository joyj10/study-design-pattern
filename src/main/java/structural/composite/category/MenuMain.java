package structural.composite.category;

import java.util.ArrayList;
import java.util.List;

public class MenuMain {
    public static void main(String[] args) {
        // 카테고리 및 상품 추가
        Category monitorCategory = new Category("모니터");
        monitorCategory.addProduct(new Product("27인치 모니터", 200000));
        monitorCategory.addProduct(new Product("29인치 모니터", 250000));
        monitorCategory.addProduct(new Product("32인치 모니터", 300000));

        Category keyboardCategory = new Category("키보드");
        keyboardCategory.addProduct(new Product("적축 키보드", 80000));
        keyboardCategory.addProduct(new Product("무접점 키보드", 120000));

        Category mouseCategory = new Category("마우스");
        mouseCategory.addProduct(new Product("버티컬 마우스", 50000));
        mouseCategory.addProduct(new Product("기본 마우스", 10000));

        // 메뉴 세팅
        List<ItemComponent> menu = new ArrayList<>();
        menu.add(monitorCategory);
        menu.add(mouseCategory);
        menu.add(keyboardCategory);

        // 메뉴 카테고리 출력
        System.out.println("=== menu (" + menu.size() + ") ===");
        for (ItemComponent itemComponent : menu) {
            System.out.println("= 상품 수 (" + itemComponent.count() + ") =");
            itemComponent.display();
        }
    }
}
