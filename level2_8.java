import java.util.Scanner;

public class level2_8{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scn.nextInt();
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathsMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            physicsMarks[i] = getValidMarks(scn, "Physics");
            chemistryMarks[i] = getValidMarks(scn, "Chemistry");
            mathsMarks[i] = getValidMarks(scn, "Maths");

            
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;

            
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
			} else if (percentages[i] >= 50) {
                grades[i] = 'D';
			} else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }
        System.out.println("Results:");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-15d %-15d %-10d %-10d %-18.2f %-15c\n",
                    (i + 1), physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentages[i], grades[i]);
        }
    }

    
    public static int getValidMarks(Scanner scn, String subject) {
        int marks;
        while (true) {
            System.out.print("Enter marks in " + subject + " (0 to 100): ");
            marks = scn.nextInt();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid marks! Please enter a value between 0 and 100.");
            }
        }
        return marks;
    }
}
