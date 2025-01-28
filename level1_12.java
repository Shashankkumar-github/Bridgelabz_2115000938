 import java.util.Scanner;

public class level1_12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		 System.out.println("Enter angle in degrees:");
        double angle = scn.nextDouble();
        double[] trigValues = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + trigValues[0]);
        System.out.println("Cosine: " + trigValues[1]);
        System.out.println("Tangent: " + trigValues[2]);
    }
 public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }
}