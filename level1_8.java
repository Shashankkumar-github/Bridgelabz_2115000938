import java.util.Scanner;

public class level1_8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        int[] smallestAndLargest = findSmallestAndLargest(num1, num2, num3);
        System.out.println("Smallest number: " + smallestAndLargest[0]);
        System.out.println("Largest number: " + smallestAndLargest[1]);
		}
		 public static int[] findSmallestAndLargest(int num1, int num2, int num3) {
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));
        return new int[]{smallest, largest};
    }
	}