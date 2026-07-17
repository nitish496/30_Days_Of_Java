Here is the ultimate, flawlessly refined version of your Day 05 notes! 

I have applied the same premium polish, welcoming tone, and beautiful visual structure that we used for Day 4. The explanation of the `break` statement (the "fall-through" quirk) and the modern Switch Expression have been given special visual treatment to make them incredibly easy to understand.

***

# ☕ Day 05 – Conditional Statements

> *"A smart program doesn't just do things—it makes decisions based on the situation. Let's give your code a brain!"*

---

# 📋 Preview of Today's Learning

Welcome to Day 5! Until now, our programs have executed every single line of code from top to bottom without stopping. But what if we only want code to run *sometimes*? 

Today, you are going to learn how to add **Decision-Making** logic to your programs. By using conditional statements, your code will be able to look at data and dynamically choose what to do next!

Today, we will learn how to:
- 🧠 Make decisions using `if`, `else`, and `else-if`.
- 🪆 Place decisions inside other decisions (Nested `if`).
- 🔀 Elegantly handle multiple choices using the `switch` statement.
- ✨ Write cleaner, faster code using modern Switch Expressions.

---

# 📈 Prerequisites

Before jumping in, just make sure you feel comfortable with:
- ✔️ **Variables & Data Types**
- ✔️ **Relational Operators** (`>`, `<`, `==`)
- ✔️ **Input & Output** (Using the `Scanner`)

---

# ⏱ Estimated Time

**2 – 3 Hours** *(Take it at your own pace!)*

---

# 🎯 Learning Outcomes

By the time you finish this lesson, you will comfortably be able to:
1. Explain how a program makes choices using conditional statements.
2. Build logic flows using `if`, `else`, and `else-if` ladders.
3. Understand when to use a traditional `switch` instead of an `if-else`.
4. Avoid the infamous "Fall-through" bug by mastering the `break` keyword.
5. Upgrade your code using Java 14's modern Switch Expressions.

---

# 🗺️ Today's Learning Journey

1. **Introduction** ➝ The Power of Decision-Making
2. **Basic Logic** ➝ The `if` and `if-else` Statements
3. **Complex Logic** ➝ The `else-if` Ladder
4. **Decisions in Decisions** ➝ Nested `if`
5. **Multiple Choices** ➝ The Traditional `switch`
6. **Pro Secret** ➝ Modern Switch Expressions
7. **Practice & Interview Prep**

---

# 📖 Main Lesson

## 🗣️ What are Conditional Statements?

Conditional statements allow a program to make decisions based on specific conditions. 

Instead of mindlessly running every single line of code, Java will first check a condition (e.g., *Is the user older than 18?*). 
- If the condition is **true**, one block of code runs.
- If the condition is **false**, Java skips it and does something else.

**Where do we see this in the real world?**
- 🛒 **Shopping:** *IF* you have a coupon code, apply a 20% discount.
- 📱 **Logins:** *IF* your password is correct, log in; *ELSE* show an error.
- 🚦 **Traffic Lights:** *IF* the light is red, stop cars.

---

## 🚦 The `if` Statement

The `if` statement is the simplest form of decision-making. It runs a block of code **only** if the condition inside the parentheses is `true`.

```java
int age = 20;

if (age >= 18) {
    System.out.println("You are eligible to vote!"); // 👉 This will print!
}
```
*If `age` was 16, Java would silently skip over the code block entirely.*

---

## 🔀 The `if-else` Statement

What if we want to do something specific when the condition is `false`? We use `if-else` to provide two possible outcomes.

```java
int marks = 35;

if (marks >= 40) {
    System.out.println("Pass! Great job.");
} else {
    System.out.println("Fail. Try again next time."); // 👉 This will print!
}
```
*Java will **only** execute one of these blocks, never both.*

---

## 🪜 The `else-if` Ladder

When you have more than two possibilities, you can chain conditions together using an `else-if` ladder. Java checks them from top to bottom. The very first condition that is `true` gets executed, and **the rest are skipped.**

```java
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade: A");
} else if (marks >= 80) {
    System.out.println("Grade: B"); // 👉 This is true, so it prints "B", and skips the rest!
} else if (marks >= 70) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F"); // Catch-all for anything below 70
}
```

---

## 🪆 The Nested `if` Statement

A nested `if` is simply an `if` statement placed *inside* another `if` statement. The inner code only runs if the outer condition is true first.

**Real-world example (Driving License):**
```java
if (age >= 18) { // First, check if they are old enough
    
    if (passedDrivingTest == true) { // Next, check if they actually passed the test
        System.out.println("License Approved!");
    }
}
```

---

## 🎛️ The Traditional `switch` Statement

When you want to compare one single variable against a bunch of fixed, specific values (like a menu choice), an `else-if` ladder gets messy. The `switch` statement is perfect for this!

```java
int choice = 2;

switch (choice) {
    case 1:
        System.out.println("Making Tea...");
        break;
        
    case 2:
        System.out.println("Making Coffee..."); // 👉 This matches, so it prints Coffee!
        break;
        
    default:
        System.out.println("Invalid Choice!");
}
```

### 🐛 The "Fall-through" Bug (Why we need `break`)
> [!NOTE]
> **The Quirk:** If you forget to write `break;` at the end of a `case`, Java won't stop! It will keep "falling through" and execute every single case below it until it hits a break or the end of the switch!

