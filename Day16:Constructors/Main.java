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
class Students{
    String n;
    int a;
    String c;

    Students(String nz, int az,String cz){
        n = nz;
        a = az;
        c = cz;
    }
    void studentsDisplay(){
        System.out.println("Name:"+n);
        System.out.println("Age:"+a);
        System.out.println("Course:"+c);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        StudentDetails s2 = new StudentDetails();

        s2.display();

        Students s3 = new Students("Alice",20,"CSE");
        Students s4 = new Students("king", 20, "ECE");
         s3.studentsDisplay();
         s4.studentsDisplay();

    }

}