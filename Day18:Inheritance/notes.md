I caught a detail during my check! In the previous version, I condensed the cheat sheet down to 8 programs, but your actual Java code has **10 distinct programs**. 

To make it truly 100% GitHub-ready and perfectly matching your code file, I have expanded the notes back to exactly **10 Programs**, flawlessly aligned with the code you just wrote. 

Everything is checked, perfectly spaced, and completely ready. Click **Copy code** and post it to GitHub! 🚀✨

```markdown
# 📅 Day 18 – Inheritance

Welcome to Day 18! 🚀 Today, we unlock code reusability! Instead of writing the same code over and over, we will learn how to make a Child class inherit properties from a Parent class using the `extends` keyword! 🧬
✅ Single | ✅ Multilevel | ✅ Hierarchical | ✅ `super` Keyword | ✅ Overriding

---

# 📖 Quick Intro
**Inheritance** establishes an **IS-A** relationship (e.g., A Car IS-A Vehicle). 
- 👨‍👦 **Code Reusability:** Write code once in the Parent class, and all Child classes get it for free!
- 🚫 **Multiple Inheritance:** Java bans inheriting from multiple classes to prevent the "Diamond Problem" (fatal confusion).
- 🤫 **Secret Parent:** Every single class you write secretly inherits from the master `Object` class!

---

# =========================================
# 1. Single Inheritance (Basic) 🟢
# =========================================
**🎯 Objective:** See basic inheritance in action.
```java
class Person {
    public void display() { System.out.println("Name: Nitish"); }
}

class Student extends Person { 
    // 👈 Inherits display() automatically! 
}
```

---

# =========================================
# 2. Single Inheritance (Adding Methods) ➕
# =========================================
**🎯 Objective:** Inherit from the parent, then add unique child behaviors.
```java
class CoursePerson {
    public void displayName() { System.out.println("Name: Nitish"); }
}

class CourseStudent extends CoursePerson {
    public void displayCourse() { System.out.println("Course: CSE-AI&ML"); }
}
```

---

# =========================================
# 3. Multilevel Inheritance 🟡
# =========================================
**🎯 Objective:** Create a family tree (Grandparent ➔ Parent ➔ Child).
```java
class SchoolPerson {
    public void displayName() { System.out.println("Name: Nitish"); }
}

class SchoolStudent extends SchoolPerson {
    public void displayCourse() { System.out.println("Course: CSE-AI&ML"); }
}

// 🎓 CollegeStudent gets BOTH the name and the course!
class CollegeStudent extends SchoolStudent {
    public void displayCollege() { System.out.println("College: ABC Eng"); }
}
```

---

# =========================================
# 4. Multilevel Inheritance (Alternative) 🟡
# =========================================
**🎯 Objective:** Reinforce how deep a family tree can go.
```java
class PersonQ {
    public void displayName() { System.out.println("Name: Nitish"); }
}

class NormalStudent extends PersonQ {
    public void displayCourse() { System.out.println("Course: CSE-AI&ML"); }
}

class College extends NormalStudent {
    public void displayCollege() { System.out.println("College: XYZ-college"); }
}
```

---

# =========================================
# 5. The `super` Keyword 🦸‍♂️
# =========================================
**🎯 Objective:** Talk directly to the Parent class.
```java
class Animal {
    String name = "Dog";
    public void sound() { System.out.println("Animal Sound"); }
}

class Pet extends Animal {
    String name = "Labrador"; // Variable Shadowing!

    public void display() {
        System.out.println("Child Name  : " + name);
        System.out.println("Parent Name : " + super.name); // 👈 Gets Parent variable!
    }

    public void sound() {
        super.sound(); // 👈 Calls Parent method!
        System.out.println("Pet barks.");
    }
}
```

---

# =========================================
# 6. Method Overriding 🔄
# =========================================
**🎯 Objective:** A child class completely changes how a parent's method works!
```java
class Animal {
    public void sound() { System.out.println("Animal makes a sound."); }
}

