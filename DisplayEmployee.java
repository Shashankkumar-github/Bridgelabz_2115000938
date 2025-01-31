import java.util.Scanner;

class DisplayEmployee {
    String name;
    int id;
    double salary;

    public DisplayEmployee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name = scn.nextLine();
		int id =scn.nextInt();
		double salary =scn.nextDouble();
        DisplayEmployee emp = new DisplayEmployee(name,id,salary);
        emp.displayDetails();
    }
}
