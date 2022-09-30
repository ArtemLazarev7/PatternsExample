package behaviorPatterns.chainOfResponsibility;

public class MyEvening extends MyDay{
    public MyEvening(int schedule) {
        super(schedule);
    }

    @Override
    public void toDo(String time) {
        System.out.println(time+"I have dinner");
    }
}
