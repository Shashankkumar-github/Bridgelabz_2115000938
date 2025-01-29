import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class day8_builtin_practice_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter a date (yyyy-MM-dd): ");
        LocalDate date = LocalDate.parse(scanner.next(), formatter);
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        modifiedDate = modifiedDate.minusWeeks(3);

        System.out.println("Modified Date: " + modifiedDate.format(formatter));
    }
}
