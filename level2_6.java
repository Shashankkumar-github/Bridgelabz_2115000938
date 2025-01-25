import java.util.Scanner;

public class level2_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = scn.nextInt();

        double[] heights = new double[number];
        double[] weights = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter height (m) for person " + (i + 1) + ": ");
            heights[i] = scn.nextDouble();

            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weights[i] = scn.nextDouble();

            if (heights[i] <= 0 || weights[i] <= 0) {
                System.out.println("Invalid input. Please re-enter values.");
                i--;
                continue;
            }

            bmi[i] = weights[i] / (heights[i] * heights[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + heights[i] + "m, Weight = " + weights[i] +
                    "kg, BMI = " + bmi[i] + ", Status = " + status[i]);
        }
    }
}
