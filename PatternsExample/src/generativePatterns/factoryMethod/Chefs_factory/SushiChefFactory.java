package generativePatterns.factoryMethod.Chefs_factory;

import generativePatterns.factoryMethod.Chef;
import generativePatterns.factoryMethod.SushiChef;

public class SushiChefFactory implements ChefsFactory{
    @Override
    public Chef getChef() {
        return new SushiChef();
    }
}
