package behaviorPatterns.observer;

public class StateWeather {
    private String sunny="Sunny!!!";
    private String rainy="Rainy(((";
    private String overcast="Overcast(!";

    public String getSunny() {
        return sunny;
    }

    public String getRainy() {
        return rainy;
    }

    public String getOvercast() {
        return overcast;
    }
}
