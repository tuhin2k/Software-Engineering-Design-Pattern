package Adapter;


abstract class Car{
    double weight_kg;
    double milage;

    Car(double weight_kg,double milage){
        this.weight_kg=weight_kg;
        this.milage=milage;
    }

    abstract void start();
    abstract void steer(int left_right);
}

abstract class Bike{
    double weight_pound;
    double kilometer_per_litre;
    Bike(double weight_pound,double kilometer_per_litre){
        this.kilometer_per_litre=kilometer_per_litre;
        this.weight_pound=weight_pound;
    }

    abstract void begin();
    abstract void controll(int left_right);
}

class BMW extends Car{

    BMW() {
        super(1500, 30.56);
    }

    @Override
    void start() {
        System.out.println("BMW is Starting....");
    }

    @Override
    void steer(int left_right) {
        System.out.println("Steering " + left_right);
    }
    
}

class Suzuki extends Bike{

    Suzuki() {
        super(2000,110.56);
    }

    @Override
    void begin() {
        System.out.println("Suzuki is beginning");
        
    }

    @Override
    void controll(int left_right) {
        System.out.println("Controlling" + left_right);
    }

}


class Bike2CarAdapter extends Car{
    Bike bike;

    Bike2CarAdapter(Bike bike) {
        super(bike.weight_pound/2.20462,bike.kilometer_per_litre*0.62137);
        this.bike=bike;
    }

    @Override
    void start() {
        bike.begin();
    }

    @Override
    void steer(int left_right) {
        bike.controll(left_right);
    }
}

public class Adapter {
    public static void main(String[] args) {
        Car bmw = new BMW();
        bmw.start();
        bmw.steer(70);
        

        Bike suzuki= new Suzuki();
        
        suzuki.controll(50);
        suzuki.begin();

        Car suzuki2 = new Bike2CarAdapter(new Suzuki());

        suzuki2.start();

        suzuki2.steer(7);


    }

    
}




