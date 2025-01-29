import java.util.Scanner;
import java.util.Random;

public class day8_builtin_1{
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100, guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100.");
        
        while (true) {
            guess = (low + high) / 2;
            System.out.println("Is your number " + guess + "? (Enter 'higher', 'lower', or 'correct')");
            feedback = scanner.next();

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Hooray! I guessed your number.");
                break;
            } else if (feedback.equalsIgnoreCase("higher")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("lower")) {
                high = guess - 1;
            } else {
                System.out.println("Invalid input. Please enter 'higher', 'lower', or 'correct'.");
            }
        }
    }

    public static void main(String[] args) {
        playGame();
    }
}
