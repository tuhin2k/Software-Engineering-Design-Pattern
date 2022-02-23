package observer;

public class Main {
    public static void main(String[] args) {
        Subject Weather = new WeatherService();
        Observer gmap= new Googlemap();
        Weather.addObserver(gmap);

        Weather.notifyObservers();

        Observer accu = new AccuWeather();

        Weather.addObserver(accu);


        Weather.notifyObservers();

        Weather.removeObserver(gmap);

        Weather.notifyObservers();
    }
    
}