import java.util.Scanner;

public class StringCompare{
    public static void compareStrings(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) < s2.charAt(i)) {
                    System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
                } else {
                    System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
                }
                return;
            }
        }
        if (s1.length() < s2.length()) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
        } else if (s1.length() > s2.length()) {
            System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
        } else {
            System.out.println("Both strings are equal");
        }
    }

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("enter the first string :");
	String str1 = scn.nextLine();
	System.out.println("enter the second string :");
	String str2 = scn.nextLine();
        compareStrings(str1,str2);
    }
}
