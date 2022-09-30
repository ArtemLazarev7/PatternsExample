package generativePatterns.factoryMethod;

public class PizzaChef implements Chef {
    @Override
    public void toPrepare() {
        System.out.println("The pizza chef prepares the pizza");
    }
}
