package behaviorPatterns.chainOfResponsibility;

public class MyNoon extends MyDay{
    public MyNoon(int schedule) {
        super(schedule);
    }

    @Override
    public void toDo(String time) {
        System.out.println(time+ "I have lunch");
    }
}
