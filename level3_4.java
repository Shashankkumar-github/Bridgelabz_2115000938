import java.util.Scanner;
public class level3_4 {
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true; 
            }
        }
        return false; 
    }

    public static void main(String[] args) {
	     Scanner scn = new Scanner(System.in);
        int number =scn.nextInt();
        
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = storeDigits(number);
        System.out.print("Digits array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        int[] reversedDigits = reverseArray(digits);
        System.out.print("Reversed digits array: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        boolean arraysEqual = areArraysEqual(digits, reversedDigits);
        System.out.println("Are digits and reversed digits equal: " + arraysEqual);
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is Palindrome: " + isPalindrome);
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is Duck Number: " + isDuck);
    }
}
