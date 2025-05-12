package Oops.encapsulation;

class BankAccount {
    private double balance;  // internal state (private)

    // Constructor to initialize balance
    public BankAccount(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Initial balance must be positive.");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Setter for withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

