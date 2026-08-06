
/*
==========================================
        DAY 19 - POLYMORPHISM
==========================================

Topics Covered:
1. Basic Method Creation
2. Method Overloading (By Number of Args)
3. Method Overloading (By Data Type)
4. Method Overloading (Advanced Args)
5. Method Overriding (Basic)
6. Method Overriding (Hierarchical)
7. The 'final' Keyword in Polymorphism
8. Dynamic Method Dispatch (Shapes)
9. Dynamic Method Dispatch (Animals)
10. Dynamic Method Dispatch (Payments)

Author: Nitish
==========================================
*/

// =========================================
// Program 1 - Basic Method
// =========================================
class Display {
    public void show() {
        System.out.println("I will be back.");
    }
}

// =========================================
// Program 2 - Method Overloading (By Number of Args)
// =========================================
class Calculator {
    public void add(int a, int b) {
        System.out.println("Sum of two numbers   : " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Sum of three numbers : " + (a + b + c));
    }
}

// =========================================
// Program 3 - Method Overloading (By Data Type)
// =========================================
class GameChanger {
    public void changer(int number) {
        System.out.println("Integer Number : " + number);
    }

    public void changer(double number) { // Changed to primitive double for consistency
        System.out.println("Double Number  : " + number);
    }

    public void changer(String text) {
        System.out.println("String Text    : " + text);
    }
}

// =========================================
// Program 4 - Method Overloading (Advanced Args)
// =========================================
class Multiplier {
    public void multi(int a, int b) {
        System.out.println("Multiplication of 2 numbers : " + (a * b));
    }

    public void multi(int a, int b, int c) {
        System.out.println("Multiplication of 3 numbers : " + (a * b * c));
    }

    public void multi(int a, int b, int c, int d) {
        System.out.println("Multiplication of 4 numbers : " + (a * b * c * d));
    }
}

// =========================================
// Program 5 & 6 - Method Overriding
// =========================================
class Animal {
    public void sound() {
        System.out.println("Animal makes a generic sound.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks. 🐶");
    }
}

class Cat extends Animal { 
    @Override
    public void sound() {
        System.out.println("Cat meows. 🐱");
    }
}

// =========================================
// Program 7 - The 'final' Keyword
// =========================================
class Animal2 {
    // Cannot be overridden by child classes!
    public final void sounding() {
        System.out.println("Animal makes a locked sound.");
    }
}

class Dog2 extends Animal2 {
    // Cannot write public void sounding() here, so we make a new method.
    public void sounder() {
        System.out.println("Dog barks loudly.");
    }
}

// =========================================
// Program 8 - Dynamic Method Dispatch (Shapes)
// =========================================
class Shape {
    public void calculateArea() {
        System.out.println("Area calculation depends on the shape.");
    }
}

class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }

    @Override
    public void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle    : " + area);
    }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Rectangle : " + (length * width));
    }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Triangle  : " + (0.5 * base * height));
    }
}

// =========================================
// Program 9 - Hierarchical Overriding (Animals)
// =========================================
class Animal3 {
    public void soo() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog3 extends Animal3 {
    @Override
    public void soo() {
        System.out.println("Dog barks.");
    }
}

class Cat3 extends Animal3 { 
    @Override
    public void soo() {
        System.out.println("Cat meows.");
    }
}

class Cow3 extends Animal3 { 
    @Override
    public void soo() {
        System.out.println("Cow moos.");
    }
}

// =========================================
// Program 10 - Dynamic Method Dispatch (Payments)
// =========================================
class Payment {
    public void pay() {
        System.out.println("Processing generic payment...");
    }
}

class UpiPayment extends Payment { 
    @Override
    public void pay() {
        System.out.println("Payment is being made using UPI. 📱");
    }
}

class CardPayment extends Payment { 
    @Override
    public void pay() {
        System.out.println("Payment is being made using Card. 💳");
    }
}

class CashPayment extends Payment { 
    @Override
    public void pay() {
        System.out.println("Payment is being made using Cash. 💵"); 
    }
}

// =========================================
// Main Method - Execution
// =========================================
public class Main {
    public static void main(String[] args) {

        System.out.println("===== Program 1 - Basic Method =====");
        Display d1 = new Display();
        d1.show();
        System.out.println();
       
        System.out.println("===== Program 2 - Overloading (By Args) =====");
        Calculator c1 = new Calculator();
        c1.add(10, 20);
        c1.add(10, 20, 30);
        System.out.println();
        
        System.out.println("===== Program 3 - Overloading (By Type) =====");
        GameChanger g1 = new GameChanger();
        g1.changer(19);
        g1.changer(19.5);
        g1.changer("Kick");
        System.out.println();
        
        System.out.println("===== Program 4 - Overloading (Advanced) =====");
        Multiplier m1 = new Multiplier();
        m1.multi(10, 20);
        m1.multi(10, 20, 30);
        m1.multi(10, 20, 30, 40);
        System.out.println();
        
        System.out.println("===== Program 5 & 6 - Method Overriding =====");
        Animal a1 = new Animal();
        a1.sound();
        Dog dog1 = new Dog();
        dog1.sound();
        Cat cat1 = new Cat();
        cat1.sound();
        System.out.println();
        
        System.out.println("===== Program 7 - The 'final' Keyword =====");
        Animal2 animal2 = new Animal2();
        animal2.sounding();
        Dog2 dog2 = new Dog2();
        dog2.sounder(); 
        System.out.println();

        System.out.println("===== Program 8 - Dynamic Method Dispatch (Shapes) =====");
        // Parent Reference holding Child Objects!
        Shape shape;
        shape = new Circle(7);
        shape.calculateArea();

        shape = new Rectangle(10, 5);
        shape.calculateArea();

        shape = new Triangle(8, 6);
        shape.calculateArea();
        System.out.println();

        System.out.println("===== Program 9 - Hierarchical Overriding =====");
        Animal3 animal3 = new Animal3();
        animal3.soo();
        Dog3 dog3 = new Dog3();
        dog3.soo();
        Cat3 cat3 = new Cat3();
        cat3.soo();
        Cow3 cow3 = new Cow3();
        cow3.soo();
        System.out.println();
        
        System.out.println("===== Program 10 - Dynamic Method Dispatch (Payments) =====");
        // Parent References holding specific Payment Types! (Upcasting)
        Payment payment = new Payment();
        payment.pay();
        
        Payment upi = new UpiPayment();
        upi.pay();
        
        Payment card = new CardPayment();
        card.pay();
        
        Payment cash = new CashPayment();
        cash.pay();
    }
}

/*
==========================================
End of Day 19

Next Topic:
Abstraction
==========================================
*/
