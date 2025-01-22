import java.util.Scanner;

public class level1_12 {
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	System.out.print("Enter base of triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = input.nextDouble();
        double areaInCm2 = 0.5 * base * height;
        double areaInInches2 = areaInCm2 / 6.4516;
        System.out.println("The area of the triangle is " + areaInCm2 + " square cm and " + areaInInches2 + " square inches.");
		}
		}