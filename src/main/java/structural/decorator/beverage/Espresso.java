package structural.decorator.beverage;

public class Espresso extends Beverage {
    public Espresso(Size size) {
        this.description = "에스프레소";
        setSize(size);
    }

    @Override
    public double cost() {
        return getPrice();
    }

    private double getPrice() {
        return switch (getSize()) {
            case TALL -> 3500;
            case GRANDE -> 3800;
            case VENTI -> 4100;
            default -> 0;
        };
    }
}
