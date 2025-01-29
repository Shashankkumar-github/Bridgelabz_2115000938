import jaca.util.Scanner;
public class day8_string_10{
    public static String removeCharacter(String str, char ch) {
        return str.replace(Character.toString(ch), "");
    }

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("enter the string:")
	String str = scn.nextInt();
	System.out.println("enter the character:");
	char ch = scn.next().charAt(0);
        System.out.println(removeCharacter(str,ch));
    }
}
