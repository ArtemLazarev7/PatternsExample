package generativePatterns.factoryMethod.Chefs_factory;

import generativePatterns.factoryMethod.Chef;
import generativePatterns.factoryMethod.PastryChef;

public class PastryChefFactory implements ChefsFactory{
    @Override
    public Chef getChef() {
        return new PastryChef();
    }
}
