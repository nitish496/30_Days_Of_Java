Here is the final, polished version! I have removed Programs 10, 11, and 12, cleaned up the summary table, and added a great motivational quote right at the end for your readers!

***

# ☕ Day 09 – Methods (Functions)

> *"Don't write the same code twice. Write a Method once, and use it a thousand times!"*

---

# 📋 Preview of Today's Learning

Welcome to Day 09! As your code grows larger, writing everything in one place becomes messy and hard to read. Today, you will learn how to write **Methods**. Methods allow you to group code into small, organized blocks that you can reuse anywhere in your program.

---

# 🌟 What is a Method?

A **Method** is a block of code designed to perform a specific task. It remains silent and only executes when it is explicitly "called."

### 🤔 Why Are Methods Needed?
**❌ Without Methods (Repeating Code):**
```java
System.out.println("Welcome to Java!");
System.out.println("Welcome to Java!");
```

**✅ With Methods (Write once, use anywhere):**
```java
printMessage();
printMessage();
```

### 🟢 Advantages of Methods:
- **Code Reusability:** Write code once, use it a hundred times!
- **Easy Debugging:** If your addition math is wrong, you only fix the `addNumbers()` method, instead of fixing it in 50 different places.

---

# 🏗 Method Syntax

Every method in Java follows this structure:

```java
public static void printHello() {
    System.out.println("Hello, Java!");
}
```

- **`public`**: Anyone can use this method.
- **`static`**: We don't need to create an object to use it.
- **`void`**: The Return Type. `void` means this method performs an action but gives no data back.
- **`printHello`**: The name we chose for our method.
- **`()`**: The Parameter list.

### 📌 Method Calling
Defining a method doesn't run it! To make it actually run, you must "call" it from inside your `main` method: `printHello();`

---

# 📌 Parameters vs Arguments

### 📥 Parameters
Variables defined *inside* the method declaration. They act as "empty placeholders".
```java
// 'name' is the Parameter!
public static void greet(String name) 
```

### 📤 Arguments
The actual, real data you pass into the method when you call it.
```java
// "Nitish" is the Argument!
greet("Nitish"); 
```

---

# 📌 The `return` Keyword & Return Type

The `return` keyword is how a method hands calculated data back to whoever called it. As soon as Java hits `return`, the method instantly stops! 

If you want to return a number instead of just printing it, you must replace `void` with a data type:
- `int` 👉 `return 10;`
- `double` 👉 `return 5.5;`

---

# 📌 Flow of Method Execution

When you call a method, the `main` method pauses. Java jumps to the method, runs the code, and then jumps right back to where it left off!

```text
[ main() starts ]
       ↓
int ans = addNumbers(5, 5);  ───(JUMP!)───▶ public static int addNumbers(int a, int b) {
                                                return a + b;
                             ◀──(RETURN)─── }
       ↓
System.out.println(ans);
```

---

# 📚 Programs Covered

### 1️⃣ Print Hello Using a Method
```java
public class Program1 {
    public static void printHello() {
        System.out.println("Hello, Java!");
    }
    public static void main(String[] args) {
        printHello(); // Method Call
    }
}
```
**Output:** `Hello, Java!`

### 2️⃣ Call Method Multiple Times
```java
public class Program2 {
    public static void printMessage() {
        System.out.println("Learning Java is fun!");
    }
    public static void main(String[] args) {
        printMessage();
        printMessage();
    }
}
```
**Output:** Prints "Learning Java is fun!" twice.

### 3️⃣ Method with Parameters
```java
public class Program3 {
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static void main(String[] args) {
        greet("Nitish"); 
        greet("Rahul");  
    }
}
```
**Output:** `Hello, Nitish!` then `Hello, Rahul!`

### 4️⃣ Add Two Numbers (`void`)
```java
public class Program4 {
    public static void addNumbers(int firstNumber, int secondNumber) {
        System.out.println("Sum is: " + (firstNumber + secondNumber));
    }
    public static void main(String[] args) {
        addNumbers(10, 20);
    }
}
```
**Output:** `Sum is: 30`

### 5️⃣ Find Square of a Number
```java
public class Program5 {
    public static void findSquare(int number) {
        System.out.println("Square is: " + (number * number));
    }
    public static void main(String[] args) {
        findSquare(5);
    }
}
```
**Output:** `Square is: 25`

