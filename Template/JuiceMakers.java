abstract class Juicemaker{
    void pourWater() { System.out.println("Pouring water"); }
    void addCubesOfSuger(int x) { System.out.printf("Adding %d cubes of sugar\n",x); }
    void blend(Juicemaker juicemaker) { System.out.println("Blending " + juicemaker); }
    void serve(Juicemaker juicemaker){ System.out.println(juicemaker + " Juice Served"); }
    
}

class MangoJuiceMaker extends Juicemaker{
    void makeJuice(){
        pourWater(); blend(new MangoJuiceMaker()); addCubesOfSuger(2); serve(this);
    }

    public String toString(){
        return "Mango";
    }
}

class OrangeJuiceMaker extends Juicemaker{
    void makeJuice(){
        pourWater(); blend(new OrangeJuiceMaker()); addCubesOfSuger(3); serve(this);
    }

    public String toString(){
        return "Orange";
    }
}

public class JuiceMakers {
    public static void main(String[] args) {
        MangoJuiceMaker mango = new MangoJuiceMaker();
        OrangeJuiceMaker orange = new OrangeJuiceMaker();

        mango.makeJuice();
        System.out.println("\n");
        orange.makeJuice();
    }
}