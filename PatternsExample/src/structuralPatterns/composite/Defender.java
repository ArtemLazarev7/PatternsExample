package structuralPatterns.composite;

public class Defender implements Player{
    @Override
    public void toPlay() {
        System.out.println("Defender defensively");
    }
}
