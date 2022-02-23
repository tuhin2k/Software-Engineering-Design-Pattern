package observer;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Subject {
    ArrayList<Observer> ob_arr = new ArrayList<>();
    abstract void addObserver(Observer ob);
    abstract void removeObserver(Observer ob);
    abstract void notifyObservers();

    HashMap<String,Features> feature = new HashMap<>();

    void addFeatures(Features f){
        feature.put(f.name, f);
        System.out.printf("Added %s to %s\n",f.name,this);
    }

    void removeFeatures(Features f){
        feature.remove(f.name);
        System.out.printf("Removed %s to %s\n",f.name,this);

    }
    
}
