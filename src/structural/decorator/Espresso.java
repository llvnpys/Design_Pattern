package structural.decorator;

public class Espresso extends Beverage{
    public Espresso() {
        description = "에스프레소";
    }

    @Override
    double cost() {
        return 1.99;
    }
}
