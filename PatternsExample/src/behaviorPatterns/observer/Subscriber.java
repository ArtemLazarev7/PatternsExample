package behaviorPatterns.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(String stateWeather) {
        System.out.println("Dear "+name+"\nWe would like to inform you that the weather outside:\n"+stateWeather+"\n===================\n");
    }
}
