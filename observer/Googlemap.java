package observer;

public class Googlemap implements Observer {

    @Override
    public void update(Subject sub) {
        System.out.println("update call from " + this );
        System.out.printf("Pressure %s\n",sub.feature.get("Pressure").getCurrentValue());
    }

    public String toString(){
        return "Google Map";
    }
    
}
