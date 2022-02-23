package Singleton;

public class SimpleThread implements Runnable {
    String name;

    SimpleThread(String name){
        this.name = name;
    }

    @Override
    public synchronized void run() {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();

        System.out.println(boiler.getStatus(name));

        
    }
    
}
