package behaviorPatterns.state;

public class Person {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void changeActivity(){
        if(activity instanceof Sleep)
            setActivity(new Training());
        else   if(activity instanceof  Training)
            setActivity(new Working());
        else  if(activity instanceof Working)
            setActivity(new Supper());
        else  if(activity instanceof Supper)
            setActivity(new Sleep());
    }
    public void justDoIt(){
        activity.justDoIt();
    }
}
