
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: $" + calculateSalary());
    }
}


class FullTimeEmployee extends Employee {
    private double fixedSalary;

    public FullTimeEmployee(int employeeId, String name, double fixedSalary) {
        super(employeeId, name, fixedSalary);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, hourlyRate * hoursWorked);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}


interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

class EmployeeDepartment extends FullTimeEmployee implements Department {
    private String departmentName;

    public EmployeeDepartment(int employeeId, String name, double fixedSalary, String departmentName) {
        super(employeeId, name, fixedSalary);
        this.departmentName = departmentName;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.departmentName = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(101, "Raj SIngh", 5000);
        Employee emp2 = new PartTimeEmployee(102, "Shashank Kumar SIngh", 20, 80);

        emp1.displayDetails();
        emp2.displayDetails();

        EmployeeDepartment deptEmp = new EmployeeDepartment(103, "Alice Johnson", 6000, "HR");
        deptEmp.displayDetails();
        System.out.println(deptEmp.getDepartmentDetails());
    }
}
