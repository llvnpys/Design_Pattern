package creational.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare(){
        System.out.println("준비중 :" + name);
        System.out.println("도우");
        System.out.println("소스");
        System.out.println("토핑");
        for (String topping : toppings) {
            System.out.println(topping);
        }
    }

    void bake(){
        System.out.println("굽기");
    }

    void cut(){
        System.out.println("자르기");
    }
    void box(){
        System.out.println("담기");
    }

    public String getName() {
        return name;
    }
}
