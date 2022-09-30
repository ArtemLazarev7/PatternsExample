package behaviorPatterns.strategy;

public class MyDay {
    public static void main(String[] args) {
        Person person=new Person();

        person.setActivity(new Sleep());
        person.executeActivity();

        person.setActivity(new Training());
        person.executeActivity();

        person.setActivity(new Working());
        person.executeActivity();

        person.setActivity(new Supper());
        person.executeActivity();
    }
}
