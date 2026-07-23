
/*
==========================================
        DAY 14 - OOP BASICS
==========================================

Topics Covered:
1. Class
2. Object
3. Fields
4. Methods
5. Creating Objects
6. Assigning Values
7. Calling Methods

Author: Nitish
==========================================
*/

public class Main {

    public static void main(String[] args) {

        // =========================================
        // Program 1 - Introduction to Object-Oriented Programming (OOP)
        // =========================================
        System.out.println("===== Program 1: Introduction to OOP =====");
        System.out.println("OOP is a programming paradigm that organizes programs using objects.\n");
        System.out.println("Advantages of OOP:");
        System.out.println("1. Code Reusability");
        System.out.println("2. Better Organization");
        System.out.println("3. Easy Maintenance");
        System.out.println("4. Security");
        System.out.println("5. Scalability\n");
        System.out.println("Java uses OOP concepts like:");
        System.out.println("- Classes");
        System.out.println("- Objects");
        System.out.println("- Encapsulation");
        System.out.println("- Inheritance");
        System.out.println("- Polymorphism");
        System.out.println("- Abstraction");


        // =========================================
        // Program 2 - Understanding Objects
        // =========================================
        System.out.println("\n===== Program 2: Understanding Objects =====");
        
        // Example 1: Car
        System.out.println("Object: Car");
        System.out.println("State:");
        System.out.println("- Brand : BMW");
        System.out.println("- Color : Black");
        System.out.println("- Speed : 120 km/h");
        System.out.println("Behavior:");
        System.out.println("- Start()");
        System.out.println("- Accelerate()");
        System.out.println("- Brake()");
        System.out.println("- Stop()");
        System.out.println("Identity:");
        System.out.println("- Registration Number: MH12AB1234");
        System.out.println("----------------------------------");
        
        // Example 2: Student
        System.out.println("Object: Student");
        System.out.println("State:");
        System.out.println("- Name : Nitish");
        System.out.println("- Age  : 20");
        System.out.println("- Course : B.Tech");
        System.out.println("Behavior:");
        System.out.println("- Study()");
        System.out.println("- AttendClass()");
        System.out.println("- WriteExam()");
        System.out.println("Identity:");
        System.out.println("- Roll Number: 101");
        System.out.println("==================================");
        
        System.out.println("Every object has:");
        System.out.println("1. State (Data)");
        System.out.println("2. Behavior (Actions)");
        System.out.println("3. Identity (Unique Identification)");


        // =========================================
        // Program 3 - Understanding Classes
        // =========================================
        System.out.println("\n===== Program 3: Understanding Classes =====");
        System.out.println("A Class is a blueprint or template used to create objects.\n");
        System.out.println("Example: Student Class");
        System.out.println("State (Fields):");
        System.out.println("- Name");
        System.out.println("- Age");
        System.out.println("- Course");
        System.out.println("\nBehavior (Methods):");
        System.out.println("- Study()");
        System.out.println("- AttendClass()");
        System.out.println("- WriteExam()");
        System.out.println("\nNote:");
        System.out.println("Creating a class does NOT create an object.");
        System.out.println("Objects will be created from classes in the next lesson (Day 15).");


        // =========================================
        // Program 4 - Class vs Object
        // =========================================
        System.out.println("\n===== Program 4: Class vs Object =====");
        System.out.println("Class : Blueprint used to create objects.");
        System.out.println("Object: A real instance created from the class.\n");

        Student s1 = new Student();
        System.out.println("Student Details:");
        s1.name = "Nitish";
        s1.age = 19;
        s1.course = "B.Tech";
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        s1.study();


        // =========================================
        // Program 5 - The Four Pillars of OOP
        // =========================================
        System.out.println("\n===== Program 5: The Four Pillars of OOP =====");
        System.out.println("1. Encapsulation");
        System.out.println("   -> Wrapping data and methods together.");
        System.out.println("   -> Example: ATM Machine\n");
        System.out.println("2. Inheritance");
        System.out.println("   -> One class acquires properties of another.");
        System.out.println("   -> Example: Child inherits from Parents\n");
        System.out.println("3. Polymorphism");
        System.out.println("   -> One method, many forms.");
        System.out.println("   -> Example: Same person, different roles\n");
        System.out.println("4. Abstraction");
        System.out.println("   -> Hiding implementation details.");
        System.out.println("   -> Example: Driving a Car\n");
        System.out.println("These concepts will be covered in detail in upcoming days.");


        // =========================================
        // Program 6 - Benefits of Object-Oriented Programming
        // =========================================
        System.out.println("\n===== Program 6: Benefits of OOP =====");
        System.out.println("1. Code Reusability");
        System.out.println("2. Better Code Organization");
        System.out.println("3. Easy Maintenance");
        System.out.println("4. Improved Security");
        System.out.println("5. Scalability");
        System.out.println("6. Real-World Modeling\n");

        // Renamed to studentA and studentB to prevent conflicts with Program 9
        Student studentA = new Student();
        Student studentB = new Student();

        studentA.name = "Nitish";
        studentB.name = "Rahul";

        System.out.println("Student A: " + studentA.name);
        System.out.println("Student B: " + studentB.name);
        System.out.println("\nBoth objects are created from the same Student class.");
        System.out.println("This demonstrates code reusability.");


        // =========================================
        // Program 7 - Popular Object-Oriented Programming Languages
        // =========================================
        System.out.println("\n===== Program 7: Popular OOP Languages =====");
        System.out.println("1. Java");
        System.out.println("   - Android Apps, Banking Systems, Enterprise Applications\n");
        System.out.println("2. C++");
        System.out.println("   - Game Development, Operating Systems\n");
        System.out.println("3. Python");
        System.out.println("   - Artificial Intelligence, Machine Learning, Automation\n");
        System.out.println("4. C#");
        System.out.println("   - Windows Applications, Unity Game Development\n");
        System.out.println("5. Kotlin");
        System.out.println("   - Android Development, Backend Development\n");
        System.out.println("Java is one of the most popular and beginner-friendly OOP languages.");


        // =========================================
        // Program 8 - Complete OOP Flow 
        // =========================================
        System.out.println("\n===== Program 8: Complete OOP Flow =====");
        
        // Step 1: Create an object 
        Student studentFlow = new Student();

        // Step 2: Store data
        studentFlow.name = "Nitish";
        studentFlow.age = 19;
        studentFlow.course = "CSE-AI&ML";

        // Step 3: Display data
        studentFlow.displayDetails(); // Calling the method you added in P-9!

        // Step 4: Call method
        studentFlow.study();


        // =========================================
        // Program 9 - Comprehensive OOP Practice
        // =========================================
        System.out.println("\n========== Program 9: OOP Basics Practice ==========\n");

        // Creating Objects (Renamed to p9Student1 and p9Student2 to prevent conflicts)
        Student p9Student1 = new Student();
        Student p9Student2 = new Student();

        // Assigning values to Student 1
        p9Student1.name = "Alice";
        p9Student1.age = 20;
        p9Student1.course = "Computer Science";

        // Assigning values to Student 2
        p9Student2.name = "Bob";
        p9Student2.age = 21;
        p9Student2.course = "Mathematics";

        // Display Student 1 Details
        System.out.println("Student 1");
        System.out.println("----------------------------");
        p9Student1.displayDetails();
        p9Student1.study();

        System.out.println();

        // Display Student 2 Details
        System.out.println("Student 2");
        System.out.println("----------------------------");
        p9Student2.displayDetails();
        p9Student2.study();

        System.out.println("\n========================================");
        System.out.println("Class → Object → Data → Methods → Output");
    }
}

// =========================================
// Student Class Blueprint
// =========================================
class Student {
    // State (Attributes)
    String name;
    int age;
    String course;

    // Behavior (Methods)
    void displayDetails() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
    }

    void study() {
        System.out.println(name + " is studying Java.");
    }
}

/*
==========================================
End of Day 14

Next Topic:
Day 15 - Classes & Objects
==========================================
*/
```