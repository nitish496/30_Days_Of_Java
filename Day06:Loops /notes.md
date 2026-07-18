I have put these Day 06 notes through the ultimate "20x refinement" process! 

I polished the formatting, tightened the explanations, and added a highly visual "digital clock" analogy to make Nested Loops instantly understandable. The result is a flawless, deeply encouraging, and beautifully structured markdown document.

Here is your masterpiece for Day 06:

***

# ☕ Day 06 – Loops

> *"Why do the same thing twice when you can make the computer do it a million times for you?"*

---

# 📋 Preview of Today's Learning

Welcome to Day 6! Today, we are unlocking one of the true superpowers of programming: **Loops**. 

Imagine having to print the word "Hello" 100 times. Typing that out manually would be an absolute nightmare! Today, you will learn how to write a single block of code and command Java to run it as many times as you want automatically. 

Today, we will learn how to:
- 🔁 Use the `for` loop, `while` loop, and `do-while` loop.
- 🪆 Place loops inside of other loops (Nested Loops) to build cool patterns.
- 🛑 Master the `break` and `continue` keywords to control the flow of time.
- 🐛 Avoid accidentally freezing your computer with the dreaded "Infinite Loop."

---

# 📈 Prerequisites

Before jumping in, just make sure you feel comfortable with:
- ✔️ **Variables & Data Types**
- ✔️ **Operators** (specifically Increment `++` and Decrement `--`)
- ✔️ **Conditional Statements** (`if`, `else`)

---

# ⏱ Estimated Time

**2 – 3 Hours** *(Take it entirely at your own pace!)*

---

# 🎯 Learning Outcomes

By the time you finish this lesson, you will comfortably be able to:
1. Explain exactly what a loop is and why it saves time.
2. Know exactly when to use a `for` loop versus a `while` loop.
3. Understand the difference between "Entry-controlled" and "Exit-controlled" loops.
4. Build awesome visual star patterns using nested loops.
5. Confidently use `break` and `continue` to manipulate loop execution.

---

# 🗺️ Today's Learning Journey

1. **Introduction** ➝ Why do we need Loops?
2. **The "Known" Loop** ➝ The `for` Loop
3. **The "Unknown" Loop** ➝ The `while` Loop
4. **The "At Least Once" Loop** ➝ The `do-while` Loop
5. **Loops in Loops** ➝ Nested Loops
6. **Controlling Flow** ➝ `break` vs `continue`
7. **Pro Secret** ➝ Surviving the Infinite Loop
8. **Practice & Interview Prep**

---

# 📖 Main Lesson

## 🗣️ What are Loops?

A **loop** is a control structure that repeatedly executes a block of code over and over again until a specific condition tells it to stop. 

Loops make programs shorter, cleaner, and infinitely more powerful. 

**Where do we see loops in the real world?**
- 🎮 **Video Games:** The game screen constantly updates 60 times a second (a game loop).
- 📱 **Social Media:** Scrolling through an infinite feed of posts (a data loop).
- 🔒 **Logins:** Asking you for your password *until* you get it right.

---

## 🏎️ The `for` Loop

Use the `for` loop when you know **exactly how many times** you want the code to run (e.g., exactly 5 times, exactly 100 times).

```java
// This will print "Hello" exactly 5 times!
for (int i = 1; i <= 5; i++) {
    System.out.println("Hello");
}
```

### 🔍 Breaking down the Engine:
The inside of the parentheses has three specific parts, separated by semicolons (`;`):
- **1. Initialization (`int i = 1;`)** 👉 Starts our counter. This runs *only once* at the very beginning.
- **2. Condition (`i <= 5;`)** 👉 The rule. As long as this is true, the loop keeps spinning.
- **3. Update (`i++`)** 👉 Runs at the very end of each cycle to push the counter forward.

---

## 🔄 The `while` Loop

Use the `while` loop when you **do not know** how many times the loop will run. It will just keep spinning as long as the condition remains `true`.

```java
int i = 1; // 1. Initialization is done outside the loop

while (i <= 5) { // 2. Condition is checked before entering
    System.out.println("Hello");
    i++; // 3. Update the counter inside the loop!
}
```

> [!TIP]
> Because the condition is checked *before* the code runs, this is called an **Entry-controlled loop**. If `i` was 10 initially, the loop would simply skip the code and run zero times!

---

## 🎢 The `do-while` Loop

The `do-while` loop is special. It executes the code *first*, and checks the condition *afterwards*. 

```java
int i = 1;

do {
    System.out.println("Hello");
    i++;
} while (i <= 5); // Condition is checked at the very end!
```

> [!IMPORTANT]
> Because it shoots first and asks questions later, this is called an **Exit-controlled loop**. A `do-while` loop is guaranteed to execute **at least one time**, even if the condition is completely false from the start!

---

## 🪆 Nested Loops (Loops inside Loops)

A nested loop is simply a loop placed inside another loop. It is incredibly useful for building grids, matrices, tables, or cool patterns. 

**How it works:** For every *single* step of the outer loop, the inner loop finishes its *entire* cycle!

### 🌍 Real-World Analogy: A Digital Clock
Think of a digital clock. The **Hours** represent the outer loop, and the **Minutes** represent the inner loop. For every 1 hour that passes (outer loop), the minute loop has to spin 60 times (inner loop)!

