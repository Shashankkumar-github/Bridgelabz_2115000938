import java.util.Scanner;

public class level1_10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
     
       System.out.println("Enter number of chocolates and children:");
        int chocolates = scn.nextInt();
        int children = scn.nextInt();
        int[] chocolatesDistribution = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + chocolatesDistribution[1]);
        System.out.println("Remaining chocolates: " + chocolatesDistribution[0]);
		}
		
		public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient};
    }
	}
     