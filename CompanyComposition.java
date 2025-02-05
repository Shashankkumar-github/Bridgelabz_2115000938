import java.util.ArrayList;
import java.util.List;

public class CompanyComposition {
    public static void main(String[] args) {
        
        Company company = new Company("Capgemini");
		
        company.addDepartment("Engineering");
        company.addDepartment("Human Resource");

        
        company.addEmployeeToDepartment("Engineering", "Raj");
        company.addEmployeeToDepartment("Engineering", "Shashank");
        company.addEmployeeToDepartment("Human Resource", "Swati");
        
        company.displayCompany();
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void displayEmployee() {
        System.out.println("   Employee: " + name);
    }
}

class Department {
    private String departmentName;
    private List<Employee> employees; 

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName)); 
    }

    public void displayDepartment() {
        System.out.println(" Department: " + departmentName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
}

class Company {
    private String companyName;
    private List<Department> departments; 

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName)); 
    }

    public void addEmployeeToDepartment(String departmentName, String employeeName) {
        for (Department dept : departments) {
            if (dept.departmentName.equals(departmentName)) {
                dept.addEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department " + departmentName + " not found in " + companyName);
    }

    public void displayCompany() {
        System.out.println("\nCompany: " + companyName);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }
}
