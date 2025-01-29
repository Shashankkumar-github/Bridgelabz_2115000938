import java.util.Scanner;

public class day8_builtin_4 {
    public static void generateFibonacci(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Sequence: " + first + " " + second + " ");

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();
        generateFibonacci(terms);
        
    }
}
