import java.util.Scanner;

public class level1_11 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
           System.out.println("Enter temperature and wind speed:");
        double temperature = scn.nextDouble();
        double windSpeed = scn.nextDouble();
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("The Wind Chill temperature is: " + windChill);
		}
		
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
	}