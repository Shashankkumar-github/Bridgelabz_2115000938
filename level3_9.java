import java.util.Scanner;

public class level3_9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter x1, y1: ");
        double x1 = scn.nextDouble();
        double y1 = scn.nextDouble();
        
        System.out.print("Enter x2, y2: ");
        double x2 = scn.nextDouble();
        double y2 = scn.nextDouble();

        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);

        System.out.println("Euclidean Distance: " + distance);
        System.out.println("Line Equation: y = " + lineEquation[0] + "x + " + lineEquation[1]);
    }

    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }
}
