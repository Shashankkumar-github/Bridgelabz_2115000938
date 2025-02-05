import java.util.ArrayList;
import java.util.List;
public class HospitalAssociation {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Dr. Raj");
        Doctor doctor2 = new Doctor("Dr. Shashank");

        Patient patient1 = new Patient("Himanshu");
        Patient patient2 = new Patient("Nishant");

        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient2);

        doctor1.displayPatients();
        doctor2.displayPatients();
    }
}
class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println(name + " is consulting " + patient.getName());
    }

    public void displayPatients() {
        System.out.println(name + "'s Patients:");
        for (Patient patient : patients) {
            System.out.println("   " + patient.getName());
        }
    }
}


