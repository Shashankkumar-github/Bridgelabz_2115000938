import java.util.Scanner;

class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public void displayRadius() {
        System.out.println("Circle Radius: " + radius);
    }

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        System.out.print("Enter Circle Radius: ");
        double radius = scn.nextDouble();
        Circle circle = new Circle(radius);
        circle.displayRadius();
    }
}
