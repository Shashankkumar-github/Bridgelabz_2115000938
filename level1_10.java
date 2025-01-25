import java.util.Scanner;

public class level1_10{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		 System.out.println("Enter a number for FizzBuzz:");
        int number = scn.nextInt();
        if (number > 0) {
            String[] results = new String[number + 1];
            for (int i = 0; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = String.valueOf(i);
                }
            }
            for (int i = 0; i < results.length; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }
        }
    }
}