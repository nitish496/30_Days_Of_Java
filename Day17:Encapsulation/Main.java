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
       

    }
}

