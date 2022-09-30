package structuralPatterns.facade;

public class FacadeAction {
    Car car=new Car();
    Engine engine=new Engine();
    Driver driver=new Driver();
    public void startDrive(){
        car.toRun();
        engine.started();
        driver.toDrive(engine);
    }
    public void stopDrive(){
        car.toRun();
        engine.stopped();
        driver.toDrive(engine);
    }
}
