import java.util.Scanner;

public class level1_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		  System.out.println("Enter 5 numbers:");
        int [] Array = new int[5];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = scn.nextInt();
        }
        for (int num : Array) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even.");
                } else {
                    System.out.println(num + " is positive and odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println("Zero");
            }
        }
        if (Array[0] > Array[4]) {
            System.out.println("First element is greater than last.");
        } else if (Array[0] < Array[4]) {
            System.out.println("First element is less than last.");
        } else {
            System.out.println("First and last elements are equal.");
        }
		}
		}