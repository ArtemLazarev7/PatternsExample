package structuralPatterns.composite;

public class Goalkeeper implements Player{
    @Override
    public void toPlay() {
        System.out.println("The goalkeeper defends the goal");
    }
}
