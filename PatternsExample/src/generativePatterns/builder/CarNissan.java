package generativePatterns.builder;

public class CarNissan extends CarBuilder{
    @Override
    void buildModel() {
        car.setModel(Model.NISSAN);
    }

    @Override
    void buildColor() {
car.setColor("Blue");
    }

    @Override
    void buildPrice() {
car.setPrice(5000);
    }
}
