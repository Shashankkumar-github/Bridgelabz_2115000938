import java.util.Scanner;
public class day8_string_2{
    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("enter the string : ");
	String str = scn.nextLine();
        System.out.println(reverse(str));
    }
}