class Dog extends Animal {
    @Override // 👈 Tells Java we are crushing the parent's method!
    public void sound() {
        System.out.println("Dog barks! 🐶");
    }
}
```

---

# =========================================
# 7. Parent & Child Demo 👨‍👦
# =========================================
**🎯 Objective:** Simple demonstration of classes holding specific logic.
```java
class Parent {
    public void displayParent() { System.out.println("This is the parent class"); }
}

class Child extends Parent {
    public void displayChild() { System.out.println("This is the child class"); }
}
```

---

# =========================================
# 8. Hierarchical Inheritance (Pets) 🔵
# =========================================
**🎯 Objective:** Multiple children inheriting from ONE single parent!
```java
class PetAnimal {
    String name;
    public void setDetails(String name) { this.name = name; }
}

class DogAnimal extends PetAnimal {
    public void sound() { System.out.println("Bark! 🐶"); }
}

class CatAnimal extends PetAnimal {
    public void sound() { System.out.println("Meow! 🐱"); }
}
```

---

# =========================================
# 9. Real-World Hierarchical (Vehicles) 🚗
# =========================================
**🎯 Objective:** Sharing basic logic across different types of objects.
```java
class Vehicle {
    String brand;
    public void setBrand(String brand) { this.brand = brand; }
}

class Car extends Vehicle {
    int doors; // Car-specific
}

class Bike extends Vehicle {
    String engineType; // Bike-specific
}
```

---

# =========================================
# 10. Single Inheritance (Employee System) 🏢
# =========================================
**🎯 Objective:** Professional software architecture.
```java
class Employee {
    int id;
    String name;
    public void setDetails(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Manager extends Employee {
    String department; // Managers have departments, regular employees don't!
    public void setDept(String dept) { this.department = dept; }
}
```

---

# 🧠 5 Quick Interview Questions
1. **What is Inheritance?** A mechanism where one class acquires the properties and methods of another.
2. **Does Java support Multiple Inheritance?** No, to prevent the "Diamond Problem" (confusion if both parents have the same method).
3. **What does the `super` keyword do?** It acts as a reference variable pointing directly to the immediate Parent class object.
4. **What is Method Overriding?** When a child class provides a specific implementation for a method already defined in its parent.
5. **Are Constructors inherited?** 🚫 No! Constructors and Private members are NEVER inherited!

---

# ❓ 5 Practice Questions
1. 📝 Create a `Shape` parent class and a `Circle` child class.
2. 💻 Make a child class override a parent's `draw()` method.
3. 🦸‍♂️ Write a program where a child method calls `super.draw()`.
4. 🔀 Build a Multilevel hierarchy: `Animal` ➔ `Mammal` ➔ `Human`.
5. 🚫 Try to inherit a `private` variable from a parent and watch it fail!

---

# ⭐ 5 Challenge Programs
1. 🏦 Build a Hierarchical system: `Bank` parent with `SBI` and `HDFC` children.
2. 🚗 Create a `Vehicle` class. Override its `topSpeed()` method in a `SportsCar` class.
3. 💥 Purposely create a method in a child class with the *wrong* signature, but put `@Override` above it to watch the compiler catch your error!
4. 🔗 Create an `Employee` ➔ `Manager` ➔ `CEO` multilevel chain. Give them all different bonuses.
5. 🦸‍♂️ Write a Parent class with a variable `age = 50`. Write a Child with `age = 20`. Print both using `this.age` and `super.age`.

---

> *"Don't reinvent the wheel. Inherit it, improve it, and drive!"* 🏎️💨

---

# 🚀 Next Day Preview: Day 19 – Polymorphism
You've learned how to inherit methods. But what if a single method could change its shape depending on the situation? 🧬
Tomorrow, you'll learn **Polymorphism**—the ultimate magic of OOP! We will cover Method Overloading (Compile-time) and Dynamic Method Dispatch (Run-time). Prepare to write extremely flexible code! 
```