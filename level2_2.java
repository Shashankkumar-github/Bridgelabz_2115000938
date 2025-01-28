import java.util.Scanner;

public class level2_2 {

    public static int findSumRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        return n + findSumRecursive(n - 1);
    }

    public static int findSumFormula(int n) {
        return n*(n + 1)/2;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scn.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
            return;
        }

        int sumRecursive = findSumRecursive(n);
        int sumFormula = findSumFormula(n);

        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Results match: " + (sumRecursive == sumFormula));
    }
}
