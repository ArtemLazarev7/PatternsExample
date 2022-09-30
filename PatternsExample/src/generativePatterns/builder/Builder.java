package generativePatterns.builder;

public class Builder {
    CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }
    Car buildCar(){
        carBuilder.createCar();
        carBuilder.buildModel();
        carBuilder.buildColor();
        carBuilder.buildPrice();

        Car car= carBuilder.getCar();
        return car;
    }
}
