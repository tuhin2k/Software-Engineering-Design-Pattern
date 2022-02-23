package FacadeCommand;

public class FacadeTest {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.addLight(new Light("Light-1"));
        facade.addLight(new Light("Light-2"));
        facade.addLight(new Light("Light-3"));

        facade.addFan(new Fan("Fan-1"));
        facade.addFan(new Fan("Fan-2"));

        facade.addPC(new PC("Pc-1"));

        facade.setProjector(new Projector("Projector-1"));

        facade.start_devices();
        facade.stop_devices();
    }
    
}