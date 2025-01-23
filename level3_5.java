import java.util.Scanner;

public class level3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month (1 for January, 2 for February, etc.): ");
        int m = sc.nextInt();
        System.out.print("Enter the day: ");
        int d = sc.nextInt();
        System.out.print("Enter the year: ");
        int y = sc.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        System.out.println("The day of the week is: " + d0 + " (0 = Sunday, 1 = Monday, ..., 6 = Saturday)");
    }
}
