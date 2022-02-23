package FacadeCommand;

import java.util.ArrayList;
import java.util.HashMap;

public interface Command {
    void execute();
}

class NullCommand implements Command{

    @Override
    public void execute() {
        System.out.println("this button has yet to be set");
    }
}

class Remote{
    ArrayList<Command> btn_arr= new ArrayList<>();

    // HashMap<int,Command> btn_arr= new ArrayList<>();

    Remote(){
        for(int i=0;i<10;i++){
            btn_arr.add(new NullCommand());
        }
    }


    void setCommand(int idx,Command command){
        btn_arr.set(idx, command);
    }

    void pushButton(int idx){
        btn_arr.get(idx).execute();
    }
}

class LightCommand implements Command{
    Light light;
    LightCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        if(light.state){
            light.off();
        }
        else{
            light.on();
        }
    }
}

class FanCommand implements Command{
    Fan fan;
    FanCommand(Fan fan){
        this.fan=fan;
    }
    @Override
    public void execute() {
        if(fan.state){
            fan.stop();
        }
        else{
            fan.start();
        }
    }
    
}


class Button_o_command implements Command{
    Remote remote;
    Button_o_command(Remote remote){
        this.remote=remote;
    }
    @Override
    public void execute() {
        for(int i=1;i<=remote.btn_arr.size()-1;i++){
            remote.pushButton(i);
        }
    }
}
