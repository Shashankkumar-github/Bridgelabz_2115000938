import java.util.Scanner;

public class level1_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number for its multiplication table from 6 to 9:");
        int number = scn.nextInt();
        int [] Array = new int[4];
        for (int i = 6; i <= 9; i++) {
            Array[i - 6] = number * i;
        }
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + Array[i - 6]);
        }
		}
		}