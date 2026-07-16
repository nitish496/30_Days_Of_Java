I have carefully refined your Day 03 notes. I removed the unnecessary filler (like "Programs Covered"), tightened up the explanations to be punchy and professional, and applied the premium, highly-visual formatting we established for Day 2. 

Here is your masterfully polished Day 03 lesson!

***

# ☕ Day 03 – Operators

> *"Code is like a recipe. Variables are your ingredients, and operators are the tools you use to mix them together!"*

---

# 📋 Preview of Today's Learning

Welcome to Day 3! Today, we are bringing your variables to life. You will learn how to use **Operators** to perform calculations, compare data, make logical decisions, and manipulate the information stored in your computer's memory.

You will learn how to:
- 🧮 Perform mathematical calculations.
- ⚖️ Compare values to make decisions.
- 🧠 Combine complex logical conditions.
- 🚦 Understand the order in which Java executes mathematical operations.

---

# 📈 Prerequisites

Before jumping in, make sure you understand:
- ✔️ How to declare and initialize **Variables**.
- ✔️ The difference between Java's **Primitive Data Types** (`int`, `double`, `boolean`).

---

# ⏱ Estimated Time

**1.5 – 2 Hours**

---

# 🎯 Learning Outcomes

By the end of this lesson, you will comfortably be able to:
1. Explain what operators are and why they are essential.
2. Avoid the most common beginner trap: the difference between `=` and `==`.
3. Understand how Java handles Integer Division and the Modulus (`%`) operator.
4. Master Pre-increment (`++x`) vs. Post-increment (`x++`).
5. Predict the output of complex equations using Operator Precedence.

---

# 🗺️ Today's Learning Journey

1. **Introduction** ➝ What are Operators?
2. **Math** ➝ Arithmetic Operators & Modulus
3. **Modifying Data** ➝ Assignment Operators
4. **Comparisons** ➝ Relational Operators
5. **Logic** ➝ Logical Operators (`&&`, `||`, `!`)
6. **Incrementing** ➝ Unary Operators 
7. **Order of Operations** ➝ Operator Precedence
8. **Practice & Interview Prep**

---

# 📖 Main Lesson

## 🛠️ What is an Operator?

An **operator** is a special symbol that tells the computer to perform a specific mathematical or logical task on one or more pieces of data. The data being operated on are called **operands**.

### 💻 Let's look at a simple example:

```java
int sum = 10 + 20;
```

**Breaking it down:**
- `10` and `20` 👉 The **operands** (the raw data).
- `+` 👉 The **operator** (tells Java to add them).
- `=` 👉 The **operator** (tells Java to store the result in `sum`).

---

## 🧮 Arithmetic Operators

Arithmetic operators are used to perform basic mathematical calculations.

| Operator | Name | Example | Result (if a=20, b=10) |
| :---: | :--- | :--- | :---: |
| `+` | Addition | `a + b` | `30` |
| `-` | Subtraction | `a - b` | `10` |
| `*` | Multiplication | `a * b` | `200` |
| `/` | Division | `a / b` | `2` |
| `%` | Modulus | `a % b` | `0` |

### ⚠️ The Integer Division Trap

When you divide two **integers** (whole numbers), Java completely throws away the decimal portion. It does *not* round up or down; it simply deletes it!

```java
System.out.println(5 / 2); // Output: 2 (The .5 is deleted!)
```

> [!TIP]
> **How to fix this?** Make at least one number a decimal (`double`). 
> `System.out.println(5.0 / 2);` will correctly output `2.5`.

### 🍕 Understanding the Modulus Operator (`%`)

The modulus operator returns the **remainder** after division.

```java
System.out.println(10 % 3); // Output: 1 
// (Because 10 divided by 3 is 9, leaving a remainder of 1)
```

**Real-world uses for Modulus:**
- Checking if a number is even or odd (e.g., `x % 2 == 0`).
- Calculating time (e.g., a 12-hour clock).

