package behaviorPatterns.command;

public class StartCommand implements Command{
    Car car;
    public StartCommand(Car car) {
        this.car = car;
    }
    @Override
    public void execute() {
        car.toStart();
    }
}
