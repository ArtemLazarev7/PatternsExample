package behaviorPatterns.command;

public class Person {
    Command sit;
    Command start;
    Command drive;

    public Person(Command sit, Command start, Command drive) {
        this.sit = sit;
        this.start = start;
        this.drive = drive;
    }
    public void sitAction(){
        sit.execute();
    }
    public void startAction(){
        start.execute();
    }
    public void driveAction(){
        drive.execute();
    }
}
