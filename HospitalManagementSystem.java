
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

class InPatient extends Patient {
    private double dailyCharge;
    private int daysAdmitted;

    public InPatient(int patientId, String name, int age, double dailyCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return dailyCharge * daysAdmitted;
    }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}


interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}


public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient inpatient = new InPatient(301, "Raj Singh", 45, 500, 5);
        Patient outpatient = new OutPatient(302, "Shashank Kumar Singh", 30, 100);

        inpatient.getPatientDetails();
        System.out.println("Total Bill: $" + inpatient.calculateBill());

        outpatient.getPatientDetails();
        System.out.println("Total Bill: $" + outpatient.calculateBill());
    }
}
