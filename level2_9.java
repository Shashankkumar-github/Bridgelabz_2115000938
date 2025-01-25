import java.util.Scanner;

public class level2_9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = scn.nextInt();

        int[][] marks = new int[students][3]; 
        double[] percentages = new double[students];
        char[] grades = new char[students];

        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths): ");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = scn.nextInt();
                if (marks[i][j] < 0) {
                    System.out.println("Invalid marks. Enter positive values.");
                    j--;
                }
            }

            
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            
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
			else {
                grades[i] = 'R';
            }
        }

        
        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1) + ":Percentage = " + percentages[i] + ", Grade = " + grades[i]);
        }
    }
}
