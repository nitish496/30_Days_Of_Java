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

class Teach {

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
//p-5:
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
        System.out.println(-------------------);
    }
}
// =========================================
// Program 5 - Constructor Overloading
// =========================================

class Employee {

    String name;
    int age;
    String department;

    // Constructor 1 - No-Argument Constructor
    Employee() {

        name = "Unknown";
        age = 18;
        department = "Not Assigned";

    }

    // Constructor 2 - One Parameter
    Employee(String employeeName) {

        name = employeeName;
        age = 18;
        department = "Not Assigned";

    }

    // Constructor 3 - Three Parameters
    Employee(String employeeName, int employeeAge, String employeeDepartment) {

        name = employeeName;
        age = employeeAge;
        department = employeeDepartment;

    }

    void display() {

        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Department : " + department);

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