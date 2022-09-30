package structuralPatterns.decorator;

public class ToyCar extends GiftsDecorator{
    public ToyCar(Shop shop) {
        super(shop);
    }
    public int costCar(){
        return 7;
    }

    @Override
    public int cost() {
        return super.cost()+costCar();
    }
}
