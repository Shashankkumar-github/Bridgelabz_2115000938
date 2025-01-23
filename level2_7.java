import java.util.Scanner;

public class level2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height (cm): ");
        double height = sc.nextDouble();

        height = height / 100; 
        double bmi = weight / (height * height);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 40) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
