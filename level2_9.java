import java.util.Scanner;

public class level2_9{

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compareNumbers(int num1, int num2) {
        if (num1 > num2) return 1;
        if (num1 < num2) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scn.nextInt();
        }

        for (int number : numbers) {
            if (isPositive(number)) {
                System.out.println(number + " is positive.");
                System.out.println(number + (isEven(number) ? " is even." : " is odd."));
            } else {
                System.out.println(number + " is negative.");
            }
        }

        int comparison = compareNumbers(numbers[0], numbers[numbers.length - 1]);
        if (comparison > 0) {
            System.out.println("First number is greater than the last.");
        } else if (comparison < 0) {
            System.out.println("First number is less than the last.");
        } else {
            System.out.println("First and last numbers are equal.");
        }
    }
}
