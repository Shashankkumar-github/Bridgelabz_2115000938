import java.util.Scanner;

public class level2_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];

        String[] names = {"Amar", "Akbar", "Anthony"};
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scn.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = scn.nextDouble();

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex]);
    }
}
