import java.util.Scanner;

public class level2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius");
    }
}
