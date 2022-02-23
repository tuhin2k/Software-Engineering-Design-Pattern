package Singleton;

public class Main {
    public static void main(String[] args) {
        // ChocolateBoiler boiler = new ChocolateBoiler();

        // boiler.boil();
        // boiler.fill();

        // boiler.fill();

        // boiler.boil();
        // boiler.boil();

        // boiler.drain();
        // boiler.drain();

        // boiler.fill();
        // boiler.fill();

        // ChocolateBoiler boiler2 = new ChocolateBoiler();
        // boiler2.fill();

        //driver class er instance create hocche fill korano jacche.kintu kora jabe na.ei je alada instance create kora atkaite hobe

        // ekhon ar bar bar driver class er instance call kora jabe na
        // ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        // boiler.fill();
        // boiler.fill();

        // ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        // boiler2.fill();




        //Muti threaded system er jonno just instance newar try korbo and fill korbo thread er maddhome.

        Thread thread1 = new Thread(new SimpleThread("Thread 1"));
        Thread thread2 = new Thread(new SimpleThread("Thread 2"));

        thread1.start();
        thread2.start();


    }
    
}
