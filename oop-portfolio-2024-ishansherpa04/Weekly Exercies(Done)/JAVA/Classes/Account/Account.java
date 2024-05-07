package Account;

public class Account {
    private String name;
    private long accountNumber;
    private double balance;

    // Constructor with name, accountNumber, and initialBalance
    public Account(String name, long accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Constructor with name and accountNumber (balance initialized to zero)
    public Account(String name, long accountNumber) {
        this(name, accountNumber, 0.0);
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for accountNumber
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit funds into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw funds from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

