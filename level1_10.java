import java.util.Scanner;

public class level1_10 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	 System.out.print("Enter height in cm: ");
        double heightInCm = input.nextDouble();
        double heightInInches = heightInCm / 2.54;
        int heightInFeet = (int) (heightInInches / 12);
        double remainingInches = heightInInches % 12;
        System.out.println("Your Height in cm is " + heightInCm + 
                           " while in feet is " + heightInFeet + " and inches is " + remainingInches);
						   }
						  }