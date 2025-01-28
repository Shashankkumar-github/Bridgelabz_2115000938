import java.util.Scanner;

public class level1_7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a number to find the sum of natural numbers:");
        int n = scn.nextInt();
        int sum = findSumOfNaturalNumbers(n);
        System.out.println("The sum of first " + n + " natural numbers is " + sum);
		}
		
		public static int findSumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
	}