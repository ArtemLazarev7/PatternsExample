package behaviorPatterns.state;

public class MyDay {
    public static void main(String[] args) {
        Activity activity=new Sleep() ;
        Person person=new Person();
        person.setActivity(activity);

        for (int i = 0; i < 5; i++) {
            person.justDoIt();
            person.changeActivity();
        }
    }
}
