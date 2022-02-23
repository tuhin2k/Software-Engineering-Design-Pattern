package observer;

import java.util.Random;

public abstract class Features {
    String name,unit; // name= feature name like temparature ,pressure,humidity
    Features(String name, String unit){
        this.name=name;
        this.unit=unit;
    }
    public String toString(){
        return this.name;
    }

    abstract String getCurrentValue();
}


class Temparature extends Features{

    Temparature(){
        super("Temparature", "celcious");
    }

    @Override
    String getCurrentValue() {
        Random rand= new Random();
        Integer val = rand.nextInt(50);
        return val.toString() + " " +this.unit;
    }
    
}

class Pressure extends Features{

    Pressure(){
        super("Pressure", "pascal");
    }

    @Override
    String getCurrentValue() {
        Random rand= new Random();
        Integer val = rand.nextInt(50);
        return val.toString() + " " +this.unit;
    }
    
}

