public class level3_3 {
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
    public static int sumOfDigits(int number) {
        int sum = 0;
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static double sumOfSquaresOfDigits(int number) {
        double sum = 0;
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int number) {
        int sumOfDigits = sumOfDigits(number);
        return number % sumOfDigits == 0;
    }
    public static void digitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2]; 
        for (int digit : digits) {
            frequency[digit][0] = digit;
            frequency[digit][1]++;
        }
        System.out.println("Digit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "\t" + frequency[i][1]);
            }
        }
    }

    public static void main(String[] args) {
        int number = 21;  
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);
		
        int[] digits = storeDigits(number);
        System.out.print("Digits array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
		
        double sumOfSquares = sumOfSquaresOfDigits(number);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
		
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad number: " + isHarshad);
		
        digitFrequency(number);
    }
}
