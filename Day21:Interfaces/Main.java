/*
==========================================
        DAY 21 - INTERFACES
==========================================

Topics Covered:
1. Basic Interface Implementation
2. Multiple Methods in an Interface
3. Multiple Classes Implementing an Interface
4. Multiple Inheritance (Using Interfaces)
5. Interface Constants (Variables)
6. Default Methods in Interfaces (Java 8+)
7. Static Methods in Interfaces (Java 8+)
8. Functional Interfaces (@FunctionalInterface)
9. Marker Interfaces (Empty Interfaces)
10. Default Methods with Multiple Classes

Author: Nitish
==========================================
*/

// =========================================
// Program 1 - Basic Interface Implementation
// =========================================
interface Switchable {
    void turnOn();
}

class Laptop implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Your laptop turns on. 💻");
    }
}

// =========================================
// Program 2 - Multiple Methods in an Interface
// =========================================
interface Switchable2 {
    void turnOn();
    void turnOff();
}

class Television implements Switchable2 { // Fixed typo: Telvision -> Television
    @Override
    public void turnOn() {
        System.out.println("TV has been turned on. 📺");
    }
    
    @Override
    public void turnOff() {
        System.out.println("TV has been turned off.");
    }
}

// =========================================
// Program 3 - Multiple Classes Implementing an Interface
// =========================================
interface Switchable3 {
    void turnOn();
    void turnOff();
}

class Laptop2 implements Switchable3 {
    @Override
    public void turnOn() {
        System.out.println("Laptop has been turned on.");
    }
    
    @Override
    public void turnOff() {
        System.out.println("Laptop has been turned off.");
    }
}

class Television2 implements Switchable3 {
    @Override
    public void turnOn() {
        System.out.println("TV has been turned on.");
    }
    
    @Override
    public void turnOff() {
        System.out.println("TV has been turned off.");
    }
}

// =========================================
// Program 4 - Multiple Inheritance (Using Interfaces)
// =========================================
interface Camera {
    void photo(); // Standardized to camelCase
}

interface Call { // Standardized to PascalCase
    void calling(); // Standardized to camelCase
}

class Smartphone implements Camera, Call {
    @Override
    public void photo() {
        System.out.println("Photo has been taken and stored in phone. 📸");
    }
    
    @Override
    public void calling() {
        System.out.println("Your phone is calling someone... 📞");
    }
}

// =========================================
// Program 5 - Interface Constants (Variables)
// =========================================
interface Company {
    // Interface variables are implicitly public, static, and final
    String COMPANY_NAME = "SIRI SOLUTIONS"; 
}

class Smartphone4 implements Company {
    public void display() {
        System.out.println("Company Name: " + COMPANY_NAME);
    }
}

// =========================================
// Program 6 - Default Methods in Interfaces (Java 8+)
// =========================================
interface Remote {
    void turnOn();
    
    // Default method - provides a body inside an interface!
    default void turnOff() {
        System.out.println("Device is turning off via default method. 🔴");   
    }
}

class Television5 implements Remote {
    @Override
    public void turnOn() {
        System.out.println("Television has been turned on.");
    }
    // turnOff() is automatically inherited from the interface!
}

// =========================================
// Program 7 - Static Methods in Interfaces (Java 8+)
// =========================================
interface Calculator {
    void addition();
    
    // Static method - called using Interface name!
    static void basic() {
        System.out.println("Welcome to the calculator interface. 🧮");
    }
}

class BasicCalculator implements Calculator {
    @Override
    public void addition() {
        System.out.println("Your calculator can do addition.");
    }
}

// =========================================
// Program 8 - Functional Interfaces
// =========================================
@FunctionalInterface // Interface with exactly ONE abstract method
interface Printer { // Standardized to PascalCase
    void print();
}

class Message implements Printer {
    @Override
    public void print() {
        System.out.println("The message has been printed. 🖨️");
    }
}

// =========================================
// Program 9 - Marker Interfaces
// =========================================
interface Printable { // Standardized to PascalCase
    // Marker Interface - completely empty!
}

class Documents implements Printable {
    public void display() {
        System.out.println("Printing document from a Marker Interface. 📄");
    }
}

// =========================================
// Program 10 - Default Methods with Multiple Classes
// =========================================
interface SmartDevice { // Fixed typo: SamrtDevice -> SmartDevice
    void turnOn();
    
    default void turnOff() {
        System.out.println("Smart device has been turned off. 💡");
    }
}

class SmartLight implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart Light has been turned on.");
    }
}

class SmartFan implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart Fan has been turned on. 🌀");
    }
}

// =========================================
// Main Method - Execution
// =========================================
public class Main {
    public static void main(String[] args) {

        System.out.println("===== Program 1 - Basic Interface =====");
        Laptop l1 = new Laptop();
        l1.turnOn();
        System.out.println();
        
        System.out.println("===== Program 2 - Multiple Methods =====");
        Television t1 = new Television();
        t1.turnOn();
        t1.turnOff();
        System.out.println();
        
        System.out.println("===== Program 3 - Multiple Classes =====");
        Laptop2 l2 = new Laptop2();
        l2.turnOn();
        l2.turnOff();
        Television2 t2 = new Television2();
        t2.turnOn();
        t2.turnOff();
        System.out.println();
        
        System.out.println("===== Program 4 - Multiple Inheritance =====");
        Smartphone p1 = new Smartphone();
        p1.photo();
        p1.calling();
        System.out.println();
        
        System.out.println("===== Program 5 - Interface Constants =====");
        Smartphone4 p4 = new Smartphone4();
        p4.display();
        System.out.println();
        
        System.out.println("===== Program 6 - Default Methods =====");
        Television5 t5 = new Television5();
        t5.turnOn();
        t5.turnOff(); // Inherited from interface!
        System.out.println();
        
        System.out.println("===== Program 7 - Static Methods =====");
        Calculator.basic(); // Calling static method directly from Interface
        BasicCalculator c1 = new BasicCalculator();
        c1.addition();
        System.out.println();
        
        System.out.println("===== Program 8 - Functional Interfaces =====");
        Message m1 = new Message();
        m1.print();
        System.out.println();
        
        System.out.println("===== Program 9 - Marker Interfaces =====");
        Documents d1 = new Documents();
        d1.display();
        System.out.println();
        
        System.out.println("===== Program 10 - Default Methods (Multi Class) =====");
        SmartLight q1 = new SmartLight();
        q1.turnOn();
        q1.turnOff();
        
        SmartFan q2 = new SmartFan();
        q2.turnOn();
        q2.turnOff();
    }
}