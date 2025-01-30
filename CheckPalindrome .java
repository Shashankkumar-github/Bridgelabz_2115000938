import java.util.Scanner;
public class CheckPalindrome  {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in):
	System.out.println("enter the string :");
	String str = scn.nextLine();
        System.out.println(isPalindrome(str));
    }
}
