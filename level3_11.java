import java.util.Random;

public class level3_11{

    public static void main(String[] args) {
        Random random = new Random();
        int[][] employees = new int[10][2]; 
        double[][] bonusDetails = new double[10][2]; 
		
        for (int i = 0; i < employees.length; i++) {
            employees[i][0] = 50000 + random.nextInt(50000); 
            employees[i][1] = 1 + random.nextInt(15); 
        }
        for (int i = 0; i < employees.length; i++) {
            double bonus = calculateBonus(employees[i][0], employees[i][1]);
            double newSalary = employees[i][0] + bonus;
            bonusDetails[i][0] = newSalary;
            bonusDetails[i][1] = bonus;
        }
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.println("Employee Salary and Bonus:");
        System.out.println("Old Salary\tYears of Service\tBonus\tNew Salary");

        for (int i = 0; i < employees.length; i++) {
            totalOldSalary += employees[i][0];
            totalNewSalary += bonusDetails[i][0];
            totalBonus += bonusDetails[i][1];
            System.out.printf("%d\t\t%d\t\t\t%.2f\t%.2f\n", employees[i][0], employees[i][1], bonusDetails[i][1], bonusDetails[i][0]);
        }

        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
    }

    public static double calculateBonus(int salary, int yearsOfService) {
        if (yearsOfService > 5) {
            return salary * 0.05;
        } else {
            return salary * 0.02;
        }
    }
}
