import java.util.Scanner;

public class level3_8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scn.nextInt();
        System.out.print("Enter year: ");
        int year = scn.nextInt();

        displayCalendar(month, year);
    }

    public static void displayCalendar(int month, int year) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        System.out.println("   " + months[month - 1] + " " + year);
        System.out.println(" S  M  T  W  T  F  S");

        int startDay = getStartDay(month, year);
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= daysInMonth[month - 1]; day++) {
            System.out.printf("%3d", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getStartDay(int month, int year) {
        int d = 1;
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m) / 12) % 7;
    }
}
