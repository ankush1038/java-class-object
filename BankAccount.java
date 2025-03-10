import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input for bank account details
        System.out.println("Enter Account Holder Name : ");
        String accountHolder = sc.nextLine();

        System.out.println("Enter Account Number : ");
        long accountNumber = sc.nextLong();

        System.out.println("Enter Initial Balance : ");
        double balance = sc.nextDouble();

        // Creating a BankAccount object with user input
        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);

        // Performing ATM-like operations
        while (true) {
            System.out.println("\n==== ATM Menu ====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option : ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Amount to Deposit : ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter Amount to Withdraw : ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting... Thank You!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Attributes (fields)
    private String accountHolder;
    private long accountNumber;
    private double balance;

    // Constructor to initialize BankAccount object
    public BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited : $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money (only if sufficient balance exists)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn : $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("==== Account Details ====");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance : $" + balance);
    }
}
