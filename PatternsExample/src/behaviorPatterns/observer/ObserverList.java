package behaviorPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverList implements Observed{
    List<Observer> observers=new ArrayList<>();
    String stateWeather;
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String stateWeather) {
        for (Observer observer : observers) {
            observer.handleEvent(stateWeather);
        }

    }
}
