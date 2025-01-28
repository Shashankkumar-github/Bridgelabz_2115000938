import java.util.*;
public class level3_6 {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int findGreatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }
        return max;
    }
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static long findProductOfCubeOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) 
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
    public static boolean isAbundantNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) 
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number;
    }
    public static boolean isDeficientNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) 
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber;
    }
    private static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
        int number = scn.nextInt(); 
		
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest Factor: " + greatestFactor);
        int sumOfFactors = findSumOfFactors(factors);
        System.out.println("Sum of Factors: " + sumOfFactors);
        long productOfFactors = findProductOfFactors(factors);
        System.out.println("Product of Factors: " + productOfFactors);
        long productOfCubeOfFactors = findProductOfCubeOfFactors(factors);
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors);
        boolean isPerfect = isPerfectNumber(number);
        System.out.println("Is Perfect Number: " + isPerfect);
        boolean isAbundant = isAbundantNumber(number);
        System.out.println("Is Abundant Number: " + isAbundant);
        boolean isDeficient = isDeficientNumber(number);
        System.out.println("Is Deficient Number: " + isDeficient);
		
        boolean isStrong = isStrongNumber(number);
        System.out.println("Is Strong Number: " + isStrong);
    }
}
