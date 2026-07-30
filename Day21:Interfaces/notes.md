
# 📅 Day 21 – Interfaces

Welcome to Day 21! 🚀 Today, we conquer 100% pure abstraction using **Interfaces**. 
Interfaces allow us to break Java's "single inheritance" rule. A class can inherit abilities from MULTIPLE sources! 🎭

✅ Interfaces | ✅ Multiple Inheritance | ✅ Default Methods | ✅ Functional & Marker Interfaces

---

# 📖 Quick Intro
- 🤝 **Interface:** A pure contract. It has empty methods that child classes *must* implement.
- 🔀 **Multiple Inheritance:** A single class can `implement` as many interfaces as it wants!
- 🔒 **Constants:** Every variable in an interface is automatically `public static final`.
- 🚀 **Java 8+ Features:** Interfaces can now contain `default` and `static` methods that actually have bodies!

---

# =========================================
# 1. Basic Interface Implementation 🔌
# =========================================
**🎯 Objective:** Create a contract and force a class to fulfill it.
```java
interface Switchable {
    void turnOn(); // 👻 Automatically public abstract!
}

class Laptop implements Switchable {
    @Override
    public void turnOn() { // 👈 MUST be public!
        System.out.println("Your laptop turns on. 💻");
    }
}
```

---

# =========================================
# 2. Multiple Methods in an Interface 🛠️
# =========================================
**🎯 Objective:** Interfaces can dictate complex behaviors.
```java
interface Switchable2 {
    void turnOn();
    void turnOff();
}

class Television implements Switchable2 {
    @Override
    public void turnOn() { System.out.println("TV has been turned on. 📺"); }
    
    @Override
    public void turnOff() { System.out.println("TV has been turned off."); }
}
```

---

# =========================================
# 3. Multiple Classes Implementing an Interface 🤝
# =========================================
**🎯 Objective:** One contract, many different fulfilling classes.
```java
interface Switchable3 {
    void turnOn();
    void turnOff();
}

class Laptop2 implements Switchable3 {
    public void turnOn() { System.out.println("Laptop on."); }
    public void turnOff() { System.out.println("Laptop off."); }
}

class Television2 implements Switchable3 {
    public void turnOn() { System.out.println("TV on."); }
    public void turnOff() { System.out.println("TV off."); }
}
```

---

# =========================================
# 4. Multiple Inheritance (The Magic!) ✨
# =========================================
**🎯 Objective:** A class can inherit from TWO parents by using interfaces!
```java
interface Camera { void photo(); }
interface Call { void calling(); }

// 🔀 Implementing TWO interfaces at once!
class Smartphone implements Camera, Call {
    @Override
    public void photo() { System.out.println("Taking photo... 📸"); }
    
    @Override
    public void calling() { System.out.println("Calling someone... 📞"); }
}
```

---

# =========================================
# 5. Interface Constants (Variables) 🔒
# =========================================
**🎯 Objective:** Interface variables are completely locked.
```java
interface Company {
    // Secretly treated as: public static final String COMPANY_NAME
    String COMPANY_NAME = "SIRI SOLUTIONS"; 
}

class Smartphone4 implements Company {
    public void display() {
        System.out.println("Company Name: " + COMPANY_NAME);
    }
}
```

---

# =========================================
# 6. Default Methods (Java 8+) 🛡️
# =========================================
**🎯 Objective:** Add methods with bodies to an interface without breaking child classes!
```java
interface Remote {
    void turnOn();
    
    // ✅ Default method HAS a body!
    default void turnOff() {
        System.out.println("Device is turning off via default method. 🔴");   
    }
}

class Television5 implements Remote {
    @Override
    public void turnOn() { System.out.println("Television turned on."); }
    // turnOff() is automatically inherited!
}
```

---

