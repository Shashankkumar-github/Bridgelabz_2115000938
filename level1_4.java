import java.util.Scanner;

public class level1_4{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		System.out.println("Enter the 3 sides of a triangular park (in meters):");
        double side1 = scn.nextDouble();
        double side2 = scn.nextDouble();
        double side3 = scn.nextDouble();
        int rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete needs to complete " + rounds + " rounds to complete 5 km.");
		
		}
		 public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; 
        return (int) Math.ceil(totalDistance / perimeter);
    }
	}