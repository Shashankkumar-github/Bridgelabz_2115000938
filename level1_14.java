import java.util.Scanner;
class level1_14{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
  System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
		}
		}