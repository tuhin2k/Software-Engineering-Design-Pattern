package openclose;

public class Nurse extends Employee {
    

    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse is in action");
    }


    private void checkVitalsign(){
        System.out.println("Checking Vitals");
    }

    private void drawBlood(){
        System.out.println("drawing Blood");
    }

    private void cleanPatientArea(){
        System.out.println("Cleaning patient area");
    }


    @Override
    public void performDuties() {
        checkVitalsign();
        drawBlood();
        cleanPatientArea();

    }
}
