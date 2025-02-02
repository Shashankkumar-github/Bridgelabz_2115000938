import java.util.Scanner;

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Account Number: " + accountNumber + ", Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accountNumber = scn.nextInt();
        scn.nextLine(); 

        System.out.print("Enter Account Holder Name: ");
        String accountHolder = scn.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = scn.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountHolder, balance);
        account.displayAccountDetails();
 
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scn.nextDouble();
        account.deposit(depositAmount);
        account.displayAccountDetails();

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scn.nextDouble();
        account.withdraw(withdrawAmount);
        account.displayAccountDetails();

        
    }
}
