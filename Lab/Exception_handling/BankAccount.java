package Exception_handling;

import java.util.Scanner;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientFundException {
        if (amount > balance) {
            throw new InsufficientFundException("Insufficient Balance in your account!");
        } else {
            System.out.println("Withdrawing...");
            balance -= amount;
            System.out.println("Your new balance: " + balance);
        }
    }

    public void display() {
        System.out.println("\nAccount Details:");
        System.out.println("Balance: " + balance);
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount newAccount = new BankAccount(1200);
        newAccount.display();
        System.out.println("Enter the amount to be withdrawn:");
        int amount = input.nextInt();
        try {
            newAccount.withdraw(amount);
        } catch (InsufficientFundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        input.close();
    }
}

class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }
}