### 6️⃣ Find Maximum of Two Numbers
```java
public class Program6 {
    public static void findMaximum(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println("Maximum is: " + firstNumber);
        } else {
            System.out.println("Maximum is: " + secondNumber);
        }
    }
    public static void main(String[] args) {
        findMaximum(45, 90);
    }
}
```
**Output:** `Maximum is: 90`

### 7️⃣ Check Even or Odd
```java
public class Program7 {
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }
    public static void main(String[] args) {
        checkEvenOdd(7);
    }
}
```
**Output:** `7 is Odd.`

### 8️⃣ Method Returning a Value (`int`)
```java
public class Program8 {
    public static int addNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber; // Hands data back!
    }
    public static void main(String[] args) {
        int result = addNumbers(10, 20); 
        System.out.println("Result: " + result); 
    }
}
```
**Output:** `Result: 30`

### 9️⃣ Find Factorial Using a Method
```java
public class Program9 {
    public static int findFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println("Factorial is: " + findFactorial(5));
    }
}
```
**Output:** `Factorial is: 120`

---

# 🧠 Dry Run: Factorial `findFactorial(5)`

| `i` | `factorial` (Before) | Math | `factorial` (After) |
| :--- | :--- | :--- | :--- |
| **1** | `1` | `1 * 1` | `1` |
| **2** | `1` | `1 * 2` | `2` |
| **3** | `2` | `2 * 3` | `6` |
| **4** | `6` | `6 * 4` | `24` |
| **5** | `24` | `24 * 5` | `120` 👉 **Returned!** |

---

# ⚠️ Common Mistakes & Best Practices

❌ **Using `return` in a `void` method:** You cannot return data if you promised Java `void`.
❌ **Wrong parameter count:** If a method requires 2 parameters, passing only 1 will crash the program.
✅ **Meaningful Names:** Name methods exactly what they do (e.g. `checkEvenOdd`).
✅ **One Task:** A method should perform exactly ONE specific task.

---

# 🎯 Top 5 Interview Questions

**1. Difference between a parameter and an argument?**
> A parameter is the variable defined in the method signature. An argument is the actual data passed in when calling it.

**2. Difference between `void` and `return`?**
> `void` means the method performs an action but gives no data back. A return type (like `int`) hands calculated data back to the caller.

**3. What happens if you put code *after* a `return` statement?**
> Java will throw a compiler error because the method instantly stops at the `return` keyword.

**4. What is Method Overloading?**
> Creating multiple methods with the exact same name, but with a different number or type of parameters.

**5. How does Java know which Overloaded method to call?**
> By looking at the number and data types of the arguments you pass in.

---

# 📋 Summary Table

| Program | Concept Learned |
| :--- | :--- |
| **1-2. Hello / Multiple** | Basic `void` methods and code reusability. |
| **3. Parameters** | Passing Arguments into Parameters. |
| **4-5. Add / Square** | Internal arithmetic calculations in a `void` method. |
| **6-7. Max / EvenOdd** | Using conditionals (`if-else`, `%`) inside methods. |
| **8-9. Returns** | Using the `return` keyword for `int`. |

---

# 📝 5 Key Takeaways

1. Methods are reusable blocks of code that perform specific tasks.
2. Parameters are the placeholders; Arguments are the actual data passed in.
3. `void` means no data is returned. Data types (`int`, `double`) require the `return` keyword.
4. The `return` keyword instantly terminates the method.
5. Method Overloading allows multiple methods to share the exact same name.

---

# 🧩 3 Quick Practice Challenges

1. Write a method `subtract(int a, int b)` that prints their difference.
2. Write a method `findArea(double radius)` that returns the area of a circle.
3. Write an overloaded method `calculateArea()` for both a Square and a Rectangle.

---

# 🏆 Conclusion

Absolutely phenomenal job! By mastering **Methods**, you are no longer writing messy, amateur scripts—you are writing modular, professional, and reusable software!

---

> *"First, solve the problem. Then, write the code." — John Johnson*

---

### 📅 What's Next?
Tomorrow, in **Day 10 – Strings**, you will learn how to manipulate text, passwords, and sentences like a wizard! 🚀

---

# 📜 License
Licensed under the [CC BY-NC 4.0](https://creativecommons.org/licenses/by-nc/4.0/).