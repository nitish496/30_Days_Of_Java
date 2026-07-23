Here is the exact, flawlessly formatted "GitHub copyable" version using your signature 9-program structure with the `=====` dividers, complete with the Practice and Challenge sections at the end! 

Just click **Copy code** and paste it straight into your repo! 🚀

```markdown
# 📅 Day 14 – OOP Basics

Welcome to Day 14! Today we stop writing simple scripts and start building software the way the pros do. 
✅ Classes | ✅ Objects | ✅ State & Behavior | ✅ 4 Pillars | ✅ Stack vs Heap

---

# 📖 Quick Intro
**Object-Oriented Programming (OOP)** is a paradigm where code is organized around real-world "objects" (like a `Car` or `User`) that contain both data and behavior.

### 📦 Key OOP Vocabulary
- **Class:** The blueprint. Exists only logically. Consumes NO memory.
- **Object:** The physical entity built from the blueprint. Consumes Heap memory.
- **State (Fields):** What the object *has* (e.g., `age`, `color`).
- **Behavior (Methods):** What the object *does* (e.g., `study()`, `drive()`).

---

# =========================================
# 1. Procedural vs Object-Oriented (Theory)
# =========================================
**🎯 Objective:** Why do we need OOP? | **🤔 Concept:** Modularity. 
- **Procedural:** A list of instructions step-by-step. Data and functions are separate.
- **OOP:** Data and functions are bundled together into secure Objects.

---

# =========================================
# 2. Understanding Objects
# =========================================
**🎯 Objective:** Identify real-world objects. | **🤔 Concept:** Everything is an object!
- **Object:** `Dog`
- **State:** Breed, Age, Color.
- **Behavior:** Bark(), Sleep(), Eat().
- **Identity:** Memory Address / Microchip ID.

---

# =========================================
# 3. Understanding Classes
# =========================================
**🎯 Objective:** Learn how to create blueprints. | **🤔 Concept:** The template.
- A class does NOT exist in the physical world. It is just the architectural blueprint used to build physical houses (Objects).

---

# =========================================
# 4. Class vs Object
# =========================================
**🎯 Objective:** Memorize the difference. | **🤔 Concept:** Logic vs Physical. 
| Feature | Class | Object |
| :--- | :--- | :--- |
| **Concept** | The architectural blueprint. | The actual house built from it. |
| **Memory** | None. | Allocates Heap memory upon creation. |
| **Creation** | Uses `class` keyword. | Uses `new` keyword. |
| **Quantity** | Declared once. | Created infinite times. |

---

# =========================================
# 5. The Four Pillars of OOP
# =========================================
**🎯 Objective:** Master the core mechanics of OOP.
| Pillar | What it does | Real-World Analogy |
| :--- | :--- | :--- |
| **Encapsulation** | Hides and protects data inside a class. | A medicine capsule. |
| **Inheritance** | A child class reuses a parent class's code. | Inheriting genetics. |
| **Polymorphism** | One method performing different actions. | A man is a father, son, and employee. |
| **Abstraction** | Hides complex logic; shows simple interface. | Driving without knowing engine mechanics. |

---

# =========================================
# 6. Benefits of OOP
# =========================================
**🎯 Objective:** Understand why Enterprise software uses OOP. 
1. **Code Reusability:** Write once, use everywhere.
2. **Easy Maintenance:** Fix bugs in one object without breaking the entire app.
3. **Security:** Encapsulation prevents hackers from directly editing variables.

---

# =========================================
# 7. Popular OOP Languages
# =========================================
**🎯 Objective:** Real-world applicability.
- **Java:** Purely OOP. Used in Android, Enterprise Apps, and Banking.
- **C++:** Game Development (Unreal Engine).
- **Python:** AI and Data Science.
- **C#:** Windows Apps and Unity Games.

---

# =========================================
# 8. Complete OOP Flow (Memory Concept)
# =========================================
**🎯 Objective:** Understand Stack vs Heap memory. | **📝 Syntax:** `Student s1 = new Student();`
1. `Student s1` ➔ A reference variable (remote control) created in fast **Stack Memory**.
2. `new Student()` ➔ The physical object (the TV) built in slower **Heap Memory**.
3. `=` ➔ Connects the remote to the TV!

---

# =========================================
# 9. Comprehensive OOP Basics Practice
# =========================================
**🎯 Objective:** Combine Class, Object, Fields, and Methods!
```java
// 1. THE CLASS (Blueprint)
class Student {
    String name;   // State
    
    void study() { // Behavior
        System.out.println(name + " is studying Java.");
    }
}

public class Main {
    public static void main(String[] args) {
        // 2. THE OBJECTS (Physical creation)
        Student p1 = new Student(); 
        Student p2 = new Student();

        // 3. ASSIGNING DATA
        p1.name = "Alice"; 
        p2.name = "Bob";   

        // 4. CALLING METHODS
        p1.study(); // Output: Alice is studying Java.
        p2.study(); // Output: Bob is studying Java.
    }
}
```
**🔍 Explanation:** Changing `p1.name` does NOT change `p2.name`. They are completely independent objects in memory.

---

# 🧠 5 Quick Interview Questions
1. **Is Java 100% Object-Oriented?** No, because it uses primitive types (`int`, `double`) for speed.
2. **What does the `new` keyword do?** It dynamically allocates Heap memory for a new object at runtime.
3. **What happens to objects with no reference pointing to them?** They are destroyed by Java's Garbage Collector.
4. **Where are reference variables stored?** In Stack memory.
5. **Can a class exist without an object?** Yes, it is just a logical template waiting to be used.

---

# ❓ 5 Practice Questions
1. Write the definitions of Class and Object in your own words.
2. Explain the difference between Stack and Heap memory regarding objects.
3. Describe a real-world object and list 3 states and 3 behaviors for it.
4. Create a `Book` class with fields for `title`, `author`, and `pages`. 
5. Create an object from the `Book` class and assign it data.

---

# ⭐ 5 Challenge Programs
1. Create an `Employee` class. Give it an `id` and `salary`. Create two employees and give them data.
2. Create a `Dog` class. Give it a `bark()` method. Call the method!
3. Create a `Bank` class with a `balance` field. Write a method `deposit()` that adds money to the balance.
4. Create a `Calculator` class with an `add()` method. Create an object and use it to add two numbers.
5. Write a program that intentionally triggers a `NullPointerException` by declaring an object but forgetting the `new` keyword.

---

> *"The beautiful thing about learning is that no one can take it away from you." — B.B. King*

---

# 🚀 Next Day Preview: Day 15 – Constructors
Today, we manually assigned data to objects line-by-line (`s1.name = "Alice";`). This is slow!
Tomorrow, we learn **Constructors**—special methods that allow us to build an object AND give it data in a single line of code!
```