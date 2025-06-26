import java.util.Scanner;

public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    // Constructor
    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and setters
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid or insufficient amount.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a bank account
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        int accNumber = scanner.nextInt();

        System.out.print("Enter Initial Balance: ");
        int initialBalance = scanner.nextInt();

        BankAccount account = new BankAccount(name, accNumber, initialBalance);

        // Perform deposit
        System.out.print("Enter amount to deposit: ");
        int depositAmount = scanner.nextInt();
        account.deposit(depositAmount);

        // Perform withdrawal
        System.out.print("Enter amount to withdraw: ");
        int withdrawAmount = scanner.nextInt();
        account.withdraw(withdrawAmount);

        // Balance Inquiry
        int currentBalance = account.getBalance();
        System.out.println("Current Balance: ₹" + currentBalance);

        // Status using ternary operator
        String status = (currentBalance >= 5000)
            ? "Minimum Balance Maintained"
            : "Minimum Balance not Maintained";
        System.out.println("Status: " + status);

        scanner.close();
    }
}