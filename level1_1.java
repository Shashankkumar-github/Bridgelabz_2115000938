import java.util.*;

public class level1_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Principal:");
        int principal = scn.nextInt();
        System.out.println("Enter Rate:");
        int rate = scn.nextInt();
        System.out.println("Enter Time:");
        int time = scn.nextInt();

        int simpleInterest = calculate(principal, rate, time);

        
        System.out.println("The Simple Interest is " + simpleInterest + 
                           " for Principal " + principal + 
                           ", Rate of Interest " + rate + 
                           ", and Time " + time);
    }

    public static int calculate(int principal, int rate, int time) {
        return (principal * rate * time) / 100;
    }
}
