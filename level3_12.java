import java.util.Random;
import java.util.Scanner;

public class level3_12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scn.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);

        System.out.println("\nScorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t", i + 1);
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d\t\t", scores[i][j]);
            }
            System.out.printf("%.2f\t%.2f\t%.2f%%\n", results[i][0], results[i][1], results[i][2]);
        }
    }

    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 40 + random.nextInt(61); // Physics score between 40 and 100
            scores[i][1] = 40 + random.nextInt(61); // Chemistry score between 40 and 100
            scores[i][2] = 40 + random.nextInt(61); // Math score between 40 and 100
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }
}
