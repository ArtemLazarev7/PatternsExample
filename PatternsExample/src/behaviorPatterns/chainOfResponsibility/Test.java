package behaviorPatterns.chainOfResponsibility;

public class Test {
    public static void main(String[] args) {
        MyDay myMorning=new MyMorning(Schedule.morning);
        MyDay myNoon=new MyNoon(Schedule.noon);
        MyDay myEvening=new MyEvening(Schedule.evening);
        myMorning.setCurrentDay(myNoon);
        myNoon.setCurrentDay(myEvening);

        myMorning.nextAction("Schedule of the day for the morning",Schedule.morning);
        myMorning.nextAction("Schedule of the day for half of the day",Schedule.noon);
        myMorning.nextAction("Schedule of the day for the whole day",Schedule.evening);

    }
}
