package decorator;

import decorator.beverage.*;
import decorator.beverage.extra.Milk;
import decorator.beverage.extra.Mocha;
import decorator.beverage.extra.Whip;

import static decorator.beverage.Beverage.Size.GRANDE;
import static decorator.beverage.Beverage.Size.VENTI;

public class Cafe {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(GRANDE);
        print(beverage);

        Beverage beverage2 = new DarkRoast(VENTI);
        beverage2 = new Milk(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        print(beverage2);
    }

    public static void print(Beverage beverage) {
        System.out.println("# " + beverage.getDescription() +
                ", price : " + beverage.cost());
    }

}
