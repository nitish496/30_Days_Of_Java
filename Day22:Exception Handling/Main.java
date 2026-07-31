
/*
==========================================
        DAY 22 - EXCEPTION HANDLING
==========================================

Topics Covered:
1. Basic try-catch-finally
2. Multiple catch blocks
3. The 'finally' block
4. The 'throw' keyword (Manual Exception)
5. The 'throws' keyword (Method Signature)
6. Custom Exception (User-Defined)
7. Nested try-catch blocks
8. IllegalArgumentException
9. Checked Exceptions (File I/O)
10. Real-World Exception (Banking System)

Author: Nitish
==========================================
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// =========================================
// Custom Exception Class for Program 6
// =========================================
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

// =========================================
// Real-World Class for Program 10
// =========================================
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            // Throwing exception if balance is insufficient
            throw new IllegalArgumentException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal Successful.");
        System.out.println("Remaining Balance: ₹" + balance);
    }
}

public class Main {

    // =========================================
    // Program 1 - Basic try-catch-finally
    // =========================================
    static void program1() {
        System.out.println("===== Program 1: Basic try-catch =====");
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: Cannot be divisible by zero.");
        } finally {
            System.out.println("Program ended.\n");
        }
    }

    // =========================================
    // Program 2 - Multiple catch blocks
    // =========================================
    static void program2() {
        System.out.println("===== Program 2: Multiple catch blocks =====");
        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        }
        System.out.println();
    }

    // =========================================
    // Program 3 - The 'finally' block
    // =========================================
    static void program3() {
        System.out.println("===== Program 3: The 'finally' block =====");
        try {
            int result1 = 10 / 0;
            System.out.println(result1);
        } catch (ArithmeticException e) {
            System.out.println("Cannot be divisible by zero.");
        } finally {
            System.out.println("Finally block executed regardless of exception.");
        }
        System.out.println("Program ended.\n");
    }

    // =========================================
    // Program 4 - The 'throw' keyword
    // =========================================
    static void program4() {
        System.out.println("===== Program 4: The 'throw' keyword =====");
        int age = 16;
        try {
            if (age < 18) {
                // Manually throwing an exception
                throw new ArithmeticException("Age must be 18 or above.");
            } else {
                System.out.println("You are eligible.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block has been executed.");
        }
        System.out.println("Program ended.\n");
    }

    // =========================================
    // Program 5 - The 'throws' keyword
    // =========================================
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above.");
        }
        System.out.println("You are eligible.");
    }

    // =========================================
    // Program 6 - Custom Exception
    // =========================================
    static void ageCheck(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be above 18.");
        }
        System.out.println("You are eligible.");
    }

    // =========================================
    // Program 7 - Nested try-catch blocks
    // =========================================
    static void program7() {
        System.out.println("===== Program 7: Nested try-catch =====");
        try {
            System.out.println("Outer try block executing...");
            try {
                int[] arr = {10, 20, 30};
                System.out.println(arr[6]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch: Array index is out of bounds.");
            }
            // This will trigger the outer catch
            int result = 10 / 0;
            System.out.println(result);
            
        } catch (ArithmeticException e) {
            System.out.println("Outer Catch: Arithmetic exception - cannot divide by zero.");
        }
        System.out.println("Program ended.\n");
    }

    // =========================================
    // Program 8 - IllegalArgumentException
    // =========================================
    static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    static void program8() {
        System.out.println("===== Program 8: IllegalArgumentException =====");
        try {
            validateAge(20);
            validateAge(-5); // This will throw the exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
        System.out.println("Program ended.\n");
    }

    // =========================================
    // Program 9 - Checked Exception (File I/O)
    // =========================================
    static void program9() {
        System.out.println("===== Program 9: Checked Exception (File I/O) =====");
        try {
            // Attempting to read a file that might not exist
            File file = new File("student.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception Caught: File not found.");
        }
        System.out.println("Program ended.\n");
    }

    // =========================================
    // Program 10 - Real-World Exception (Banking)
    // =========================================
    static void program10() {
        System.out.println("===== Program 10: Real-World Exception (Banking) =====");
        BankAccount account = new BankAccount(5000);

        try {
            // Attempting to withdraw more than the balance
            account.withdraw(7000);
        } catch (IllegalArgumentException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }

        System.out.println("Thank you for using our Banking System.\n");
    }

    // =========================================
    // Main Method - Execution
    // =========================================
    public static void main(String[] args) {
        program1();
        program2();
        program3();
        program4();

        // Program 5 Execution
        System.out.println("===== Program 5: The 'throws' keyword =====");
        try {
            checkAge(19); // Try passing 16 to see the exception
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
        System.out.println("Program ended.\n");

        // Program 6 Execution
        System.out.println("===== Program 6: Custom Exception =====");
        try {
            ageCheck(16); // Will throw InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
        System.out.println("Program ended.\n");

        program7();
        program8();
        program9();
        
        // Execute the newly added Program 10
        program10();
    }
}

/*
==========================================
End of Day 22

Next Topic:
Multithreading
==========================================
*/
```