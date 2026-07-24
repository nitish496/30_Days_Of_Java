/*
==========================================
        DAY 15 - CLASSES & OBJECTS
==========================================

Topics Covered:
1. Creating Your First Class
2. Creating Objects
3. Creating Multiple Objects
4. Accessing Fields & Calling Methods
5. Understanding Object References
6. Stack & Heap Memory

Author: Nitish
==========================================
*/

class Student {

    // Instance Variables (Fields)
    String name;
    int age;
    String course;

    // Method
    void study() {
        System.out.println(name + " is studying Java.");
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
        System.out.println("--------------------------------");
    }
}

public class Main {

    public static void main(String[] args) {

        // =========================================
        // Program 1 - Creating Your First Class
        // =========================================

        System.out.println("========== DAY 15 - CLASSES & OBJECTS ==========\n");
        System.out.println("Student class created successfully.\n");

        // =========================================
        // Program 2 - Creating Objects
        // =========================================

        Student student1 = new Student();

        student1.name = "Raju";
        student1.age = 23;
        student1.course = "CSE-Core";

        // =========================================
        // Program 3 - Creating Multiple Objects
        // =========================================

        Student student2 = new Student();

        student2.name = "Aman";
        student2.age = 18;
        student2.course = "CSE-AI-ML";

        Student student3 = new Student();

        student3.name = "Daniel";
        student3.age = 19;
        student3.course = "CSE-Blockchain";

        // =========================================
        // Program 4 - Accessing Fields & Calling Methods
        // =========================================

        System.out.println("Student 1 Details");
        student1.displayDetails();
        student1.study();

        System.out.println();

        System.out.println("Student 2 Details");
        student2.displayDetails();
        student2.study();

        System.out.println();

        System.out.println("Student 3 Details");
        student3.displayDetails();
        student3.study();

        // =========================================
        // Program 5 - Understanding Object References
        // =========================================

        System.out.println("\n========== OBJECT REFERENCES ==========");
        System.out.println("student1 -> Refers to the first Student object.");
        System.out.println("student2 -> Refers to the second Student object.");
        System.out.println("student3 -> Refers to the third Student object.");

        // =========================================
        // Program 6 - Understanding Stack & Heap Memory
        // =========================================

        System.out.println("\n========== STACK & HEAP MEMORY ==========");
        System.out.println("Reference variables are stored in Stack Memory.");
        System.out.println("Objects are stored in Heap Memory.");

        // =========================================
        // Program 7 - Student Management System
        // =========================================

        System.out.println("\n========== MINI PROJECT ==========");
        System.out.println("Program 7 : Student Management System");
        System.out.println("-> Implemented in MiniProject.java");

        // =========================================
        // Program 8 - Comprehensive Practice
        // =========================================

        System.out.println("\nProgram 8 : Comprehensive Classes & Objects Practice");
        System.out.println("-> Implemented in MiniProject2.java");

        System.out.println("\n========== DAY 15 COMPLETED ==========");
        System.out.println("Next Topic : Constructors");
    }
}

/*
==========================================
End of Day 15

Next Topic:
Constructors

==========================================
*/