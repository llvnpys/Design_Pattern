package structural.decorator;

public abstract class Beverage {
    String description = "";

    public String getDescription() {
        return description;
    }

    abstract double cost();
}
