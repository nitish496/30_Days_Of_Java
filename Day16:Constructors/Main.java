// =========================================
// Program 1 - Introduction to Constructor
// =========================================

class Student {

    Student() {
        System.out.println("Constructor is called.");
    }

}

// =========================================
// Program 2 - No-Argument Constructor
// =========================================

class Teacher {

    // Java automatically provides a Default Constructor

}
//p-3:
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

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        StudentDetails s2 = new StudentDetails();

        s2.display();

    }

}