package openclose;

public class HospitalManagement {

    public void callUpon(Employee employee){
        //confriming open closed 
        employee.performDuties();


        // if(employee instanceof Nurse){
        //     checkVitalsign();
        //     drawBlood();
        //     cleanPatientArea();
        // }
        // else if(employee instanceof Doctor){
        //     prescribeMedicine();
        //     diagnosePatients();
        // }

    }


    //Open closed & Single Responsiblity violation
    //Nurse
    // private void checkVitalsign(){
    //     System.out.println("Checking Vitals");
    // }

    // private void drawBlood(){
    //     System.out.println("drawing Blood");
    // }

    // private void cleanPatientArea(){
    //     System.out.println("Cleaning patient area");
    // }

    //Doctors

    // private void prescribeMedicine(){
    //     System.out.println("Prescribe Medicine");
    // }

    // private void diagnosePatients(){
    //     System.out.println("Diagnosing patients");
    // }
    
}
