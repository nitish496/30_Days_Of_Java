import java.util.*;
import java.io.*;

// =========================================
// Day 30 - Final Project
// Banking Management System 
// =========================================

// ---- CUSTOM EXCEPTIONS (Day 22) ----
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String msg) {
        super(msg);
    }
}

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

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough money. Balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + ". New balance: " + balance);
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

    // POLYMORPHISM (Day 19)
    // Same method name, different rule: current accounts can go 5000 negative
    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance + 5000) {
            throw new InsufficientFundsException("Overdraft limit crossed.");
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + ". New balance: " + balance);
    }
}

// ---- MAIN APPLICATION ----
public class Main {

    // Collections (Day 24) - stores all accounts
    static Map<Integer, Account> accounts = new LinkedHashMap<>();
    static Scanner sc = new Scanner(System.in);

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

        System.out.println("\n--- Withdrawing money ---");
        try {
            acc1.withdraw(2000);
            acc1.withdraw(999999);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- Current account overdraft ---");
        try {
            acc2.withdraw(42000);       // allowed, dips into the 5000 cushion
            acc2.withdraw(10000);       // rejected, past the cushion
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- Every account in one registry ---");
        accounts.put(acc1.getAccountNo(), acc1);
        accounts.put(acc2.getAccountNo(), acc2);
        accounts.put(1003, new SavingsAccount(1003, "Meera", 12000));
        viewAll();

        System.out.println("\n--- Interest report ---");
        showInterest();

        System.out.println("\n--- Saving and reloading from file ---");
        saveToFile();
        accounts.clear();
        loadFromFile();
        viewAll();

        System.out.println("\n--- Registry lookup used by the console helpers ---");
        Account found = accounts.get(1001);
        if (found == null) {
            System.out.println("No account with number 1001");
        } else {
            System.out.println("Found: " + found);
            found.deposit(1500);
        }
    }

    // ---- 1. Open Account ----
    static void openAccount() {
        System.out.print("Account No: ");
        int accNo = Integer.parseInt(sc.nextLine());

        if (accounts.containsKey(accNo)) {
            System.out.println("This account number already exists.");
            return;
        }

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Opening Balance: ");
        double balance = Double.parseDouble(sc.nextLine());
        System.out.print("Type (1 = Savings, 2 = Current): ");
        int type = Integer.parseInt(sc.nextLine());

        Account acc;
        if (type == 1) {
            acc = new SavingsAccount(accNo, name, balance);
        } else {
            acc = new CurrentAccount(accNo, name, balance);
        }

        accounts.put(accNo, acc);
        System.out.println(acc.getType() + " account created for " + name);
    }

    // ---- 2. View All ----
    static void viewAll() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts yet.");
            return;
        }
        System.out.println("ACC | NAME | TYPE | BALANCE");
        System.out.println("---------------------------");
        for (Account acc : accounts.values()) {
            System.out.println(acc);
        }
    }

    // ---- Helper: find an account or throw ----
    static Account findAccount() throws AccountNotFoundException {
        System.out.print("Account No: ");
        int accNo = Integer.parseInt(sc.nextLine());
        Account acc = accounts.get(accNo);
        if (acc == null) {
            throw new AccountNotFoundException("No account with number " + accNo);
        }
        return acc;
    }

    // ---- 3. Deposit ----
    static void deposit() throws AccountNotFoundException {
        Account acc = findAccount();
        System.out.print("Amount: ");
        acc.deposit(Double.parseDouble(sc.nextLine()));
    }

    // ---- 4. Withdraw ----
    static void withdraw() throws AccountNotFoundException, InsufficientFundsException {
        Account acc = findAccount();
        System.out.print("Amount: ");
        acc.withdraw(Double.parseDouble(sc.nextLine()));
    }

    // ---- 5. Show Interest ----
    static void showInterest() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts yet.");
            return;
        }
        // Same method call, different result per account type = POLYMORPHISM
        for (Account acc : accounts.values()) {
            System.out.println(acc.getHolderName() + " earns: " + acc.calculateInterest());
        }
    }

    // ---- 6. Save to File (Day 23) ----
    static void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("accounts.txt"))) {
            for (Account acc : accounts.values()) {
                writer.write(acc.getType() + "," + acc.getAccountNo() + ","
                           + acc.getHolderName() + "," + acc.getBalance());
                writer.newLine();
            }
            System.out.println("Saved to accounts.txt");
        } catch (IOException e) {
            System.out.println("Could not save: " + e.getMessage());
        }
    }

    // ---- 7. Load from File (Day 23) ----
    static void loadFromFile() {
        File file = new File("accounts.txt");
        if (!file.exists()) {
            System.out.println("No saved file found.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("accounts.txt"))) {
            accounts.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String type = parts[0];
                int accNo = Integer.parseInt(parts[1]);
                String name = parts[2];
                double balance = Double.parseDouble(parts[3]);

                Account acc;
                if (type.equals("SAVINGS")) {
                    acc = new SavingsAccount(accNo, name, balance);
                } else {
                    acc = new CurrentAccount(accNo, name, balance);
                }
                accounts.put(accNo, acc);
            }
            System.out.println("Loaded " + accounts.size() + " accounts.");
        } catch (IOException e) {
            System.out.println("Could not load: " + e.getMessage());
        }
    }
}