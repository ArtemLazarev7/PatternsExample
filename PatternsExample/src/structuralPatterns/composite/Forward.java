package structuralPatterns.composite;

public class Forward implements Player {
    @Override
    public void toPlay() {
        System.out.println("Forward  attacks another's goal");
    }
}
