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

//p-6
class car{
    String brand;
    car(){
    brand = "Toyota";
    System.out.println("Constructor has been deployed.");
    }

    void displayer(){
        System.out.println("brand:"+brand);
    }
}
//p-7:
class space{
    String blackholes;
    String rocks;
    int numbers;
    space(String blackholes,String rocks,int numbers){
      this.blackholes = blackholes;
      this.rocks = rocks;
      this.numbers = numbers;
    }
    void displayz(){
                System.out.println("Blockholes:"+blackholes);
         System.out.println("Rocks:"+rocks);
          System.out.println("Numbers:"+numbers);
    }
}

// =========================================l
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

        car c1 = new car();
        c1.displayer();

        space q1 = new space("yes","Found",1);
       q1.displayz();
    }

}

/*
==========================================
End of Day 16

Next Topic:
Encapsulation

==========================================
*/