---

## ✍️ Assignment Operators

Assignment operators are shortcuts used to update the value of a variable.

Instead of writing this long code:
```java
score = score + 5;
```
Java lets you write this clean shortcut:
```java
score += 5;
```

| Operator | Example | What it actually means |
| :---: | :--- | :--- |
| `=` | `x = 5` | Set `x` to exactly 5 |
| `+=` | `x += 5` | `x = x + 5` |
| `-=` | `x -= 5` | `x = x - 5` |
| `*=` | `x *= 5` | `x = x * 5` |
| `/=` | `x /= 5` | `x = x / 5` |

---

## ⚖️ Relational Operators (Comparisons)

Relational operators compare two values. They **always** result in a `boolean` (either `true` or `false`).

| Operator | Meaning | Example (x=20, y=10) | Result |
| :---: | :--- | :--- | :---: |
| `==` | Equal To | `x == y` | `false` |
| `!=` | Not Equal To | `x != y` | `true` |
| `>` | Greater Than | `x > y` | `true` |
| `<` | Less Than | `x < y` | `false` |
| `>=` | Greater or Equal | `x >= y` | `true` |
| `<=` | Less or Equal | `x <= y` | `false` |

> [!CAUTION]
> **The BIGGEST Beginner Mistake: `=` vs `==`**
> - A single `=` is the **Assignment Operator**. It *gives* a value. (`int age = 20;`)
> - A double `==` is the **Comparison Operator**. It *checks* a value. (`age == 20` 👉 `true`)

---

## 🧠 Logical Operators

Logical operators are used to combine multiple conditions together.

| Operator | Name | How it works |
| :---: | :--- | :--- |
| `&&` | **Logical AND** | Returns `true` ONLY if **both** conditions are true. |
| `\|\|` | **Logical OR** | Returns `true` if **at least one** condition is true. |
| `!` | **Logical NOT** | Reverses the result (`true` becomes `false`). |

### 🌍 Real-World Analogy
- **AND (`&&`):** You can enter the VIP club ONLY IF (You are on the list `&&` You have an ID).
- **OR (`||`):** You get a discount IF (You are a student `||` You are a senior citizen).

---

## ➕ Unary Operators (Increment/Decrement)

Unary operators work on a *single* operand to quickly add or subtract `1`.

- `++` (Increment: adds 1)
- `--` (Decrement: subtracts 1)

### 📌 Post-Increment (`x++`) vs Pre-Increment (`++x`)

This is a classic interview topic! The placement of the `++` completely changes how Java reads the code.

**1. Post-Increment (`x++`)**  
Rule: *Use the current value first, THEN increase it in the background.*
```java
int x = 5;
System.out.println(x++); // Output: 5 (It prints 5, then quietly becomes 6)
System.out.println(x);   // Output: 6
```

**2. Pre-Increment (`++x`)**  
Rule: *Increase the value immediately, THEN use it.*
```java
int y = 5;
System.out.println(++y); // Output: 6 (It becomes 6 immediately, then prints)
```

---

## ⚡ Operator Precedence

Java follows standard mathematical order of operations (like BODMAS or PEMDAS).

1. **Parentheses `()`** execute first.
2. **Multiplication `*`, Division `/`, Modulus `%`** execute next.
3. **Addition `+` and Subtraction `-`** execute last.

```java
System.out.println(10 + 5 * 2);   // Output: 20 (Multiplication happens first)
System.out.println((10 + 5) * 2); // Output: 30 (Parentheses happen first)
```

---

# ⚠️ Common Beginner Mistakes

- ❌ **Confusing `=` with `==`**: Remember, `=` *sets* the value, `==` *checks* the value.
- ❌ **Confusing `&&` with `||`**: `&&` needs BOTH sides to be true. `||` only needs ONE side.
- ❌ **Misunderstanding Modulus (`%`)**: It does not divide; it gives you the **leftover remainder**.
- ❌ **The Integer Division Trap**: Expecting `5 / 2` to yield `2.5`. (It yields `2`).
- ❌ **Ignoring Precedence**: Forgetting that multiplication happens before addition.

