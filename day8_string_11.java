import java.util.Arrays;
import java.util.Scanner;

public class day8_string_11{
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out,println("enter the string :");
	String s1 = scn.nextLine();
	System.out.println("enter the string:");
	String s2 = scn.nextLine();
        System.out.println(areAnagrams(s1,s2));
    }
}
