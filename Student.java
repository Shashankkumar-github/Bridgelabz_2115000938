import java.util.Scanner;

class Student {
    public int rollNumber; 
    protected String name; 
    private double CGPA;   
	
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
	
    public double getCGPA() { return CGPA; }
    public void setCGPA(double CGPA) { this.CGPA = CGPA; }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    private String thesisTopic;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTopic) {
        super(rollNumber, name, CGPA);
        this.thesisTopic = thesisTopic;
    }

    public void displayPGStudent() {
        System.out.println("PG Student - Roll No: " + rollNumber + ", Name: " + name + ", Thesis: " + thesisTopic);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNumber = scn.nextInt();

        System.out.print("Enter Name: ");
        String name = scn.nextLine();

        System.out.print("Enter CGPA: ");
        double CGPA = scn.nextDouble();

        System.out.print("Enter Thesis Topic (for PG Student): ");
        String thesisTopic = scn.nextLine();

        Student student = new Student(rollNumber, name, CGPA);
        PostgraduateStudent pgStudent = new PostgraduateStudent(rollNumber, name, CGPA, thesisTopic);

        System.out.println("\nStudent Details:");
        student.displayStudent();

        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayPGStudent();
    }
}