---

# 🏋️ Practice Time!

### 🟢 Beginner
Create two variables (`int a = 15;` and `int b = 4;`). Print the results of adding, subtracting, multiplying, dividing, and finding the modulus of these two numbers.

### 🟡 Intermediate
Build a simple program that tests logical conditions. Create boolean variables like `hasTicket` and `isVIP`. Write print statements using `&&` and `||` to see if a person is allowed into a concert. 

### 🔴 Challenge
Without running the code in your IDE, calculate the exact output of this snippet on a piece of paper:
```java
int x = 10;
int y = x++;
int z = ++x;
System.out.println(x + " " + y + " " + z);
```
*(Tip: Trace the exact value of `x` line by line!)*

---

# 🎤 Interview Questions

> Ace your interviews by mastering these core concepts!

**Q: What is the difference between `=` and `==`?**
> The `=` operator is used to assign a value to a variable. The `==` operator is used to compare two values to see if they are equal.

**Q: Why does `5 / 2` return `2` instead of `2.5`?**
> Because both operands are integers, Java performs **integer division**, completely discarding the decimal remainder. To get `2.5`, at least one operand must be a floating-point number (e.g., `5.0 / 2`).

**Q: What does the `%` operator do?**
> It is the modulus operator. It performs division and returns the **remainder**. It is highly useful for finding even/odd numbers.

**Q: Explain the difference between `x++` and `++x`.**
> `x++` is a **post-increment** operator; it evaluates to the current value of `x`, and then increases `x` by 1. `++x` is a **pre-increment** operator; it increases `x` by 1 immediately, and then evaluates to the new value.

---

# 📊 Summary

| Concept | Key Takeaway |
| :--- | :--- |
| **Arithmetic** | Used for math (`+`, `-`, `*`, `/`, `%`). |
| **Integer Division** | Integers divided by integers discard decimals. |
| **Assignment** | Updates variables (`=`, `+=`, `-=`). |
| **Relational** | Compares data and returns `true` or `false` (`==`, `!=`, `>`, `<`). |
| **Logical** | Combines boolean conditions (`&&`, `\|\|`, `!`). |
| **Unary** | Increases or decreases by 1 (`++`, `--`). |
| **Precedence** | Java uses mathematical rules (Parentheses ➝ Multiplication ➝ Addition). |

---

# ⚡ Quick Revision

- ✔️ Operators perform actions on data.
- ✔️ `%` gives you the remainder of division.
- ✔️ `=` is assignment. `==` is comparison.
- ✔️ `&&` requires all conditions to be true. `||` requires just one.
- ✔️ `x++` uses the value *then* adds 1.
- ✔️ `++x` adds 1 *then* uses the value.
- ✔️ Parentheses `()` override standard math precedence.

---

> *"The beautiful thing about learning is nobody can take it away from you." — B.B. King*

---

# ⏭️ What's Next?

Excellent work today! You now have full control over manipulating data in memory. In **Day 04**, we will make your programs interactive by learning about **User Input**. You will learn how to use the `Scanner` class to read text and numbers directly from the user!

---

# 📜 License

This course is licensed under the [Creative Commons Attribution-NonCommercial 4.0 International License (CC BY-NC 4.0)](https://creativecommons.org/licenses/by-nc/4.0/).

You are free to:
- **Share** — copy and redistribute the material in any medium or format
- **Adapt** — remix, transform, and build upon the material

Under the following terms:
- **Attribution** — You must give appropriate credit, provide a link to the license, and indicate if changes were made. You may do so in any reasonable manner, but not in any way that suggests the licensor endorses you or your use.
- **NonCommercial** — You may not use the material for commercial purposes.