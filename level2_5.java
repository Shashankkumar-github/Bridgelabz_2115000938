import java.util.Scanner;

public class level2_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scn.nextInt();
        String reverse = "";
        while (number > 0) {
            reverse += number % 10;
            number /= 10;
        }
        System.out.println("Reversed number: " + reverse);
    }
}
