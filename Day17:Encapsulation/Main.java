//p-1
class student{
    private String name = "Nitish";
    public void display(){
        System.out.println("Name:"+name);
    }
}
//p-2:
class Students{
 private String name = "Nitish";
 private int age = 19;

 public void displa(){
    System.out.println("Name:"+name);
    System.out.println("age:"+age);
 }
}
//p-3:
class stud{
    private String name = "Raju";
    private int age = 19;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void Dsp(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("By using getter method");
    }
}  //p-4:

class stude{
    private int age;
    private String name;

    public void setName(String name){
       this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void disp(){
        System.out.println("Name"+name);
        System.out.println("Age:"+age);
    }
}

//p-5:
class studer{
    private int age;
    private String name;
    private String course;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setCourse(String course){
        this.course = course;
    }

    public String getName(){
        return name;
    }
    public int  getAge(){
        return age;
    }
    public String getCourse(){
        return course;
    }
}

//p-6:
class Stuer{
    private String name;
    private int age;
    private int marks;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age>=0){
            this.age = age;
        }else{
            System.out.println("Invaild");
        }
    }
    public void setMarks(int marks){
     if(marks>=0 && marks<=100){
            this.marks = marks;
        }else{
            System.out.println("Invaild Marks");
        }
    }
    public void disper(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("marks:"+marks);
    }
}

//p-7:

class qwerty{
    private String name;
    private int marks;
    private String job;

    public void setName(String name){
        this.name= name;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
    public void setJob(String job){
        this.job = job;
    }

    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    public String getJob(){
        return job;
    }
}

public class Main{
    public static void main(String[]args){
        student s1 = new student();
        s1.display();
        System.out.println();
        
        Students s2 = new Students();
        s2.displa();
        System.out.println();
     
        stud s3 = new stud();
        s3.Dsp();
        System.out.println();
        stude s4 = new stude();
         

        s4.setName("King");
        s4.setAge(20);
        s4.disp();
        System.out.println();
        studer s5 = new studer();

        s5.setName("Nitish");
        s5.setAge(20);
        s5.setCourse("CSE-AI&ML");

        System.out.println("Name   : " + s5.getName());
        System.out.println("Age    : " + s5.getAge());
        System.out.println("Course : " + s5.getCourse());
        System.out.println();

        Stuer s6 = new Stuer();
        s6.setName("Nitish");
        s6.setAge(19);
        s6.setMarks(89);
        s6.disper();

        System.out.println();
     qwerty s7 = new qwerty();
     s7.setName("nitish");
     s7.setMarks(98);
     s7.setJob("programmer");


     System.out.println("Name:" + s7.getName());
     System.out.println("Marks:" + s7.getMarks());
     System.out.println("Job:" + s7.getJob());
    }
}
