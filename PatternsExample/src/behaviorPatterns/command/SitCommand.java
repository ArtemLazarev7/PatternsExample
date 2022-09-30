package behaviorPatterns.command;

public class SitCommand implements Command{
    Car  car;

    public SitCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
       car.toSit();
    }
}
