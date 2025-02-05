import java.util.ArrayList;
import java.util.List;

public class BankAssociation {
    public static void main(String[] args) {
        
        Bank bank1 = new Bank("SBI Bank");
        Bank bank2 = new Bank("Axis Bank");

     
        Customer customer1 = new Customer("Raj singh");
        Customer customer2 = new Customer("himanshu rai");
		
        bank1.openAccount(customer1, 1000.0);
        bank1.openAccount(customer2, 1500.0);
        bank2.openAccount(customer1, 2000.0);

        
        customer1.viewBalance();
        customer2.viewBalance();
    }
}


class Bank {
    private String bankName;
    private List<Customer> customers; 

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, double initialDeposit) {
        BankAccount account = new BankAccount(this, initialDeposit);
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println(customer.getName() + " opened an account in " + bankName + " with balance: $" + initialDeposit);
    }

    public String getBankName() {
        return bankName;
    }
}


class Customer {
    private String name;
    private List<BankAccount> accounts; 

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewBalance() {
		System.out.println();
        System.out.println( name + " Accounts:");
        for (BankAccount account : accounts) {
            System.out.println("Bank: " + account.getBank().getBankName() + ", Balance: $" + account.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

class BankAccount {
    private Bank bank;
    private double balance;

    public BankAccount(Bank bank, double balance) {
        this.bank = bank;
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }
}
