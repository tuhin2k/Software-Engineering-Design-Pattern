package FacadeCommand;

import java.util.ArrayList;

class Light{
    String name;
    boolean state;
    Light(String name){
        this.name=name;
        state=false;
    }
    void on(){
        System.out.println(name + " is on");
        state=true;
    }
    void off(){
        System.out.println(name + " is off");
        state=false;
    }
}

class Fan{
    String name;
    boolean state;
    Fan(String name){
        this.name=name;
        state=false;
    }

    void start(){
        System.out.println(name+" is starting");
        state=true;
    }
    void stop(){
        System.out.println(name + " is stopping");
        state=false;
    }
}


class Projector{
    String name;
    boolean state;
    Projector(String name){
        this.name=name;
        state=false;
    }

    void up(){
        System.out.println(name + " is upping");
        state=true;
    }

    void down(){
        System.out.println(name + " is downing");
        state=false;
    }
}

class PC{
    String name;
    boolean state;
    PC(String name){
        this.name=name;
        state=false;
    }
    void started(){
        System.out.println(name + " is started");
        state=true;
    }
    void shut_down(){
        System.out.println(name + " is shutting down");
        state=false;
    }
}


public class Facade{
    ArrayList<Light> light_arr= new ArrayList<>();
    ArrayList<Fan> fan_arr= new ArrayList<>();
    Projector projector;
    ArrayList<PC> pc_arr= new ArrayList<>();


    void addLight(Light light){
        light_arr.add(light);
    }
    void addFan(Fan fan){
        fan_arr.add(fan);

    }
    void addPC(PC pc){
        pc_arr.add(pc);
    }

    void setProjector(Projector projector){
        this.projector=projector;
    }


    void start_devices(){
        for(Light light:light_arr){
            light.on();
        }
        for(Fan fan:fan_arr){
            fan.start();
        }
        for(PC pc:pc_arr){
            pc.started();
        }

        projector.up();
    }


    void stop_devices(){
        for(Light light:light_arr){
            light.off();
        }
        for(Fan fan:fan_arr){
            fan.stop();;
        }
        for(PC pc:pc_arr){
            pc.shut_down();
        }

        projector.down();;

}

}