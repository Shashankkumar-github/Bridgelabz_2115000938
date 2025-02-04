class BankAccount {
    private static String bankName = "SBI Bank";
    private static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;
    
   
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
    
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Raj Singh", 101);
        acc1.displayDetails();
        
        BankAccount acc2 = new BankAccount("Shashank Singh", 102);
        acc2.displayDetails();

        BankAccount.getTotalAccounts();
    }
}
