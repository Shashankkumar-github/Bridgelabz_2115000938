import java.util.Scanner;

public class level2_10 {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }

    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi <= 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scn.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scn.nextDouble();
        }

        calculateBMI(data);
        String[] statuses = determineBMIStatus(data);

        System.out.println("Person\tWeight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s%n", (i + 1), data[i][0], data[i][1], data[i][2], statuses[i]);
        }
    }
}
