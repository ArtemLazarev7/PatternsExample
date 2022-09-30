package behaviorPatterns.observer;

public class Test {
    public static void main(String[] args) {
        StateWeather stateWeather=new StateWeather();
        Observer subscriber=new Subscriber("Katy");
        Observer subscriber1=new Subscriber("Alex");
        ObserverList observerList=new ObserverList();

        observerList.addObserver(subscriber);
        observerList.addObserver(subscriber1);
        observerList.notifyObservers(stateWeather.getSunny());
        observerList.removeObserver(subscriber1);
        observerList.notifyObservers(stateWeather.getOvercast());
    }
}
