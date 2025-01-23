import java.util.Scanner;

public class level1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Your bonus is: " + bonus);
        } else {
            System.out.println("No bonus for you.");
        }
    }
}
