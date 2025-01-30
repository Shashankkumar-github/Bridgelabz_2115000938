import java.util.Scanner;
public class OccurenceCount {

    public static int countOccurrences(String str, String sub) {
        int count = 0, index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("enter the first string :");
	String str = scn.nextLine();
	System.out.println("enter the second string :");
	String sub =scn.nextLine();
        System.out.println(countOccurrences(str,sub));
    }
}
