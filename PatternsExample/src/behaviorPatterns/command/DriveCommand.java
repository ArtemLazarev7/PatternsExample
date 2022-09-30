package behaviorPatterns.command;

public class DriveCommand implements Command{
    Car car;

    public DriveCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.toDrive();
    }
}