**Example without `break`:**
```java
case 1:
    System.out.println("Tea");
case 2:
    System.out.println("Coffee");
```
*Output if choice is 1:*
```text
Tea
Coffee
```
*(Always remember your breaks!)*

---

## ✨ Modern Switch Expressions (Java 14+)

In Java 14, they gave the `switch` statement a massive upgrade. It is shorter, cleaner, and **you don't even need to use `break` anymore!**

Instead of a colon (`:`), we use an arrow (`->`).

```java
int choice = 1;

switch (choice) {
    case 1 -> System.out.println("Pizza");
    case 2 -> System.out.println("Burger");
    default -> System.out.println("Invalid");
}
```

### 🎁 Returning Values directly
Modern switch expressions can also *return* a value directly into a variable!

```java
String day = switch (number) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    default -> "Invalid Day";
}; // Notice the semicolon at the end!

System.out.println(day);
```

---

# 💡 Common Beginner Hiccups (And How to Fix Them)

Don't stress if you make these mistakes; they happen to everyone!
- 😅 **Using `=` instead of `==`:** Writing `if (age = 18)` will cause an error! Remember, `=` assigns a value, `==` compares it.
- 😅 **Forgetting Curly Braces `{}`:** While Java allows one-line `if` statements without braces, it's a terrible habit. Always use `{ }` to prevent bugs.
- 😅 **The Fall-Through Trap:** Forgetting the `break;` keyword inside a traditional switch and wondering why your code prints 3 different things at once.
- 😅 **Forgetting the `default` case:** Always include a `default` case in a switch to catch invalid inputs!

---

# 🏋️ Practice Time!

*(Grab a snack, fire up your IDE, and let's make some decisions!)*

### 🟢 Beginner
Create a simple program that uses `Scanner` to ask for a user's age. Use an `if-else` statement to print whether they are eligible to vote or not.

### 🟡 Intermediate
Build a **Grading System**! Ask the user for their test score (0-100). Use an `else-if` ladder to print out their letter grade (A, B, C, D, or F).

### 🔴 Challenge
Build a **Restaurant Ordering Menu**! 
1. Print options: 1) Pizza, 2) Burger, 3) Pasta. 
2. Ask the user for their choice using `Scanner`. 
3. Use a modern **Switch Expression** (with the `->` arrows) to print out the price of the item they selected!

---

# 🎤 Interview Questions

> Want to impress a hiring manager? Master these flashcards!

**Q: What is the main difference between `if` and `if-else`?**
> The `if` statement executes a block of code if a condition is true, and does nothing if it's false. An `if-else` statement guarantees an outcome by providing a specific block of code to run when the condition is false.

**Q: When is it better to use an `else-if` ladder versus a `switch` statement?**
> Use an `else-if` ladder when you need to evaluate complex ranges or boolean logic (like `marks >= 90`). Use a `switch` statement when comparing a single variable against fixed, specific values (like checking if a menu choice is exactly `1`, `2`, or `3`).

**Q: What is the "fall-through" behavior in a traditional switch statement?**
> Fall-through happens when a `case` is missing the `break` keyword. Instead of stopping after a match, Java will continue to execute the code in all subsequent cases until it hits a break or the end of the block.

**Q: What are the advantages of modern Switch Expressions (Java 14+)?**
> They have a much cleaner syntax using arrows (`->`), they eliminate the fall-through bug because `break` is no longer required, and they can directly return a value into a variable.

---

# 📊 Quick Reference Cheat Sheet

| Statement Type | When to use it |
| :--- | :--- |
| **`if`** | When you want to run code *only* if one specific condition is true. |
| **`if-else`** | When you have two clear paths: "Do this, or else do that." |
| **`else-if` ladder** | When you need to check multiple ranges or complex conditions in order. |
| **Nested `if`** | When a decision depends on a previous decision being true first. |
| **Traditional `switch`** | When comparing a single variable to exact, hardcoded values. |
| **Switch Expression** | The modern, shorter, and safer way to write a switch (Java 14+). |

---

# 🔑 Key Takeaways

- ✔️ Conditional statements make your programs intelligent and dynamic.
- ✔️ `if-else` is perfect for ranges and logic checks.
- ✔️ `switch` is perfect for checking exact matches (like menus).
- ✔️ Always remember the `break;` keyword in traditional switches!
- ✔️ Modern switch expressions use `->` and are safer and cleaner.

---

> *"Programming isn't about what you know; it's about what you can figure out." — Chris Pine*

---

# ⏭️ What's Next?

Incredible job! Your programs can now talk to users and make intelligent decisions. In **Day 06**, we will learn how to make your computer do the heavy lifting. We will explore **Loops** (`for`, `while`, and `do-while`) so you can run the same block of code hundreds of times instantly! 

---

# 📜 License

This course is licensed under the [Creative Commons Attribution-NonCommercial 4.0 International License (CC BY-NC 4.0)](https://creativecommons.org/licenses/by-nc/4.0/).

You are free to:
- **Share** — copy and redistribute the material in any medium or format
- **Adapt** — remix, transform, and build upon the material

Under the following terms:
- **Attribution** — You must give appropriate credit, provide a link to the license, and indicate if changes were made. You may do so in any reasonable manner, but not in any way that suggests the licensor endorses you or your use.
- **NonCommercial** — You may not use the material for commercial purposes.