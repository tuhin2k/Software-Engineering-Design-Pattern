package openclose;

public class EmergencyRoomProcess {
    public static void main(String[] args) {
        //Hospitalmanagement = context and Doctor,Nurse =Strategy/Behavior era intersect korse employe abstract class e
        HospitalManagement director = new HospitalManagement();

        Employee rahima = new Nurse(1, "rahima", "emergency", true);

        director.callUpon(rahima);

        Employee badhon = new Doctor(6, "Badhon", "Nothing", false);

        director.callUpon(badhon);

        // System.out.println(badhon);

        
    }
    
}
