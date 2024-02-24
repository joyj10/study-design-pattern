package decorator.beverage.extra;

import decorator.beverage.Beverage;
import decorator.beverage.extra.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + getExtraPrice();
    }

    private double getExtraPrice() {
        return switch (getSize()) {
            case TALL -> 600;
            case GRANDE -> 700;
            case VENTI -> 800;
            default -> 0;
        };
    }
}
