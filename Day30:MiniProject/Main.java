import java.util.*;
import java.io.*;

// =========================================
// Day 30 - Final Project
// Banking Management System 
// =========================================

// ---- ABSTRACT CLASS (Day 20) ----
// "Account" is a general idea. You can't open a plain "Account" —
// you open a Savings or Current account. That's why it's abstract.
abstract class Account {
    private int accountNo;              // Encapsulation (Day 17)
    private String holderName;
    protected double balance;           // protected so child classes can use it

    public Account(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNo() { return accountNo; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    // Each account type MUST write its own version of these two
    public abstract double calculateInterest();
    public abstract String getType();

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    @Override
    public String toString() {
        return accountNo + " | " + holderName + " | " + getType() + " | " + balance;
    }
}

// ---- INHERITANCE (Day 18) ----
class SavingsAccount extends Account {

    public SavingsAccount(int accountNo, String name, double balance) {
        super(accountNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04;      // savings earns 4%
    }

    @Override
    public String getType() {
        return "SAVINGS";
    }
}

class CurrentAccount extends Account {

    public CurrentAccount(int accountNo, String name, double balance) {
        super(accountNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return 0;                   // current account earns nothing
    }

    @Override
    public String getType() {
        return "CURRENT";
    }
}

// ---- MAIN APPLICATION ----
public class Main {

    public static void main(String[] args) {

        Account acc1 = new SavingsAccount(1001, "Nitish", 25000);

        System.out.println("ACC | NAME | TYPE | BALANCE");
        System.out.println("---------------------------");
        System.out.println(acc1);
        System.out.println("Interest on this account: " + acc1.calculateInterest());

        Account acc2 = new CurrentAccount(1002, "Aarav", 40000);
        System.out.println(acc2);

        System.out.println("\nOne Account reference, two different rules:");
        for (Account acc : new Account[] { acc1, acc2 }) {
            System.out.println(acc.getType() + " earns " + acc.calculateInterest());
        }

        System.out.println("\n--- Depositing money ---");
        acc1.deposit(5000);
        acc2.deposit(-100);
    }
}