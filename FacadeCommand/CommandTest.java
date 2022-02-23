package FacadeCommand;

public class CommandTest {
    public static void main(String[] args) {
        // System.out.println("commandTest");
        Remote remote = new Remote();

        Light light_1= new Light("Light-1");

        LightCommand l1c= new LightCommand(light_1);

        // remote.setCommand(9, l1c);

        // remote.pushButton(1);
        // remote.pushButton(9);
        // remote.pushButton(9);

        // remote.btn_arr.add(l1c);

        // System.out.println(remote.btn_arr.size());

        // remote.pushButton(10);
        // remote.pushButton(10);

        System.out.println(remote.btn_arr.size());

        int num_light=5,num_fan=4;

        for(int i=1;i<=num_light;i++){
            remote.setCommand(i, new LightCommand(new Light("Light-"+i)));
        }
        for(int i=num_light+1;i<=num_light+num_fan;i++){
            remote.setCommand(i, new FanCommand(new Fan("Fan-" + (i-num_light))));
        }

        remote.pushButton(7);
        remote.pushButton(7);
        remote.pushButton(7);

        for(int i=1;i<remote.btn_arr.size();i++){
            remote.pushButton(i);
        }


        Button_o_command zero = new Button_o_command(remote);
        remote.setCommand(0, zero);



        remote.pushButton(0);


}
    
}