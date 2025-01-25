import java.util.Scanner;

public class level1_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		System.out.println("Enter up to 10 numbers (stop with 0 or negative):");
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;
        while (index < 10) {
            double input = scn.nextDouble();
            if (input <= 0) break;
            values[index++] = input;
        }
        for (int i = 0; i < index; i++) {
            total += values[i];
        }
        System.out.println("Total sum: " + total);
		}
		}