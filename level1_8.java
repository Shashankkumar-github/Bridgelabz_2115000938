import java.util.Scanner;

public class level1_8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		 System.out.println("Enter a number to find its factors:");
        int number = scn.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    factors = java.util.Arrays.copyOf(factors, maxFactor);
                }
                factors[index++] = i;
            }
        }
          System.out.println("Factors: " + java.util.Arrays.toString(java.util.Arrays.copyOf(factors, index)));
		  }
		  }