// =========================================
// Program 1 - Creating Your First Class
// =========================================

class Student {

    
    String name;
    int age;
    String course;

    // Method
    void study() {
        System.out.println("Student is studying Java.");
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("Student class created successfully.");

        Student student1 = new Student();
        student1.name="Raju";
        student1.age=23;
        student1.course="CSE-CORE";

       System.out.println("Student Details");
        System.out.println("Name   : " + student1.name);
        System.out.println("Age    : " + student1.age);
        System.out.println("Course : " + student1.course);
        student1.study();


    }
}