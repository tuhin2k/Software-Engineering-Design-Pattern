package observer;

public class AccuWeather implements Observer {

    @Override
    public void update(Subject sub) { // Subject sub dite hobe.karon WeatherService charaw onno company hote pare orthat Subject er subclass thakte pare and Subject sub diye kaj na korle Liskov mane na.
        System.out.println("Updated call from " + this);
        // System.out.printf("Temparature %d\n",sub.getTemparture());
        System.out.printf("Temparture %s\n",sub.feature.get("Temparature").getCurrentValue());
    }

    public String toString(){
        return "Accu Weather";
    }
    
}
