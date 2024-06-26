package structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + " cost : " + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Milk(beverage1);

        System.out.println(beverage1.getDescription() + " cost : " + beverage1.cost());
    }
}
