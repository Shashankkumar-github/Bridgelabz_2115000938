import java.util.Scanner;

public class level1_3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of students:");
        int students = scn.nextInt();
        int handshakes = calculateHandshakes(students);
        System.out.println("The maximum number of handshakes is: " + handshakes);

       }
	   public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
	}