import java.util.Scanner;

public class level2_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scn.nextLong();
        int maxDigit = 10; 
        int[] digits = new int[maxDigit]; 
        int index = 0;
        while (number != 0) {
            if (index == maxDigit) {
                
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = (int) (number % 10);
            number /= 10;
        }        
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; 
                largest = digits[i]; 
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; 
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest == -1 ? "None" : secondLargest));
    }
}
