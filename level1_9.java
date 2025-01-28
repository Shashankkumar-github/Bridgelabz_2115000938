import java.util.Scanner;

public class level1_9{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers (dividend and divisor):");
        int dividend = scn.nextInt();
        int divisor = scn.nextInt();
        int[] quotientAndRemainder = findRemainderAndQuotient(dividend, divisor);
        System.out.println("Quotient: " + quotientAndRemainder[1]);
        System.out.println("Remainder: " + quotientAndRemainder[0]);
		}
		public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient};
    }

}