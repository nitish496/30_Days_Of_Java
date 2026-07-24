Here is the absolute final, perfectly refined, 100% GitHub-ready version for Day 15. It is incredibly dense, visually stunning, and stripped of all fluff. 

Click **Copy code** and commit it directly! 🚀

```markdown
# 📅 Day 15 – Classes & Objects

✅ Classes | ✅ Objects | ✅ Multiple Instances | ✅ References | ✅ Stack vs Heap

---

# 📖 1. Core Concepts
A **Class** is the blueprint used to define data and behavior. An **Object** is a physical entity created from that blueprint. 
- **Instance Variables (Fields):** Variables defined inside a class that hold data.
- **Methods:** Functions defined inside a class that perform actions.
- **Dot Operator (`.`):** Used to access fields and methods of an object (e.g., `s1.name`).

---

# =========================================
# 1. Creating Your First Class
# =========================================
**🎯 Objective:** Define a blueprint. | **🤔 Concept:** A class consumes NO heap memory. 
```java
public class Student {
    // 1. Instance Variables (Fields)
    String name;
    
    // 2. Methods (Behavior)
    void study() {
        System.out.println(name + " is studying Java.");
    }
}
```

---

# =========================================
# 2. Creating Objects
# =========================================
**🎯 Objective:** Bring the blueprint to life! | **📝 Syntax:** `ClassName obj = new ClassName();`
```java
public class Program2 {
    public static void main(String[] args) {
        Student s1 = new Student(); // Creating the object
        s1.name = "Alice";          // Assigning values
        s1.study();                 // Calling methods
    }
}
```
**🖥 Output:** `Alice is studying Java.`

---

# =========================================
# 3. Creating Multiple Objects
# =========================================
**🤔 Concept:** Independent physical instances from one single blueprint.
```java
public class Program3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";

        Student s2 = new Student();
        s2.name = "Bob";
    }
}
```
**💡 Key Points:** Even though `s1` and `s2` use the exact same class, they are completely separate in memory.

---

# =========================================
# 4. Accessing Fields & Calling Methods
# =========================================
**🤔 Concept:** Manipulating data using the Dot (`.`) Operator.
```java
public class Program4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 20; // Writing data
        s1.age = 21; // Updating data
    }
}
```

---

# =========================================
# 5. Understanding Object References
# =========================================
**🤔 Concept:** Variables are just remote controls!
```java
public class Program5 {
    public static void main(String[] args) {
        Student tv1 = new Student(); // tv1 is the remote control
        tv1.name = "Sony";
        
        Student tv2 = tv1; // Handing the SAME remote to someone else!
        tv2.name = "Samsung"; // Changing it via tv2
        
        System.out.println("TV1 sees: " + tv1.name); // Outputs: Samsung
    }
}
```
**🔍 Explanation:** `tv1` and `tv2` point to the exact same physical object in memory.

---

# =========================================
# 6. Stack & Heap Memory Architecture
# =========================================
```text
Student s1 = new Student();
```
1. **Stack Memory (Fast):** The reference variable `s1` (the remote control) is stored here.
2. **Heap Memory (Massive):** The actual physical `Student` object is stored here. 
3. **The `=` Sign:** Connects the reference in the Stack to the object in the Heap!

---

# =========================================
# 7. Student Management System
# =========================================
**🎯 Objective:** Combine concepts into a mini-project.
```java
class StudentManager {
    String name;

    void markAttendance() {
        System.out.println(name + " is present today.");
    }
}

public class Program7 {
    public static void main(String[] args) {
        StudentManager s1 = new StudentManager();
        s1.name = "Nitish";
        s1.markAttendance();
    }
}
```

---

# =========================================
# 8. Car Management System
# =========================================
**🎯 Objective:** Prove OOP applies to anything.
```java
class Car {
    String model;
    
    void startEngine() {
        System.out.println(model + "'s engine is roaring!");
    }
}

public class Program8 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "BMW M5";
        c1.startEngine();
    }
}
```

---

# =========================================
# 9. Library Management (Practice)
# =========================================
**🎯 Objective:** State changes based on method logic!
```java
class Book {
    String title;
    boolean isAvailable = true;

    void borrowBook() {
        if(isAvailable) {
            isAvailable = false;
            System.out.println("Borrowed: " + title);
        } else {
            System.out.println("Sorry, taken!");
        }
    }
}

public class Program9 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Fundamentals";
        
        b1.borrowBook(); // Works!
        b1.borrowBook(); // Fails!
    }
}
```

---

# 🧠 5 Quick Interview Questions
1. **What is an instance variable?** A variable declared inside a class but outside of any method.
2. **What does the `new` keyword do?** Dynamically allocates memory for an object on the Heap.
3. **What is a reference variable?** A variable that holds the memory address (pointer) of an object.
4. **Where are objects physically stored?** In the Heap memory.
5. **Where are reference variables stored?** In the Stack memory.

---

# ❓ 5 Practice Questions
1. Write the syntax to create an object of a class named `Employee`.
2. Given `Employee e1 = new Employee();`, explain what `e1` is and what `new` is doing.
3. Create a `Mobile` class with fields `brand` and `batteryLevel`.
4. Create an object of `Mobile`, set `brand` to "Apple", and `batteryLevel` to `80`.
5. Use the dot operator to print the `batteryLevel` to the screen.

---

# ⭐ 5 Challenge Programs
1. Create an `Animal` class with a `sound` field and `makeSound()` method. Test it.
2. Make two reference variables point to the exact same object. Change a value using the first reference and print it using the second.
3. Create a `Bank` class with `balance`. Write `deposit()` and `withdraw()` methods.
4. Write a `Rectangle` class with `length` and `width`. Write a method `calculateArea()` that prints the area.
5. Create an array of `Student` objects! (Hint: `Student[] arr = new Student[3];`).

---

> *"The beautiful thing about learning is that no one can take it away from you." — B.B. King*

---

# 🚀 Next Day Preview: Day 16 – Constructors
Today, we assigned data to our objects manually (`b1.title = "Java";`). This is repetitive! 
Tomorrow, we learn **Constructors**—special blocks of code that let you build an object AND assign its data in a single line of code!
```