import java.util.Scanner;

public class level3_10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter x1, y1: ");
        double x1 = scn.nextDouble();
        double y1 = scn.nextDouble();

        System.out.print("Enter x2, y2: ");
        double x2 = scn.nextDouble();
        double y2 = scn.nextDouble();

        System.out.print("Enter x3, y3: ");
        double x3 = scn.nextDouble();
        double y3 = scn.nextDouble();

        boolean isCollinear = checkCollinearity(x1, y1, x2, y2, x3, y3);

        System.out.println("Are the points collinear? " + (isCollinear ? "Yes" : "No"));
    }

    public static boolean checkCollinearity(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1)/(x2 - x1);
        double slopeBC = (y3 - y2)/(x3 - x2);
        double slopeAC = (y3 - y1)/(x3 - x1);

        return slopeAB == slopeBC && slopeAB == slopeAC;
    }
}
