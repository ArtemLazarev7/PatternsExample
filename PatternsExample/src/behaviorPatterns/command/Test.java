package behaviorPatterns.command;

public class Test {
    public static void main(String[] args) {
        Car car=new Car();
        Person person  =new Person(
                new SitCommand(car),
                new StartCommand(car),
                new DriveCommand(car)

        );
        person.sitAction();
        person.startAction();
        person.driveAction();
    }
}
