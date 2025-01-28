import java.util.Scanner;

public class level1_5{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		
		 System.out.println("Enter a number:");
        int number = scn.nextInt();
        int result = checkNumber(number);
        if (result == 1) System.out.println("The number is positive.");
        else if (result == -1) System.out.println("The number is negative.");
        else System.out.println("The number is zero.");

}
 public static int checkNumber(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }
	}