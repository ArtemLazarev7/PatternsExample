package generativePatterns.factoryMethod;

import generativePatterns.factoryMethod.Chefs_factory.ChefsFactory;
import generativePatterns.factoryMethod.Chefs_factory.PastryChefFactory;
import generativePatterns.factoryMethod.Chefs_factory.PizzaChefFactory;
import generativePatterns.factoryMethod.Chefs_factory.SushiChefFactory;

public class CafeSmile {
    public static void main(String[] args) {
       ChefsFactory chefsFactory=callChefBySpeciality(Menu.PIZZA);
       Chef chef=chefsFactory.getChef();

       chef.toPrepare();
    }
    static ChefsFactory callChefBySpeciality(Menu dish) {
        if (dish.equals(Menu.PIZZA)) {
            return new PizzaChefFactory();
        }
        if (dish.equals(Menu.SUSHI)) {
            return new SushiChefFactory();
        }if(dish.equals(Menu.CAKE)){
            return new PastryChefFactory();
        }
        else {
            throw new RuntimeException("This dish "+dish+" is not on the menu");
        }
    }
}
