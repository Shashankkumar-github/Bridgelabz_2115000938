import java.util.Scanner;

class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 200.0; 
	
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }

    public static double getRegistrationFee() { return registrationFee; }
    public static void setRegistrationFee(double registrationFee) { Vehicle.registrationFee = registrationFee; }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType + ", Registration Fee: $" + registrationFee);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Owner Name: ");
        String ownerName = scanner.nextLine();

        System.out.print("Enter Vehicle Type: ");
        String vehicleType = scanner.nextLine();

        System.out.print("Enter New Registration Fee: ");
        double newFee = scanner.nextDouble();
        Vehicle.setRegistrationFee(newFee);

        Vehicle vehicle1 = new Vehicle(ownerName, vehicleType);
        vehicle1.displayVehicleDetails();
    }
}