# =========================================
# 7. Static Methods (Java 8+) ⚡
# =========================================
**🎯 Objective:** Helper methods attached directly to the interface.
```java
interface Calculator {
    void addition();
    
    // ✅ Static method HAS a body!
    static void basic() {
        System.out.println("Welcome to the calculator interface. 🧮");
    }
}

class BasicCalculator implements Calculator {
    public void addition() { System.out.println("Doing addition."); }
}
// Call it via: Calculator.basic();
```

---

# =========================================
# 8. Functional Interfaces (SAM) 🎯
# =========================================
**🎯 Objective:** An interface with exactly ONE abstract method.
```java
@FunctionalInterface // 👈 Forces the compiler to ensure only 1 method exists!
interface Printer {
    void print();
}

class Message implements Printer {
    public void print() { System.out.println("Message printed. 🖨️"); }
}
```

---

# =========================================
# 9. Marker Interfaces 🏷️
# =========================================
**🎯 Objective:** An empty interface used to tag a class for the JVM.
```java
interface Printable {
    // 👻 Absolutely nothing here!
}

class Documents implements Printable {
    public void display() { System.out.println("Printing document. 📄"); }
}
```

---

# =========================================
# 10. Default Methods with Multiple Classes 📱
# =========================================
**🎯 Objective:** Sharing default behavior across multiple systems.
```java
interface SmartDevice {
    void turnOn();
    default void turnOff() { System.out.println("Smart device turned off. 💡"); }
}

class SmartLight implements SmartDevice {
    public void turnOn() { System.out.println("Smart Light turned on."); }
}

class SmartFan implements SmartDevice {
    public void turnOn() { System.out.println("Smart Fan turned on. 🌀"); }
}
```

---

# 🧠 5 Quick Interview Questions
1. **Can you instantiate an Interface?** 🚫 NO! You cannot use `new InterfaceName();`.
2. **What access modifier do interface methods have?** They are implicitly `public abstract`. (Except for Java 8 default/static methods).
3. **What is Multiple Inheritance?** When a class implements more than one interface, breaking the single-parent class rule.
4. **What is a Functional Interface?** An interface with exactly ONE abstract method (used heavily for Lambda Expressions).
5. **What is a Marker Interface?** An empty interface with zero methods, used to "tag" a class for the JVM (e.g., `Serializable`).

---

# ❓ 5 Practice Questions
1. 📝 Create an interface `Vehicle` with an abstract method `drive()`. Implement it in a `Car` class.
2. 💻 Create two interfaces and have a single class implement BOTH of them.
3. 🛑 Try to change the value of an interface variable in your main method and read the error!
4. 🦸‍♂️ Add a `default` method to an interface and call it using a child object without overriding it.
5. 🔀 Add the `@FunctionalInterface` annotation to an interface with TWO methods and watch the compiler reject it!

---

# ⭐ 5 Challenge Programs
1. 🏠 Build a `SmartHome` system. Make an `AC` class implement both `Coolable` and `WiFiEnabled` interfaces.
2. 👨‍💻 Create an interface with a `static` method and call it directly using the interface name.
3. 🎮 Create a `Playable` interface. Implement it in `AudioPlayer` and `VideoPlayer` and execute them using Dynamic Method Dispatch (Parent reference).
4. 💥 Purposely forget to write `public` when overriding an interface method in a child class. See what the compiler says!
5. 🤫 Have an interface `extend` another interface (Yes, this is allowed!), and make a class implement the child interface.

---

> *"A contract is a contract. When you sign it, you must fulfill it."* 📝

---

# 🚀 Next Day Preview: Day 22 – Exception Handling
You've built beautiful, object-oriented systems. But what happens when things go wrong? What happens when a user types a word instead of a number, or the database crashes? If you don't handle it, your program explodes! 💥

Tomorrow, we dive into **Exception Handling**! You will learn how to catch errors before they crash your program using `try`, `catch`, `finally`, and `throw`. Get ready to make your code bulletproof! 🛡️💻🔥
```