package structural.decorator;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "다크 로스트 커피";
    }

    @Override
    double cost() {
        return 2.99;
    }
}
