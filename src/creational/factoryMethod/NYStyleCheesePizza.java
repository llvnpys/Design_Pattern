package creational.factoryMethod;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        name = "뉴욕치즈피자";
        dough = "크러스트 도우";
        sauce = "마리나라 소스";

        toppings.add("잘게 썬 레지아노 치즈");
    }
}
