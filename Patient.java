class Patient {
    private static String hospitalName = "KD Hospital";
    private static int totalPatients = 0;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }
    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }
    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Chris", 23, "Flu", 201);
        patient1.displayDetails();

        Patient.getTotalPatients();
    }
}
