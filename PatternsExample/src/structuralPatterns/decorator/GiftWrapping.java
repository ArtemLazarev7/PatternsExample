package structuralPatterns.decorator;

public class GiftWrapping implements Shop{
    @Override
    public int cost() {
        return 2;
    }
}
