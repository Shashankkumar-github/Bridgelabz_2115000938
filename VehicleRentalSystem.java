abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle No: " + vehicleNumber + ", Type: " + type);
    }
}


class Car extends Vehicle {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * 500; // Fixed rate per day
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * 200; // Fixed rate per day
    }
}

class Truck extends Vehicle {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * 1000; // Fixed rate per day
    }
}


interface Insurable {
    double calculateInsurance();
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("MH1234", 500);
        Vehicle bike = new Bike("MH5678", 200);
        Vehicle truck = new Truck("MH9012", 1000);

        car.displayDetails();
        System.out.println("Rental Cost: $" + car.calculateRentalCost(5));

        bike.displayDetails();
        System.out.println("Rental Cost: $" + bike.calculateRentalCost(3));

        truck.displayDetails();
        System.out.println("Rental Cost: $" + truck.calculateRentalCost(7));
    }
}
