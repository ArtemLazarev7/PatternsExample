package behaviorPatterns.chainOfResponsibility;

public abstract class MyDay {
    private int schedule;
    private MyDay currentDay;

    public MyDay(int schedule) {
        this.schedule = schedule;
    }

    public void setCurrentDay(MyDay currentDay) {
        this.currentDay = currentDay;
    }
    public void nextAction(String time, int action){
        if(action>=schedule){
            toDo(time);
        }
        if(currentDay!=null){
            currentDay.nextAction(time,action);
        }
    }


    public abstract void toDo(String time);
}
