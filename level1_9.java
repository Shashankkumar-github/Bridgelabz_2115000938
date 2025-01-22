import java.util.Scanner;

public class level1_9 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	 System.out.print("Enter fee: ");
        double userFee = input.nextDouble();
        System.out.print("Enter discount percent: ");
        double userDiscountPercent = input.nextDouble();
        double userDiscountAmount = userFee * (userDiscountPercent / 100);
        double userDiscountedFee = userFee - userDiscountAmount;
        System.out.println("The discount amount is INR " + userDiscountAmount + 
                           " and final discounted fee is INR " + userDiscountedFee);
						   }
						   }