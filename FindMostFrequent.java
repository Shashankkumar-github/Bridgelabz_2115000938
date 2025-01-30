import java.util.Scanner;
`
public class FindMostFrequent {
    public static char findMostFrequentChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String cannot be empty or null.");
        }

        int[] frequency = new int[256];  
        char mostFrequentChar = str.charAt(0);
        int maxFrequency = 0;
        for (char c : str.toCharArray()) {
            frequency[c]++;  
            if (frequency[c] > maxFrequency) {
                maxFrequency = frequency[c];
                mostFrequentChar = c;
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("enter the string:");
     String input = scn.nextInt();
    char result = findMostFrequentChar(input);
        System.out.println("Most Frequent Character: '" + result + "'");
    }
}
