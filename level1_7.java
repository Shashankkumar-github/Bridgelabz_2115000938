import java.util.Scanner;

public class level1_7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		System.out.println("Enter a natural number:");
        int number = scn.nextInt();
        if (number < 1) {
            System.out.println("Error: Not a natural number.");
        } else {
            int[] odd = new int[number / 2 + 1];
            int[] even = new int[number / 2 + 1];
            int oddIndex = 0, evenIndex = 0;
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    even[evenIndex++] = i;
                } else {
                    odd[oddIndex++] = i;
                }
            }
            System.out.println("Odd numbers: " + java.util.Arrays.toString(java.util.Arrays.copyOf(odd, oddIndex)));
            System.out.println("Even numbers: " + java.util.Arrays.toString(java.util.Arrays.copyOf(even, evenIndex)));
        }
		}
		}
		