import java.util.Scanner;

public class level2_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scn.nextInt();

        int[] digits = new int[10];
        int index = 0;

        while (number > 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = 0, secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
