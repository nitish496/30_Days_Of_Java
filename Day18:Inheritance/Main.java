//p-1:
class Person1 {
    public void display() {
        System.out.println("Name: Nitish");
    }
}
class Student1 extends Person1 {

}
//p-2:
class CoursePerson {
    public void displayName() {
        System.out.println("Name: Nitish");
    }
}
class CourseStudent extends CoursePerson {
    public void displayCourse() {
        System.out.println("Course: CSE-AI&ML");
    }
}
//p-3:
class SchoolPerson {
    public void displayName() {
        System.out.println("Name: Nitish");
    }
}
class SchoolStudent extends SchoolPerson {
    public void displayCourse() {
        System.out.println("Course: CSE-AI&ML");
    }
}
class CollegeStudent extends SchoolStudent {
    public void displayCollege() {
        System.out.println("College: ABC Engineering College");
    }
}
//p-4:
class Personq{
    public void displayName(){
        System.out.println("Name:Nitish");
    }
}
class Normalstudent extends Personq{
    public void displayCourse(){
        System.out.println("Course:CSE-AI&ML");
    }
}
class College extends Normalstudent{
    public void displayCollege(){
        System.out.println("XYZ-college");
    }
}
public class Main{
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.display();
        System.out.println();
        CourseStudent s2 = new CourseStudent();
        s2.displayCourse();
        s2.displayName();
        System.out.println();
        CollegeStudent s3 = new CollegeStudent();
        s3.displayCourse();
        s3.displayName();
        s3.displayCollege();
        System.out.println();
        College s4 = new College();
        s4.displayCollege();
        s4.displayCourse();
        s4.displayName();
        System.out.println();
        pet p1 = new pet();
        p1.display();
        p1.sound();
        System.out.println();
        Dog dog = new Dog();
        dog.sound();
        child c1 = new child();
        c1.displaychild();
        c1.displayParent();
        System.out.println();
        System.out.println("Types of Inheritance in Java:");
        System.out.println("1. Single Inheritance       - Supported");
        System.out.println("2. Multilevel Inheritance   - Supported");
        System.out.println("3. Hierarchical Inheritance - Supported");
        System.out.println("4. Multiple Inheritance     - Not Supported (Using Classes)");
        System.out.println("5. Hybrid Inheritance      - Not Supported (Using Classes)");
        System.out.println();
        System.out.println();

DogAnimal dogAnimal = new DogAnimal();

dogAnimal.setDetails("Tommy", 4);

dogAnimal.displayDetails();
dogAnimal.sound();

System.out.println();

CatAnimal cat = new CatAnimal();

cat.setDetails("Kitty", 2);

cat.displayDetails();
cat.sound();

System.out.println();

Car car = new Car();

car.setDetails("Toyota", "Fortuner");
car.setDoors(4);

car.displayDetails();
car.displayCar();

System.out.println();

Bike bike = new Bike();

bike.setDetails("Royal Enfield", "Classic 350");
bike.setEngineType("Single Cylinder");

bike.displayDetails();
bike.displayBike();

System.out.println();

Manager manager = new Manager();

manager.setEmployeeDetails(101, "Alice");
manager.setDepartment("Information Technology");

manager.displayEmployeeDetails();
manager.displayManagerDetails();

    }
}
