# 📅 Day 22 – Exception Handling

Welcome to Day 22! 🚀 Today, we make our code bulletproof. 
Exception Handling is the mechanism we use to handle runtime errors so that the normal flow of the application is maintained. Stop your programs from crashing! 🛡️

✅ try-catch | ✅ finally | ✅ throw & throws | ✅ Custom Exceptions 

---

# 📖 Quick Intro
- 💥 **Exception:** An unwanted runtime event that disrupts the normal flow of the program.
- 🧯 **try-catch:** The `try` block holds risky code; the `catch` block catches the explosion.
- 🧹 **finally:** A block that runs *no matter what*, used for closing files/connections.
- 🎯 **throw:** Used to manually trigger an exception (great for validation).
- 📨 **throws:** Used in a method signature to pass responsibility to whoever called the method.

---

# =========================================
# 1. Basic try-catch-finally 🛡️
# =========================================
**🎯 Objective:** Catch a mathematical error and prevent a crash.
```java
try {
    int result = 10 / 0; // 💥 This explodes!
    System.out.println(result);
} catch (ArithmeticException e) {
    System.out.println("Exception Caught: Cannot be divisible by zero.");
} finally {
    System.out.println("Program ended safely.");
}
```

---

# =========================================
# 2. Multiple catch blocks 🥅
# =========================================
**🎯 Objective:** Handle different types of errors uniquely.
```java
try {
    int[] arr = {10, 20, 30};
    System.out.println(arr[5]); // 💥 Array index doesn't exist!
} catch (ArithmeticException e) {
    System.out.println("Math error: " + e.getMessage());
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array error: " + e.getMessage()); // 👈 This catches it!
}
```

---

# =========================================
# 3. The 'finally' block 🧹
# =========================================
**🎯 Objective:** Prove that `finally` executes regardless of what happens in `try` or `catch`.
```java
try {
    int result1 = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot be divisible by zero.");
} finally {
    // This executes EVERY time, used for resource cleanup!
    System.out.println("Finally block executed."); 
}
```

---

# =========================================
# 4. The 'throw' keyword (Manual Exception) 🎯
# =========================================
**🎯 Objective:** Manually force an error to occur based on business logic.
```java
int age = 16;
try {
    if (age < 18) {
        // 🎯 Manually throwing the exception!
        throw new ArithmeticException("Age must be 18 or above.");
    } else {
        System.out.println("You're eligible.");
    }
} catch (ArithmeticException e) {
    System.out.println(e.getMessage());
}
```

---

# =========================================
# 5. The 'throws' keyword 📨
# =========================================
**🎯 Objective:** Pass the responsibility of handling the error to the caller.
```java
// Method signature declares it throws an exception!
static void checkAge(int age) throws ArithmeticException {
    if (age < 18) {
        throw new ArithmeticException("Age must be 18 or above.");
    }
    System.out.println("You are eligible.");
}

// In main method:
// try { checkAge(19); } catch (ArithmeticException e) { ... }
```

---

# =========================================
# 6. Custom Exception 🛠️
# =========================================
**🎯 Objective:** Create your own user-defined Exception class!
```java
// 1. Create the Custom Exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) { super(message); }
}

// 2. Use it!
static void ageCheck(int age) throws InvalidAgeException {
    if (age < 18) throw new InvalidAgeException("Age must be above 18.");
    System.out.println("You are eligible");
}
```

---

# =========================================
# 7. Nested try-catch blocks 🪆
# =========================================
**🎯 Objective:** Put a try-catch inside another try-catch!
```java
try {
    System.out.println("Outer try block.");
    try {
        int[] arr = {10, 20, 30};
        System.out.println(arr[6]); // Caught by inner!
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Inner catch array index out of bounds.");
    }
    int result = 10 / 0; // Caught by outer!
} catch (ArithmeticException e) {
    System.out.println("Outer catch: cannot divide by zero.");
}
```

---

# =========================================
# 8. IllegalArgumentException ⚖️
# =========================================
**🎯 Objective:** Throw a built-in Java exception for bad arguments.
```java
static void validateAge(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative.");
    }
    System.out.println("Valid age: " + age);
}
```

---

# =========================================
# 9. Checked Exceptions (File I/O) 📁
# =========================================
**🎯 Objective:** Handle exceptions that the Java Compiler *forces* you to handle.
```java
try {
    File file = new File("student.txt");
    Scanner scanner = new Scanner(file); // 💥 Might throw FileNotFoundException!
    while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
    }
    scanner.close();
} catch (FileNotFoundException e) {
    System.out.println("Exception Caught: File not found");
}
```

---

# =========================================
# 10. Real-World: Banking System 🏦
# =========================================
**🎯 Objective:** Prevent a user from withdrawing more than their balance.
```java
class BankAccount {
    private double balance;
    public BankAccount(double balance) { this.balance = balance; }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Remaining Balance: ₹" + balance);
    }
}
// Try catching this in main: account.withdraw(7000);
```

---

# 🧠 5 Quick Interview Questions
1. **Difference between Error and Exception?** Errors are irrecoverable (like `OutOfMemory`), Exceptions are recoverable runtime issues.
2. **Difference between `throw` and `throws`?** `throw` actually creates and throws the exception. `throws` goes in the method signature to warn callers.
3. **What is a `finally` block?** A block of code that executes no matter what, usually used for closing files and databases.
4. **Checked vs Unchecked Exceptions?** Checked exceptions are checked at compile-time (like `IOException`). Unchecked happen at runtime (like `ArithmeticException`).
5. **Does `finally` run if there is a `return` statement in the `try` block?** YES! `finally` almost always runs.

---

# ❓ 5 Practice Questions
1. 📝 Create a `try-catch` block that catches a `NullPointerException`.
2. 💻 Use multiple `catch` blocks for one `try` block. Make sure `Exception e` is at the very bottom.
3. 🛑 Use the `throw` keyword to throw an `ArithmeticException` if a password is less than 6 characters.
4. 🦸‍♂️ Create a Custom Exception called `InvalidPinException` and throw it if an ATM pin is wrong.
5. 🔀 Write a `try-finally` block without a catch block.

---

# ⭐ 5 Challenge Programs
1. 🏦 Build an ATM system that throws custom `InsufficientFundsException` and `InvalidCardException`.
2. 👨‍💻 Create an array of size 5. Take user input in a loop to add elements. Handle the exception when the user exceeds the array limit.
3. 🛒 Build a Shopping Cart. Throw an `ItemNotFoundException` if the user searches for an item not in the store.
4. 💥 Intentionally create a nested `try-catch` where the inner `try` throws an error that only the outer `catch` can handle.
5. 🤫 Try to read data from a file that doesn't exist, catch the `FileNotFoundException`, and create the file inside the catch block!

---

> *"Hope for the best, but handle the exceptions."* 🛡️

---

# 🚀 Next Day Preview: Day 23 – File Handling
Now that you know how to safely handle exceptions like `FileNotFoundException`, you are ready to interact with the Operating System! 

Tomorrow, we dive into **File Handling**. You will learn how to Create files, Read text from files, Write data to files, and Delete files using Java. Get ready to make your data permanent! 📁💾🔥
```