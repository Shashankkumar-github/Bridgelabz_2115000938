import java.util.Scanner;

public class level1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Is the number" + number + " divisible by 5? " + (number%5 == 0));
    }
}
