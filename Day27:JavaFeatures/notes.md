# 📅 Day 27 – Java 8 Features

Welcome to Day 27! 🚀 Today, we graduate to Modern Java. 
Java 8 completely revolutionized the language by introducing Functional Programming. Say goodbye to thousands of lines of boilerplate code and hello to clean, concise, and incredibly fast code! 🌟☕

✅ Lambdas | ✅ Streams | ✅ Functional Interfaces | ✅ Optional

---

# 📖 Quick Intro
- **Lambda `()->{}`:** An anonymous function that allows you to treat code as data.
- **Functional Interface:** An interface with exactly ONE abstract method.
- **Stream API:** A pipeline that processes data from collections without loops.
- **Optional:** A wrapper that prevents `NullPointerExceptions` elegantly.

---

# 🗂️ Program Index

| # | Topic | Method |
|---|-------|------|
| 1 | Lambda basics - old way vs new way | `program1()` |
| 2 | Lambda with parameters | `program2()` |
| 3 | Predicate for true/false checks | `program3()` |
| 4 | Function for input to output | `program4()` |
| 5 | forEach the Java 8 way | `program5()` |
| 6 | Method references | `program6()` |
| 7 | Stream filter() | `program7()` |
| 8 | Stream map() | `program8()` |
| 9 | Stream sorted() and count() | `program9()` |
| 10 | Optional to avoid NullPointerException | `program10()` |

`Main.java` runs all ten in sequence.

---

# =========================================
# 1. Lambda Basics (OLD way vs NEW way) 🦋
# =========================================
**🎯 Objective:** See how Lambdas drastically reduce boilerplate code!
```java
// A functional interface = an interface with EXACTLY ONE abstract method.
@FunctionalInterface
interface Greeting {
    void sayHello();
}

// OLD WAY: anonymous class - lots of boilerplate
Greeting oldWay = new Greeting() {
    public void sayHello() {
        System.out.println("Hello from the OLD way");
    }
};
oldWay.sayHello();

// NEW WAY: lambda - same thing, one line
Greeting newWay = () -> System.out.println("Hello from the LAMBDA");
newWay.sayHello();
```

---

# =========================================
# 2. Lambda with Parameters 🧮
# =========================================
**🎯 Objective:** Pass inputs into a Lambda and get a value back.
```java
@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

// (a, b) are the inputs, everything after -> is what it does
Calculator add = (a, b) -> a + b;
Calculator multiply = (a, b) -> a * b;

System.out.println("10 + 5 = " + add.operate(10, 5));
System.out.println("10 * 5 = " + multiply.operate(10, 5));
```

---

# =========================================
# 3. Predicate (true/false) ⚖️
# =========================================
**🎯 Objective:** Use Java's built-in `Predicate` to test conditions.
```java
import java.util.function.Predicate;

Predicate<Integer> isEven = n -> n % 2 == 0;

System.out.println("Is 10 even? " + isEven.test(10));
System.out.println("Is 7 even?  " + isEven.test(7));
```

---

# =========================================
# 4. Function (input -> output) 🔄
# =========================================
**🎯 Objective:** Use Java's built-in `Function` to transform data.
```java
import java.util.function.Function;

// Function<InputType, OutputType>
Function<String, Integer> getLength = word -> word.length();

System.out.println("Length of 'Java'   = " + getLength.apply("Java"));
System.out.println("Length of 'Python' = " + getLength.apply("Python"));
```

---

# =========================================
# 5. forEach 🔁
# =========================================
**🎯 Objective:** Loop through collections the modern Java 8 way.
```java
import java.util.Arrays;
import java.util.List;

List<String> languages = Arrays.asList("Java", "Python", "C++");

// OLD WAY
for (String lang : languages) {
    System.out.println(lang);
}

// NEW WAY
languages.forEach(lang -> System.out.println(lang));
```

---

# =========================================
# 6. Method Reference `::` 🎯
# =========================================
**🎯 Objective:** An even shorter, cleaner syntax for lambdas.
```java
// These two lines do EXACTLY the same thing:
languages.forEach(lang -> System.out.println(lang)); // lambda
languages.forEach(System.out::println);              // method reference

// Read "System.out::println" as "just use the println method"
```

---

# =========================================
# 7. Stream filter() 🌊
# =========================================
**🎯 Objective:** Process collections and keep only what you want without writing `if` statements!
```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

List<Integer> evenNumbers = numbers.stream()   // 1. turn list into a stream
        .filter(n -> n % 2 == 0)               // 2. keep only evens
        .collect(Collectors.toList());         // 3. turn back into a list

System.out.println("Only evens: " + evenNumbers);
```

---

# =========================================
# 8. Stream map() 📦
# =========================================
**🎯 Objective:** Transform every element in a list instantly!
```java
// filter = REMOVE items | map = CHANGE items
List<Integer> squares = numbers.stream()
        .map(n -> n * n)                       // transform each number
        .collect(Collectors.toList());

System.out.println("Squared:  " + squares);
```

---

# =========================================
# 9. Stream sorted() and count() 📈
# =========================================
**🎯 Objective:** Easily sort lists and count specific items.
```java
List<Integer> messy = Arrays.asList(50, 10, 40, 20, 30);

List<Integer> sorted = messy.stream()
        .sorted()
        .collect(Collectors.toList());

long howMany = messy.stream()
        .filter(n -> n > 20)
        .count();

System.out.println("Sorted: " + sorted);
System.out.println("How many are greater than 20? " + howMany);
```

---

# =========================================
# 10. Optional Class 🛡️
# =========================================
**🎯 Objective:** Avoid the dreaded `NullPointerException`.
```java
import java.util.Optional;

// Optional is a box that may or may not contain a value
Optional<String> hasValue = Optional.of("I have a value");
Optional<String> isEmpty = Optional.empty();

System.out.println("hasValue is present? " + hasValue.isPresent());
System.out.println("hasValue contains: " + hasValue.get());

System.out.println("isEmpty is present? " + isEmpty.isPresent());
// orElse gives a backup value instead of crashing
System.out.println("isEmpty gives us: " + isEmpty.orElse("a default instead"));
```

---

# 🧠 5 Quick Interview Questions
1. **What is a Functional Interface?** An interface with exactly ONE abstract method. Lambdas require them to work!
2. **What is the difference between Intermediate and Terminal Stream operations?** Intermediate operations (like `filter`, `map`) are lazy and return a new Stream. Terminal operations (like `collect`, `forEach`) trigger the actual execution and close the stream.
3. **Can a Stream be reused?** No! Once a terminal operation executes, the Stream is closed forever. Trying to reuse it throws an `IllegalStateException`.
4. **Why use `Optional`?** It forces developers to handle nulls properly, practically eliminating `NullPointerException` crashes.
5. **Why were default methods added to interfaces?** For backward compatibility. It allowed Java engineers to add new methods (like `.forEach()`) to existing interfaces without breaking legacy code!

---

# 🚀 Next Day Preview: Day 28 – JDBC (Java Database Connectivity)
We have mastered variables, OOP, Collections, Multithreading, and now Functional Programming. But our data still disappears when we close the app! Tomorrow, we learn **JDBC**! You will learn how to connect your Java applications directly to a massive MySQL Database, allowing you to save millions of records permanently. We are stepping into the world of Backend Engineering! 🗄️🔥
