// =========================================
// Program 1 - Creating Your First Class
// =========================================

class Student {

    
    String name;
    int age;
    String course;

    // Method
    void study() {
        System.out.println(name+" is studying Java.");
    }
    void display(){
       
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
        System.out.println("--------------------------");
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("Student class created successfully.");

        //p-2 creating an object
        Student student1 = new Student();
        student1.name="Raju";
        student1.age=23;
        student1.course="CSE-CORE";

        //p-3:creating different objects at a time
         Student student2 = new Student();
        student2.name="Aman";
        student2.age=18;
        student2.course="CSE-AI-ML";
        
        Student student3 = new Student();
        student3.name="daniel";
        student3.age=19;
        student3.course="CSE-BLOCKCHAIN";
       System.out.println("Student 1 Details");
        System.out.println("Name   : " + student1.name);
        System.out.println("Age    : " + student1.age);
        System.out.println("Course : " + student1.course);
        student1.study();
        System.out.println();

        System.out.println("Student 2 Details");
        System.out.println("Name   : " + student2.name);
        System.out.println("Age    : " + student2.age);
        System.out.println("Course : " + student2.course);
        student2.study();
        System.out.println();

        System.out.println("Student 3 Details");
        System.out.println("Name   : " + student3.name);
        System.out.println("Age    : " + student3.age);
        System.out.println("Course : " + student3.course);
        student3.study();
        System.out.println();

        //p-4:calling methods:
        System.out.println("NOW WE ARE CALLING METHODS:");
         System.out.println("Student 1 Details:");
           student1.display();
            System.out.println("Student 2  Details:");
           student2.display();
            System.out.println("Student 3 Details:");
           student3.display();
           //p-5
         System.out.println("Reference Variable : student1");
          System.out.println("Reference Variable : student2");
           System.out.println("Reference Variable : student3");
           System.out.println();


    }
}