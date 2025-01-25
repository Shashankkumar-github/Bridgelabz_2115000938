import java.util.Scanner;

public class level1_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		System.out.println("Enter the ages of 10 students:");
        int[] Array = new int[10];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = scn.nextInt();
        }
        for (int age : Array) {
            if (age < 0) {
                System.out.println("Invalid age");
            } else if (age >= 18) {
                System.out.println("The student with age " + age + " can vote.");
            } else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }
		}
		}