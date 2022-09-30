package generativePatterns.builder;

public class CarBmw extends CarBuilder{
    @Override
    void buildModel() {
        car.setModel(Model.BMW);
    }

    @Override
    void buildColor() {
        car.setColor("Red");

    }

    @Override
    void buildPrice() {
        car.setPrice(1000);

    }
}
