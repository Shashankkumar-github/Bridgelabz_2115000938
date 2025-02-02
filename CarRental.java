import java.util.Scanner;

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 50.0; 
  
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }
	
    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }
    public void displayRentalDetails() {
        System.out.println("Customer: " + customerName + ", Car Model: " + carModel + ", Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String customerName = scn.nextLine();

        System.out.print("Enter Car Model: ");
        String carModel = scn.nextLine();

        System.out.print("Enter Rental Days: ");
        int rentalDays = scn.nextInt();
		
        CarRental rental1 = new CarRental(customerName, carModel, rentalDays);
        CarRental rental2 = new CarRental(rental1); 

        System.out.println("Original Rental Details:");
        rental1.displayRentalDetails();

        System.out.println("Copied Rental Details:");
        rental2.displayRentalDetails();
    }
}
