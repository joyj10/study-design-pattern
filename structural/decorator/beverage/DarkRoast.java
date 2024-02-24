package decorator.beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(Size size) {
        description = "진한 맛의 다크 로스트 커피";
        setSize(size);
    }

    @Override
    public double cost() {
        return getPrice();
    }

    private double getPrice() {
        return switch (getSize()) {
            case TALL -> 3000;
            case GRANDE -> 3300;
            case VENTI -> 3600;
            default -> 0;
        };
    }
}
