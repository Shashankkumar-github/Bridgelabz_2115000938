import java.util.*;

public class level2_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number to find its factors:");
        int number = scn.nextInt();

        int[] factors = findFactors(number);

        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum of Factors: " + findSum(factors));
        System.out.println("Product of Factors: " + findProduct(factors));
        System.out.println("Sum of Squares of Factors: " + findSumOfSquares(factors));
    }

    public static int[] findFactors(int number) {
        List<Integer> factorList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorList.add(i);
            }
        }
        return factorList.stream().mapToInt(i -> i).toArray();
    }

    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int findProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static int findSumOfSquares(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }
}
