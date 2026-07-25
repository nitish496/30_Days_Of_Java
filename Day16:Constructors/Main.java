/*
==========================================
        DAY 16 - CONSTRUCTORS
==========================================

Topics Covered:
1. Introduction to Constructors
2. Default Constructor
3. No-Argument Constructor
4. Parameterized Constructor
5. Constructor Overloading

Author: Nitish
==========================================
*/

// =========================================
// Program 1 - Introduction to Constructor
// =========================================
class Student {
    Student() {
        System.out.println("Constructor is called.");
    }
}

// =========================================
// Program 2 - Default Constructor
// =========================================
class Teacher {
    // Java automatically provides a Default Constructor
}

// =========================================
// Program 3 - No-Argument Constructor
// =========================================
class StudentDetails {
    String name;
    int age;
    String course;

    StudentDetails() {
        name = "Nitish";
        age = 20;
        course = "CSE-AI&ML";
    }

    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
    }
}

// =========================================
// Program 4 - Parameterized Constructor
// =========================================
class Students {
    String name;
    int age;
    String course;

    Students(String studentName, int studentAge, String studentCourse) {
        name = studentName;
        age = studentAge;
        course = studentCourse;
    }

    void studentsDisplay() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
    }
}

// =========================================
// Program 5 - Constructor Overloading
// =========================================
class Employee {
    String name;
    int age;
    String department;

    // Constructor 1
    Employee() {
        name = "Unknown";
        age = 18;
        department = "Unknown";
    }

    // Constructor 2
    Employee(String employeeName) {
        name = employeeName;
        age = 18;
        department = "Unknown";
    }

    // Constructor 3
    Employee(String employeeName, String employeeDepartment) {
        name = employeeName;
        age = 18;
        department = employeeDepartment;
    }

    // Constructor 4
    Employee(String employeeName, int employeeAge, String employeeDepartment) {
        name = employeeName;
        age = employeeAge;
        department = employeeDepartment;
    }

    void displayName() {
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Department : " + department);
    }
}

// =========================================
// Program 6 - Car 
// =========================================
class Car {
    String brand;
    
    Car() {
        brand = "Toyota";
        System.out.println("Constructor has been deployed.");
    }

    void displayer() {
        System.out.println("Brand: " + brand);
    }
}

// =========================================
// Program 7 - Space
// =========================================
class Space {
    String blackholes;
    String rocks;
    int numbers;
    
    Space(String blackholes, String rocks, int numbers) {
        this.blackholes = blackholes;
        this.rocks = rocks;
        this.numbers = numbers;
    }
    
    void displayz() {
        System.out.println("Blockholes: " + blackholes);
        System.out.println("Rocks: " + rocks);
        System.out.println("Numbers: " + numbers);
    }
}

// =========================================
// Program 8 - Player
// =========================================
class Player {
    String name;
    String country;
 
    Player() {
        name = "Unknown";
        country = "Unknown";
        System.out.println("Default constructor");
    }
    
    Player(String name) {
        this(); // Must be the first line
        this.name = name;
        System.out.println("One-parameter");
    }
    
    Player(String name, String country) {
        this.name = name;
        this.country = country;
        System.out.println("Two-parameter");
    }

    void displayq() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
    }
}

// =========================================
// Program 9 - Singer
// =========================================
class Singer {
    String name;
    String song;
    int age;

    Singer() {
        this("unknown", "unknown", 0);
        System.out.println("Default constructor");
    }
    
    Singer(String name) {
        this(name, "unknown", 0);
    }
    
    Singer(String name, String song) {
        this(name, song, 0);
    }
    
    Singer(String name, String song, int age) {
        this.name = name;
        this.song = song;
        this.age = age;
    }
    
    void displayDets() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("Song : " + song);
    }
}

// =========================================
// Program 10 - StudentRecord
// =========================================
class StudentRecord {
    String name;
    int age;
    int attendence;
    
    StudentRecord() {
        this("Unknown");
        System.out.println("Default constructor");
    }
    
    StudentRecord(String name) {
        this(name, 19);
        System.out.println("One parameter constructor");
    }
    
    StudentRecord(String name, int age) {
        this(name, age, 0);
        System.out.println("Two parameter constructor");
    }
    
    StudentRecord(String name, int age, int attendence) {
        this.name = name;
        this.age = age;
        this.attendence = attendence;
        System.out.println("Three parameter constructor");
    }
    
    void displayer() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Attendence: " + attendence);
    }
}

// =========================================
// Main Method
// =========================================
public class Main {
    public static void main(String[] args) {

        // =========================================
        // Program 1 - Introduction to Constructor
        // =========================================
        Student s1 = new Student();
        System.out.println();

        // =========================================
        // Program 2 - Default Constructor
        // =========================================
        Teacher t1 = new Teacher();
        System.out.println("Teacher object created successfully using the Default Constructor.");
        System.out.println();

        // =========================================
        // Program 3 - No-Argument Constructor
        // =========================================
        StudentDetails s2 = new StudentDetails();
        s2.display();
        System.out.println();

        // =========================================
        // Program 4 - Parameterized Constructor
        // =========================================
        Students s3 = new Students("Alice", 20, "Computer Science");
        Students s4 = new Students("Bob", 19, "Information Technology");
        s3.studentsDisplay();
        System.out.println();
        s4.studentsDisplay();
        System.out.println();

        // =========================================
        // Program 5 - Constructor Overloading
        // =========================================
        Employee e1 = new Employee();
        Employee e2 = new Employee("Charlie");
        Employee e3 = new Employee("David", "Human Resources");
        Employee e4 = new Employee("Emma", 25, "Finance");
        
        e1.displayName();
        System.out.println();
        e2.displayName();
        System.out.println();
        e3.displayName();
        System.out.println();
        e4.displayName();
        System.out.println();

        // =========================================
        // Program 6 
        // =========================================
        Car c1 = new Car();
        c1.displayer();
        System.out.println();

        // =========================================
        // Program 7 
        // =========================================
        Space q1 = new Space("yes", "Found", 1);
        q1.displayz();
        System.out.println();

        // =========================================
        // Program 8 
        // =========================================
        Player p1 = new Player();
        Player p2 = new Player("Nitish");
        Player p3 = new Player("Nitish", "India");

        p1.displayq();
        System.out.println();
        p2.displayq();
        System.out.println();
        p3.displayq();
        System.out.println();

        // =========================================
        // Program 9 
        // =========================================
        Singer w1 = new Singer();
        w1.displayDets();
        System.out.println();
        
        // Fixed: Parameter types must match (String, String, int)
        Singer w2 = new Singer("Nitish", "song", 19);
        w2.displayDets();
        System.out.println();

        // =========================================
        // Program 10
        // =========================================
        StudentRecord r1 = new StudentRecord();
        r1.displayer();
        System.out.println();
        
        StudentRecord r2 = new StudentRecord("Nitish");
        r2.displayer();
        System.out.println();
        
        StudentRecord r3 = new StudentRecord("Nitish", 18);
        r3.displayer();
        System.out.println();
        
        StudentRecord r4 = new StudentRecord("Nitish", 18, 75);
        r4.displayer();
    }
}

/*
==========================================
End of Day 16

Next Topic:
Encapsulation
==========================================
*/