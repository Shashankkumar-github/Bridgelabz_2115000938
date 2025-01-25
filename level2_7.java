import java.util.Scanner;

public class level2_7{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int persons = scn.nextInt();

        double[][] personData = new double[persons][3]; // Columns: 0 = Height, 1 = Weight, 2 = BMI
        String[] weightStatus = new String[persons];

        for (int i = 0; i < persons; i++) {
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            personData[i][0] = scn.nextDouble();

            System.out.print("Enter weight (in kilograms) for person " + (i + 1) + ": ");
            personData[i][1] = scn.nextDouble();

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--;
                continue;
            }

            
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        
        for (int i = 0; i < persons; i++) {
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s\n",
                              i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
