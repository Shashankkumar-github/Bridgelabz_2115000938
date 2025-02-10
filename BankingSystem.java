
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + ", New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + ", New Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + holderName + ", Balance: $" + balance);
    }
}


class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04; // 4% interest

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return 0; 
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("S12345", "John Doe", 5000);
        BankAccount current = new CurrentAccount("C67890", "Jane Smith", 8000);

        savings.displayDetails();
        System.out.println("Interest Earned: $" + savings.calculateInterest());

        current.displayDetails();
        System.out.println("Interest Earned: $" + current.calculateInterest());
    }
}
