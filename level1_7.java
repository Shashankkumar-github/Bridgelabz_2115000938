import java.util.Scanner;

public class level_7 {
    public static void main(String[] args) {
	 double radiusInKm = 6378;
        double volumeInKm3 = (4 / 3.0) * Math.PI * Math.pow(radiusInKm, 3);
        double volumeInMiles3 = volumeInKm3 / Math.pow(1.6, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeInKm3 + 
                           " and cubic miles is " + volumeInMiles3);
						   }
						   }