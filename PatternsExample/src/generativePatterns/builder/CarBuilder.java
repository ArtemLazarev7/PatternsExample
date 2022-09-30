package generativePatterns.builder;

public abstract class CarBuilder {
    Car car;

    public void createCar(){
        car=new Car();
    }
    abstract void buildModel();
    abstract void buildColor();
    abstract void buildPrice();

    Car getCar(){
        return car;
    }
}
