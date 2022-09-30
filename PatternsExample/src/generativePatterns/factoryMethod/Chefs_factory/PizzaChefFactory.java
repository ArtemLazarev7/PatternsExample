package generativePatterns.factoryMethod.Chefs_factory;

import generativePatterns.factoryMethod.Chef;
import generativePatterns.factoryMethod.PizzaChef;

public class PizzaChefFactory implements ChefsFactory{
    @Override
    public Chef getChef() {
        return new PizzaChef();
    }
}
