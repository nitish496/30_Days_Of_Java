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
   
    }
}

