package Singleton;

import java.util.Random;

public class ChocolateBoiler {
        private boolean empty;
        private boolean boiled;
    
        int signature;
    
        public boolean isEmpty() {
            return empty;
        }
    
        public boolean isBoiled() {
            return boiled;
        }
    
        public String toString(){
            return "Chocolateboiler " + signature + " " ;
        }
    
        private static ChocolateBoiler uniqueInstance=null;

        // public ChocolateBoiler(){
        //     empty = true;
        //     boiled=false;
        // }
    
        private ChocolateBoiler() {
            empty = true;
            boiled = false;
            signature=new Random().nextInt(1000000);
    
            try {
                Thread.sleep(1000); // dhore nilam majhe aro onek kaj ase ja shesh korte 1.5second time lage. constructor er puro kaj shesh kore then uniqueinstance er moddhe assign korbe .shesh na howar ag porjonto assign korbe na.
            }catch (Exception e){}

            System.out.println("Created Chocolate Boiler<" + this + ">");
        }
    
        public String getStatus(String msg)
        {
            return msg + "<>" + this + "<empty: " + this.empty + " , boiled: " + this.boiled +">";
        }
    
        public synchronized static ChocolateBoiler getInstance() {
            if (uniqueInstance == null) {
                System.out.println("Creating unique instance of Chocolate Boiler");
                uniqueInstance = new ChocolateBoiler();
            }
            // synchronized(ChocolateBoiler.class) {
            //     if (uniqueInstance == null) {
            //         System.out.println("Creating unique instance of Chocolate Boiler");
            //         uniqueInstance = new ChocolateBoiler();
            //     }
            //     else{
            //         System.out.println(msg + "Instance Exists!!");
            //     }
            // }
            System.out.println("Returning instance of Chocolate Boiler");
            return uniqueInstance;
        }
    
        public synchronized void fill() {
            if (isEmpty()) {
                System.out.println(this + " Filling Chocolate and Milk");
                empty = false;

                // fill the boiler with a milk/chocolate mixture
            }
            else {
                System.out.println(this +" Can't fill:Boilar not empty");
            }
        }
    
        public synchronized void boil() {
            if (!isEmpty() && !isBoiled()) {
                System.out.println(this +" Boiling Chocolate and Milk");
                // bring the contents to a boil
                boiled = true;
            }
            else {
                if(isEmpty()) System.out.println(this +" Can't Boil:Boilar is empty");
                else System.out.println(this +" Can't Boil:Already Boiled");
            }
    
        }
        public synchronized void drain() {
            if (!isEmpty() && isBoiled()) {
                System.out.println("Draining chocolate bars");
                // drain the boiled milk and chocolate
                empty = true;
            }
            else {
                if(isEmpty()) System.out.println(this +" Can't drain:Boilar is empty");
                else System.out.println(this +" Can't Drain. Not Boiled yet");
    
            }
        }
    
}
