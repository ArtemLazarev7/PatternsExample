package structuralPatterns.decorator;

public class TeddyBear extends GiftsDecorator{
    public TeddyBear(Shop shop) {
        super(shop);
    }
    public int costTeddy(){
        return 5;
    }

    @Override
    public int cost() {
        return super.cost()+costTeddy();
    }
}
