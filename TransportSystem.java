public class TransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("Verna",180, "Petrol", 5),
            new Truck("Tata Motors",120, "Diesel", 10),
            new Motorcycle("GT 650",160, "Petrol", false)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(String name,int maxSpeed, String fuelType) {
	    this.name = name;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}
class Car extends Vehicle {
    private int seatCapacity;

    public Car(String name,int maxSpeed, String fuelType, int seatCapacity) {
        super(name,maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String name,int maxSpeed, String fuelType, int loadCapacity) {
        super(name,maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String name,int maxSpeed, String fuelType, boolean hasSidecar) {
        super(name,maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}


