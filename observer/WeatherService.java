package observer;

import java.util.Random;

public class WeatherService extends Subject{

    WeatherService(){
        this.addFeatures(new Temparature());
        this.addFeatures(new Pressure());
    }

    @Override
    void addObserver(Observer ob) {
        this.ob_arr.add(ob);
        System.out.printf("%s added to %s\n",ob,this);
    }

    @Override
    void removeObserver(Observer ob) {
        this.ob_arr.remove(ob);
        System.out.printf("Removed %s from %s\n",ob,this);
    }

    @Override
    void notifyObservers() {
        for(Observer ob:ob_arr){
            ob.update(this);
        }
    }

    public String toString(){
        return "WeatherService";
    }


    ///Hardware Logic..Open close violation
    
    int getTemparture(){
        Random rand= new Random();
        return rand.nextInt(50);
    }

    int getPressure(){
        Random rand= new Random();
        return rand.nextInt(30);
    }
}
