import java.util.Scanner;

public class RemoveDuplicates{
    public static String removeDuplicates(String str) {
        boolean[] seen = new boolean[256]; 
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!seen[ch]) { 
                result.append(ch);
                seen[ch] = true; 
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("enter the string :");
	String str = scn.nextLine();
        System.out.println(removeDuplicates(str));
    }
}
