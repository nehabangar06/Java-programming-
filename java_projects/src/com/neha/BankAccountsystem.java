package com.neha;

abstract class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String holder, int number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    void showBalance() {
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String holder, int number, double balance) {
        super(holder, number, balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited to Savings Account");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn from Savings Account");
        } else {
            System.out.println("Insufficient balance in Savings Account");
        }
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(String holder, int number, double balance) {
        super(holder, number, balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited to Current Account");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn from Current Account");
        } else {
            System.out.println("Insufficient balance in Current Account");
        }
    }
}

public class BankAccountsystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("Siddhi", 101, 5000);
        BankAccount acc2 = new CurrentAccount("Kadam", 102, 10000);

        acc1.deposit(1500);
        acc1.withdraw(2000);
        acc1.showBalance();

        acc2.deposit(5000);
        acc2.withdraw(12000);
        acc2.showBalance();
    }
}
	

