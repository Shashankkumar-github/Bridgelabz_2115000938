import java.util.Scanner;
class ComputeCircle {
    double radius;
	
    public ComputeCircle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getCircumference() {
        return 2*Math.PI*radius;
    }
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }

    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double radius = scn.nextDouble();
        ComputeCircle circle = new ComputeCircle(radius);
        circle.displayDetails();
    }
}
