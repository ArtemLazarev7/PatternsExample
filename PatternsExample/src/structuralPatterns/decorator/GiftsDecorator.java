package structuralPatterns.decorator;

public class GiftsDecorator implements Shop{
    Shop shop;

    public GiftsDecorator(Shop shop) {
        this.shop = shop;
    }

    @Override
    public int cost() {
        return shop.cost();
    }
}
