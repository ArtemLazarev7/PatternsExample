package generativePatterns.factoryMethod;

public class SushiChef implements Chef {
    @Override
    public void toPrepare() {
        System.out.println("The sushi chef prepares the sushi ");
    }
}
