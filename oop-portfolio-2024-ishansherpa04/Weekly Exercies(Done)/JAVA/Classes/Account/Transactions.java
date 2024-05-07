package Account;

public class Transactions {
    public static void main(String[] args) {
        // Creating an account with name, account number, and initial balance
        Account account1 = new Account("John Doe", 1234567890, 1000.0);

        // Creating an account with just name and account number (balance initialized to zero)
        Account account2 = new Account("Jane Smith", 987654320);

        // Demonstrating transactions for account1
        System.out.println("Account 1 - Initial Balance: " + account1.getBalance());
        account1.deposit(500.0);
        account1.withdraw(200.0);
        System.out.println("Account 1 - Final Balance: " + account1.getBalance());

        // Demonstrating transactions for account2
        System.out.println("\nAccount 2 - Initial Balance: " + account2.getBalance());
        account2.deposit(1000.0);
        account2.withdraw(700.0);
        System.out.println("Account 2 - Final Balance: " + account2.getBalance());
    }
}
