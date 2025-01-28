
import java.util.Scanner;

public class level1_6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		System.out.println("Enter month and day:");
        int month = scn.nextInt();
        int day = scn.nextInt();
        if (isSpringSeason(month, day)) System.out.println("It's a Spring Season.");
        else System.out.println("Not a Spring Season.");
		}
		public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6);
    }
	}