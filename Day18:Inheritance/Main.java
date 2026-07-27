/*
==========================================
        DAY 18 - INHERITANCE
==========================================

Topics Covered:
1. Single Inheritance (Basic)
2. Single Inheritance (Adding Methods)
3. Multilevel Inheritance
4. Multilevel Inheritance (Alternative)
5. The 'super' Keyword (Variables & Methods)
6. Method Overriding
7. Parent and Child Demo
8. Hierarchical Inheritance (Pets)
9. Hierarchical Inheritance (Vehicles)
10. Single Inheritance (Employee & Manager)

Author: Nitish
==========================================
*/

// =========================================
// Program 1 - Single Inheritance (Basic)
// =========================================
class Person1 {
    public void display() {
        System.out.println("Name: Nitish");
    }
}

class Student1 extends Person1 {
    // Inherits display() automatically
}

// =========================================
// Program 2 - Single Inheritance (Adding Methods)
// =========================================
class CoursePerson {
    public void displayName() {
        System.out.println("Name: Nitish");
    }
}

class CourseStudent extends CoursePerson {
    public void displayCourse() {
        System.out.println("Course: CSE-AI&ML");
    }
}

// =========================================
// Program 3 - Multilevel Inheritance
// =========================================
class SchoolPerson {
    public void displayName() {
        System.out.println("Name: Nitish");
    }
}

class SchoolStudent extends SchoolPerson {
    public void displayCourse() {
        System.out.println("Course: CSE-AI&ML");
    }
}

class CollegeStudent extends SchoolStudent {
    public void displayCollege() {
        System.out.println("College: ABC Engineering College");
    }
}

// =========================================
// Program 4 - Multilevel Inheritance (Alternative)
// =========================================
class PersonQ {
    public void displayName() {
        System.out.println("Name: Nitish");
    }
}

class NormalStudent extends PersonQ {
    public void displayCourse() {
        System.out.println("Course: CSE-AI&ML");
    }
}

class College extends NormalStudent {
    public void displayCollege() {
        System.out.println("College: XYZ-college");
    }
}

// =========================================
// Program 5 - The 'super' Keyword
// =========================================
class Animal {
    String name = "Dog";
    
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Pet extends Animal {
    String name = "Labrador"; // Variable Shadowing

    public void display() {
        System.out.println("Child name  : " + name);
        System.out.println("Parent name : " + super.name); // Using 'super' for variables
    }

    public void sound() {
        super.sound(); // Using 'super' for methods
        System.out.println("Pet barks.");
    }
}

// =========================================
// Program 6 - Method Overriding
// =========================================
class Animal1 {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal1 {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

// =========================================
// Program 7 - Parent and Child Demo
// =========================================
class Parent {
    public void displayParent() {
        System.out.println("This is the parent class");
    }
}

class Child extends Parent {
    public void displayChild() {
        System.out.println("This is the child class");
    }
}

// =========================================
// Program 8 - Hierarchical Inheritance (Pets)
// =========================================
class PetAnimal {
    String name;
    int age;

    public void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class DogAnimal extends PetAnimal {
    public void sound() {
        System.out.println("Sound : Bark");
    }
}

class CatAnimal extends PetAnimal {
    public void sound() {
        System.out.println("Sound : Meow");
    }
}

// =========================================
// Program 9 - Hierarchical Inheritance (Vehicles)
// =========================================
class Vehicle {
    String brand;
    String model;

    public void setDetails(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
    }
}

class Car extends Vehicle {
    int doors;

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void displayCar() {
        System.out.println("Doors : " + doors);
    }
}

class Bike extends Vehicle {
    String engineType;

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void displayBike() {
        System.out.println("Engine Type : " + engineType);
    }
}

// =========================================
// Program 10 - Single Inheritance (Employee & Manager)
// =========================================
class Employee {
    int employeeId;
    String employeeName;

    public void setEmployeeDetails(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
    }
}

class Manager extends Employee {
    String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayManagerDetails() {
        System.out.println("Department    : " + department);
    }
}

// =========================================
// Main Method - Execution
// =========================================
public class Main {
    public static void main(String[] args) {

        System.out.println("===== Program 1 - Single Inheritance =====");
        Student1 s1 = new Student1();
        s1.display();
        System.out.println();

        System.out.println("===== Program 2 - Adding Methods =====");
        CourseStudent s2 = new CourseStudent();
        s2.displayName();
        s2.displayCourse();
        System.out.println();

        System.out.println("===== Program 3 - Multilevel Inheritance =====");
        CollegeStudent s3 = new CollegeStudent();
        s3.displayName();
        s3.displayCourse();
        s3.displayCollege();
        System.out.println();

        System.out.println("===== Program 4 - Multilevel (Alternative) =====");
        College s4 = new College();
        s4.displayName();
        s4.displayCourse();
        s4.displayCollege();
        System.out.println();

        System.out.println("===== Program 5 - The 'super' Keyword =====");
        Pet p1 = new Pet();
        p1.display();
        System.out.println();
        p1.sound();
        System.out.println();

        System.out.println("===== Program 6 - Method Overriding =====");
        Dog dog = new Dog();
        dog.sound();
        System.out.println();

        System.out.println("===== Program 7 - Parent & Child Demo =====");
        Child c1 = new Child();
        c1.displayParent();
        c1.displayChild();
        System.out.println();

        System.out.println("===== Types of Inheritance in Java =====");
        System.out.println("1. Single Inheritance       - Supported");
        System.out.println("2. Multilevel Inheritance   - Supported");
        System.out.println("3. Hierarchical Inheritance - Supported");
        System.out.println("4. Multiple Inheritance     - Not Supported (Using Classes)");
        System.out.println("5. Hybrid Inheritance       - Not Supported (Using Classes)");
        System.out.println();

        System.out.println("===== Program 8 - Hierarchical (Pets) =====");
        DogAnimal dogAnimal = new DogAnimal();
        dogAnimal.setDetails("Tommy", 4);
        dogAnimal.displayDetails();
        dogAnimal.sound();
        System.out.println();

        CatAnimal cat = new CatAnimal();
        cat.setDetails("Kitty", 2);
        cat.displayDetails();
        cat.sound();
        System.out.println();

        System.out.println("===== Program 9 - Hierarchical (Vehicles) =====");
        Car car = new Car();
        car.setDetails("Toyota", "Fortuner");
        car.setDoors(4);
        car.displayDetails();
        car.displayCar();
        System.out.println();

        Bike bike = new Bike();
        bike.setDetails("Royal Enfield", "Classic 350");
        bike.setEngineType("Single Cylinder");
        bike.displayDetails();
        bike.displayBike();
        System.out.println();

        System.out.println("===== Program 10 - Single (Employee & Manager) =====");
        Manager manager = new Manager();
        manager.setEmployeeDetails(101, "Alice");
        manager.setDepartment("Information Technology");
        manager.displayEmployeeDetails();
        manager.displayManagerDetails();
    }
}

/*
==========================================
End of Day 18

Next Topic:
Polymorphism
==========================================
*/