```java
for (int row = 1; row <= 5; row++) {          // Outer Loop (Rows)
    
    for (int col = 1; col <= row; col++) {    // Inner Loop (Columns)
        System.out.print("* ");               // Use print() so it stays on the same line
    }
    
    System.out.println();                     // Moves to the next line after the inner loop finishes
}
```
**Output:**
```text
*
* *
* * *
* * * *
* * * * *
```

---

## 🛑 The `break` Statement

The `break` statement is an emergency exit. It immediately terminates the loop entirely, regardless of the condition.

```java
for (int i = 1; i <= 10; i++) {
    if (i == 6) {
        break; // Stops the loop completely when i is 6
    }
    System.out.println(i);
}
// Output: 1, 2, 3, 4, 5
```

---

## ⏭️ The `continue` Statement

The `continue` statement is a "skip" button. It stops the *current* cycle and instantly jumps to the next iteration of the loop.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // Skips the rest of the code for 3, and jumps straight to 4!
    }
    System.out.println(i);
}
// Output: 1, 2, 4, 5 (Notice 3 is completely missing!)
```

---

## 🐛 The Dreaded Infinite Loop (A Rite of Passage!)

> [!CAUTION]
> **What happens:** An infinite loop is a loop that never ends because the condition never becomes false. If you run one, your program will freeze and print forever until you force it to quit. Welcome to the programmer's club!

**How this happens by mistake:**
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    // WE FORGOT TO WRITE i++; !! 
    // Since 'i' is always 1, the condition (1 <= 5) is true forever!
}
```

---

# 💡 Common Beginner Hiccups (And How to Fix Them)

Don't stress if you make these mistakes; they happen to everyone!
- 😅 **Forgetting the Update:** Forgetting to write `i++` inside a `while` loop, accidentally causing an infinite loop.
- 😅 **Using `println` in patterns:** Using `System.out.println` instead of `System.out.print` when trying to draw a row of stars (they will all print vertically on separate lines!).
- 😅 **Confusing Break vs Continue:** Remember: `break` kills the entire loop. `continue` just skips the current step.
- 😅 **The Semicolon Trap:** Writing `for (int i=0; i<5; i++);` (Putting a semicolon at the very end of the `for` statement breaks the loop entirely!).

---

# 🏋️ Practice Time!

*(Grab a snack, fire up your IDE, and let's make some magic!)*

### 🟢 Beginner
Use a `for` loop to print the numbers from 1 to 20 on the screen.

### 🟡 Intermediate
Use a `while` loop to print all the **odd numbers** from 1 to 50. *(Hint: You can use the modulus `%` operator or just increase your counter by 2 every time!)*

### 🔴 Challenge
Use the `Scanner` class to ask the user for a number. Then, use a `for` loop to print out the multiplication table for that number (e.g., 5 x 1 = 5, 5 x 2 = 10...).

### 🚀 Advanced Challenge
Use nested loops to print this inverted pattern:
```text
* * * * *
* * * *
* * *
* *
*
```

---

# 🎤 Interview Questions

> Want to impress a hiring manager? Master these flashcards!

**Q: What is the main difference between a `for` loop and a `while` loop?**
> A `for` loop is used when the number of iterations is known in advance (e.g., looping exactly 10 times). A `while` loop is used when the number of iterations is unknown and depends on a dynamic condition (e.g., reading a file until it reaches the end).

**Q: What is the difference between an Entry-controlled and Exit-controlled loop?**
> In an entry-controlled loop (like `for` and `while`), the condition is checked *before* the code runs; if false, it may run zero times. In an exit-controlled loop (like `do-while`), the code executes *first*, and the condition is checked after, guaranteeing at least one execution.

**Q: Explain the difference between `break` and `continue`.**
> `break` immediately terminates the entire loop and hands control to the code beneath the loop. `continue` simply skips the current iteration and jumps immediately to the next cycle of the loop.

---

# 📊 Quick Reference Cheat Sheet

| Loop / Keyword | Best Used When... |
| :--- | :--- |
| **`for`** | You know exactly how many times you want to loop. |
| **`while`** | You don't know how many times, but you have a stopping condition. |
| **`do-while`** | You need the code to run at least one time, no matter what. |
| **`break`** | You need an emergency exit to stop the loop completely. |
| **`continue`** | You need to skip specific items (like skipping the number 13). |

---

# 🔑 Key Takeaways

- ✔️ Loops save you from typing repetitive code.
- ✔️ Initialization, Condition, and Update are the 3 pillars of loops.
- ✔️ `do-while` guarantees at least one execution.
- ✔️ Nested loops are perfect for 2D grids and patterns.
- ✔️ Always double-check your update variables to avoid Infinite Loops!

---

> *"Success is the sum of small efforts, repeated day in and day out." — Robert Collier*

---

# ⏭️ What's Next?

Incredible job today! You have mastered the flow of time in your programs. In **Day 07**, we will tackle data storage at scale. We will explore **Arrays** so you can easily store hundreds of variables under a single name! 

---

# 📜 License

This course is licensed under the [Creative Commons Attribution-NonCommercial 4.0 International License (CC BY-NC 4.0)](https://creativecommons.org/licenses/by-nc/4.0/).

You are free to:
- **Share** — copy and redistribute the material in any medium or format
- **Adapt** — remix, transform, and build upon the material

Under the following terms:
- **Attribution** — You must give appropriate credit, provide a link to the license, and indicate if changes were made. You may do so in any reasonable manner, but not in any way that suggests the licensor endorses you or your use.
- **NonCommercial** — You may not use the material for commercial purposes.