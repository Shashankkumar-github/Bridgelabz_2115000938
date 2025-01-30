import java.util.Scanner;

public class day8_builtin_8{
    public static double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
        System.out.print("Convert to (C/F): ");
        char unit = scanner.next().charAt(0);

        if (unit == 'F' || unit == 'f') {
            System.out.println("Converted: " + celsiusToFahrenheit(temp) + " °F");
        } else if (unit == 'C' || unit == 'c') {
            System.out.println("Converted: " + fahrenheitToCelsius(temp) + " °C");
        } else {
            System.out.println("Invalid unit.");
        }
        
    }
}
