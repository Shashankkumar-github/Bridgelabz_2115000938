import java.util.Scanner;

public class LongestWord {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("enter the string :");
	string str = scn.nextLine():
	
        System.out.println(findLongestWord(str));
    }
}
