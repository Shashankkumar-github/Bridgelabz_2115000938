
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: $" + ratePerKm);
    }
}

class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 15; 
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 10; 
    }
}

class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 12; 
    }
}


interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle car = new Car("V1001", "Raj Singh", 10);
        Vehicle bike = new Bike("V2001", "Shashank Kumar SIngh", 5);

        car.getVehicleDetails();
        System.out.println("Fare for 10 km: $" + car.calculateFare(10));

        bike.getVehicleDetails();
        System.out.println("Fare for 5 km: $" + bike.calculateFare(5));
    }
}
