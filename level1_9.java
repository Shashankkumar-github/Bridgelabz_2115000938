import java.util.Scanner;

public class level1_9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		System.out.println("Enter rows and columns for a matrix:");
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        int[] oneDArray = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneDArray[index++] = matrix[i][j];
            }
        }
        System.out.println("1D Array: " + java.util.Arrays.toString(oneDArray));
		}
		}
		
		