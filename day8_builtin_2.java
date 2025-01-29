import java.util.Scanner;

public class day8_builtin_2 {
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println("Maximum number: " + findMax(num1, num2, num3));
        
    }
}
