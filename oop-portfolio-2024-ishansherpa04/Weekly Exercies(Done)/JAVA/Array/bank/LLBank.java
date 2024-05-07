package bank;

import java.util.Scanner;

public class LLBank {
	private static final int MAX_ACCOUNTS = 30;
    private static BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];
    private static int numAccounts = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            handleChoice(choice, scanner);
        } while (choice != 5);
    }

    private static void displayMenu() {
        System.out.println("\nL&L Bank");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Add Interest");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void handleChoice(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                createAccount(scanner);
                break;
            case 2:
                makeDeposit(scanner);
                break;
            case 3:
                makeWithdrawal(scanner);
                break;
            case 4:
                addInterest();
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }

    private static void createAccount(Scanner scanner) {
        if (numAccounts >= MAX_ACCOUNTS) {
            System.out.println("Cannot create more accounts. Maximum limit reached.");
            return;
        }

        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();

        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.next();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountHolderName, initialBalance);
        accounts[numAccounts++] = account;

        System.out.println("Account created successfully.");
    }

    private static void makeDeposit(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();

        BankAccount account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();

        account.deposit(amount);
    }

    private static void makeWithdrawal(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();

        BankAccount account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();

        account.withdraw(amount);
    }

    private static void addInterest() {
        for (int i = 0; i < numAccounts; i++) {
            BankAccount account = accounts[i];
            double interest = account.getBalance() * 0.03;
            account.deposit(interest);
            System.out.println("Interest added to account " + account.getAccountNumber() + ": $" + interest);
        }
    }

    private static BankAccount findAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }

}
