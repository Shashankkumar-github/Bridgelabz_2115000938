import java.util.Scanner;

public class level1_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		 System.out.println("Enter a number for its multiplication table:");
        int number = scn.nextInt();
       int [] Array = new int[10];
        for (int i = 1; i <= 10; i++) {
            Array[i - 1] = number * i;
        }
        for (int i = 0; i < Array.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + Array[i]);
        }
		}
		}