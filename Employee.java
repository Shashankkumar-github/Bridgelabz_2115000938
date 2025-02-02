import java.util.Scanner;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String teamName;

    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayManager() {
        System.out.println("Manager - Employee ID: " + employeeID + ", Department: " + department + ", Team: " + teamName);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employeeID = scn.nextInt();
        scn.nextLine();

        System.out.print("Enter Department: ");
        String department = scn.nextLine();

        System.out.print("Enter Salary: ");
        double salary = scn.nextDouble();
    }
}
