// =========================================
// Program 1 - Introduction to OOP
// =========================================

public class Main {

    public static void main(String[] args) {

        System.out.println("===== Object-Oriented Programming (OOP) =====");

        System.out.println("OOP is a programming paradigm that organizes programs using objects.");
        System.out.println();

        System.out.println("Advantages of OOP:");
        System.out.println("1. Code Reusability");
        System.out.println("2. Better Organization");
        System.out.println("3. Easy Maintenance");
        System.out.println("4. Security");
        System.out.println("5. Scalability");

        System.out.println();

        System.out.println("Java uses OOP concepts like:");
        System.out.println("- Classes");
        System.out.println("- Objects");
        System.out.println("- Encapsulation");
        System.out.println("- Inheritance");
        System.out.println("- Polymorphism");
        System.out.println("- Abstraction");
        //p-2:
         System.out.println("===== Objects in Real Life =====\n");

        // Example 1: Car
        System.out.println("Object: Car");
        System.out.println("State:");
        System.out.println("- Brand : BMW");
        System.out.println("- Color : Black");
        System.out.println("- Speed : 120 km/h");

        System.out.println("\nBehavior:");
        System.out.println("- Start()");
        System.out.println("- Accelerate()");
        System.out.println("- Brake()");
        System.out.println("- Stop()");

        System.out.println("\nIdentity:");
        System.out.println("- Registration Number: MH12AB1234");

        System.out.println("\n----------------------------------\n");

        // Example 2: Student
        System.out.println("Object: Student");
        System.out.println("State:");
        System.out.println("- Name : Nitish");
        System.out.println("- Age  : 20");
        System.out.println("- Course : B.Tech");

        System.out.println("\nBehavior:");
        System.out.println("- Study()");
        System.out.println("- AttendClass()");
        System.out.println("- WriteExam()");

        System.out.println("\nIdentity:");
        System.out.println("- Roll Number: 101");

        System.out.println("\n==================================");
        System.out.println("Every object has:");
        System.out.println("1. State (Data)");
        System.out.println("2. Behavior (Actions)");
        System.out.println("3. Identity (Unique Identification)");

          //p-3:
        System.out.println("===== What is a Class? =====\n");

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
        //example:
        class Student{
            String name;
            int age;
            String course;
            void study(){
                System.out.println("Student is studing...");
            }
            
        }

    }
}