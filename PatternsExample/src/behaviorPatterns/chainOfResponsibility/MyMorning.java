package behaviorPatterns.chainOfResponsibility;

public class MyMorning extends MyDay{

    public MyMorning(int schedule) {
        super(schedule);
    }
    @Override
    public void toDo(String time) {
        System.out.println(time+ "I have breakfast");
    }
}
