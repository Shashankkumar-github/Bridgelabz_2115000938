import java.util.Scanner;

public class level2_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = scn.nextDouble();

            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = scn.nextDouble();

            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input. Please enter valid values.");
                i--; 
                continue;
            }

            double employeeBonus = (yearsOfService[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            bonus[i] = employeeBonus;
            newSalary[i] = salary[i] + employeeBonus;

            totalBonus += employeeBonus;
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
