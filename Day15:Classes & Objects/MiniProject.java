class Student{
    int studentId;
    String name;
    String course;
    int age;
    char grade;

    void display(){
        System.out.println("Name:"+name);
        System.out.println("Course:"+course);
        System.out.println("age:"+age);
        System.out.println("grade:"+grade);
         System.out.println("-------------------------\n");
    }
    void study(){
        System.out.println(name+" is studying java...");
    }
    void isPresent(){
        System.out.println(name+" is present in the class");
    }
    void showGrade(){
        System.out.println(name+"'s grade is:"+grade);
    }

}
public class MiniProject{
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.studentId = 101;
        student1.name = "Alice";
        student1.age = 20;
        student1.course = "Computer Science";
        student1.grade = 'A';


         Student student2 = new Student();
         student2.name = "Bob";
        student2.age = 21;
        student2.course = "Artificial Intelligence";
        student2.grade = 'B';

        System.out.println("========== STUDENT MANAGEMENT SYSTEM ==========\n");
        student1.display();
        student1.study();
        student1.isPresent();
        student1.showGrade();
       System.out.println();

        student2.display();
        student2.study();
        student2.isPresent();
        student2.showGrade();
        
    }
}