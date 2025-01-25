import java.util.Scanner;

public class level1_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		System.out.println("Enter the heights of 11 players:");
        double[] heights = new double[11];
        double total = 0.0;
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scn.nextDouble();
            total += heights[i];
        }
        System.out.println("Mean height: " + (total / heights.length));
		}
		}