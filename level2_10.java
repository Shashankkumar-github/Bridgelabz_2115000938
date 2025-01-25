import java.util.Scanner;

public class level2_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scn.nextInt();

        int[] frequency = new int[10]; // Array to store the frequency of digits

        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        System.out.println("Frequency of digits:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
