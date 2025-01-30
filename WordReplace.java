import java.util.Scanner;

public class WordReplace{
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("enter the sentence:");
	String str1 = scn.nextLine();
	System.out.println("enter the oldword:");
	String str2 = scn.nextLine();
	System.out.println("enter the newWord:");
	String str3 = scn.nextLine();
	
    System.out.println(replaceWord(str1,str2,str3));
    }
}
