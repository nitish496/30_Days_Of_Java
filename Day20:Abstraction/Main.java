/*
==========================================
        DAY 20 - ABSTRACTION
==========================================

Topics Covered:
1. Abstract Class & Concrete Class
2. Abstract Class with Normal Methods
3. Forcing Method Implementation
4. Professional Abstraction (Employees)
5. Abstract Class Constructors
6. Multiple Inheritance using Interfaces
7. Abstract Class + Interface (Hybrid)
8. Real-World: Bank Accounts (Dynamic Dispatch)
9. Real-World: Vehicle System
10. Real-World: Payment Gateway

Author: Nitish
==========================================
*/

// =========================================
// Program 1 - Abstract Class & Concrete Class
// =========================================
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks. 🐶");
    }
}

// =========================================
// Program 2 - Abstract Class with Normal Methods
// =========================================
abstract class Animal2 {
    void eat() {
        System.out.println("Animals eat food. 🍖");
    }
    
    abstract void sound();
}

class Dog2 extends Animal2 {
    @Override
    void sound() {
        System.out.println("Dog2 barks loudly!");
    }
}

// =========================================
// Program 3 - Forcing Method Implementation
// =========================================
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("The car engine starts working. 🏎️");
    }
}

// =========================================
// Program 4 - Professional Abstraction (Employees)
// =========================================
abstract class Employee {
    abstract void work();
}

class SoftwarePerson extends Employee {
    @Override
    void work() {
        System.out.println("The software engineer is writing code. 💻");
    }
}

// =========================================
// Program 5 - Abstract Class Constructors
// =========================================
abstract class Employee1 {
    Employee1() {
        System.out.println("Abstract Employee constructor is called! 🏗️");
    }
    
    abstract void work();
}

class SoftwareEngineer1 extends Employee1 {
    @Override
    void work() {
        System.out.println("Your work is to develop the backend or frontend.");
    }
}

// =========================================
// Program 6 - Multiple Inheritance using Interfaces
// =========================================
interface Call {
    void calling();
}

interface Music {
    void playMusic();
}

class Smartphone implements Call, Music {
    @Override
    public void calling() {
        System.out.println("Your phone is calling... 📞");
    }
    
    @Override
    public void playMusic() {
        System.out.println("Your phone is playing music. 🎵");
    }
}

// =========================================
// Program 7 - Abstract Class + Interface (Hybrid)
// =========================================
abstract class Vehicle2 {
    public void start() {
        System.out.println("Vehicle started. 🔑");
    }
    
    abstract void drive();
}

interface MusicSystem {
    void playMusic();
}

class Car2 extends Vehicle2 implements MusicSystem {
    @Override
    void drive() {
        System.out.println("Car is moving smoothly. 🚗");
    }
    
    @Override
    public void playMusic() {
        System.out.println("Playing music in the car! 🎶");
    }
}

// =========================================
// Program 8 - Real-World: Bank Accounts
// =========================================
abstract class BankAccount {
    public void deposit() {
        System.out.println("Money deposited successfully. 💰");
    }
    
    abstract void withdraw();
}

class SavingsAccount extends BankAccount {
    @Override
    void withdraw() {
        System.out.println("Money successfully withdrawn from the Savings Account.");
    }
}

class CurrentAccount extends BankAccount {
    @Override
    void withdraw() {
        System.out.println("Money successfully withdrawn from the Current Account.");
    }
}

// =========================================
// Program 9 - Real-World: Vehicle System
// =========================================
abstract class Vehicle3 {
    abstract void start();
    abstract void stop();
}

class Car3 extends Vehicle3 {
    @Override
    void start() {
        System.out.println("Car started. 🚙");
    }

    @Override
    void stop() {
        System.out.println("Car stopped. 🛑");
    }
}

class Bike3 extends Vehicle3 {
    @Override
    void start() {
        System.out.println("Bike started. 🏍️");
    }

    @Override
    void stop() {
        System.out.println("Bike stopped. 🛑");
    }
}

// =========================================
// Program 10 - Real-World: Payment Gateway
// =========================================
abstract class Payment1 {
   abstract void processPayment();
}

class UPI1 extends Payment1 {
    @Override
    void processPayment() {
        System.out.println("Payment processed using UPI. 📱");
    }
}

class CreditCard1 extends Payment1 {
    @Override
    void processPayment() {
        System.out.println("Payment processed using a Credit Card. 💳");
    }
}

class NetBanking1 extends Payment1 {
    @Override
    void processPayment() {
        System.out.println("Payment processed using Net Banking. 🏦");
    }
}

// =========================================
// Main Method - Execution
// =========================================
public class Main {
    public static void main(String[] args) {

        System.out.println("===== Program 1 - Abstract & Concrete =====");
        Dog d1 = new Dog();
        d1.sound();
        System.out.println();

        System.out.println("===== Program 2 - Normal Methods in Abstract Class =====");
        Dog2 d2 = new Dog2();
        d2.eat();
        d2.sound();
        System.out.println();

        System.out.println("===== Program 3 - Forcing Implementation =====");
        Car c1 = new Car();
        c1.start();
        System.out.println();

        System.out.println("===== Program 4 - Employee Abstraction =====");
        SoftwarePerson e1 = new SoftwarePerson();
        e1.work();
        System.out.println();

        System.out.println("===== Program 5 - Abstract Constructors =====");
        SoftwareEngineer1 eng = new SoftwareEngineer1();
        eng.work();
        System.out.println();

        System.out.println("===== Program 6 - Multiple Interfaces =====");
        Smartphone p1 = new Smartphone();
        p1.calling();
        p1.playMusic();
        System.out.println();

        System.out.println("===== Program 7 - Abstract Class + Interface =====");
        Car2 car = new Car2();
        car.start();
        car.drive();
        car.playMusic();
        System.out.println();

        System.out.println("===== Program 8 - Bank Accounts =====");
        BankAccount account; // Upcasting!
        
        account = new SavingsAccount();
        account.deposit();
        account.withdraw();
        System.out.println();
        
        account = new CurrentAccount();
        account.deposit();
        account.withdraw();
        System.out.println();

        System.out.println("===== Program 9 - Vehicle System =====");
        Vehicle3 vehicle; // Upcasting!
        
        vehicle = new Car3();
        vehicle.start();
        vehicle.stop();
        System.out.println();
        
        vehicle = new Bike3();
        vehicle.start();
        vehicle.stop();
        System.out.println();

        System.out.println("===== Program 10 - Payment Gateway =====");
        Payment1 payment; // Upcasting!
        
        payment = new CreditCard1();
        payment.processPayment();
        
        payment = new UPI1();
        payment.processPayment();
        
        payment = new NetBanking1();
        payment.processPayment();
    }
}

/*
==========================================
End of Day 20

Next Topic:
Interfaces
==========================================
*/