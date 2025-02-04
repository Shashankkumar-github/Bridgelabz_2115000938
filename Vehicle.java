class Vehicle {
    private static double registrationFee = 500.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;
	
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Raj", "Tank", "AB123");
        vehicle1.displayDetails();

        Vehicle.updateRegistrationFee(550.0);
        vehicle1.displayDetails();
    }
}
