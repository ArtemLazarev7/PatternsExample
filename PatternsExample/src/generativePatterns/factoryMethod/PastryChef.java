package generativePatterns.factoryMethod;

public class PastryChef implements Chef {
    @Override
    public void toPrepare() {
        System.out.println("The pastry chef prepares the cake");
    }
}
