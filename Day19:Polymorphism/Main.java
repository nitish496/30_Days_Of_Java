//p-1:
class Display{
    public void show(){
        System.out.println("I wil be back.");
    }
}

//p-2:
class Calculator{
    public void add(int a,int b){
        System.out.println("sum of a and b:"+(a+b));
    }
    public void add(int a , int b,int c){
        System.out.println("Sum of three numbers:"+(a+b+c));
    }
}
//p-3:
class Gamechanger{
    public void changer(int number){
        System.out.println("Integer Number:"+number);
    }
    public void changer(Double number){
        System.out.println("Double Number:"+number);
    }
    public void changer(String text){
        System.out.println("String number:"+text);
    }
}
//p-4:
class Multipler{
    public void multi(int a, int b){
        System.out.println("mutliplication between two numbers:"+(a*b));
    }
    public void multi(int a, int b,int c){
        System.out.println("mutliplication between two numbers:"+(a*b*c));
    }
    public void multi(int a, int b,int c ,int d){
        System.out.println("mutliplication between two numbers:"+(a*b*c*d));
    }
}
//p-5:
class Animal{
    public void sound(){
        System.out.println("Animal makes the sound");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }
}
//p-6:
class Cat extends Dog{
    @Override
    public void sound(){
        System.out.println("Cat meows.");
    }
}
//p-7:
class Animal2{
    public final void sounding(){
        System.out.println("Animal makes a sound.");
    }
}
class Dog2 extends Animal2{
    public void sounder(){
       System.out.println("Dog barks.");
    }
}
//p-8:
class Shape {

    public void calculateArea() {

        System.out.println("Area calculation depends on the shape.");

    }

}

class Circle extends Shape {

    double radius;

    Circle(double radius) {

        this.radius = radius;

    }

    @Override
    public void calculateArea() {

        double area = 3.14 * radius * radius;

        System.out.println("Area of Circle : " + area);

    }

}

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {

        this.length = length;
        this.width = width;

    }

    @Override
    public void calculateArea() {

        System.out.println("Area of Rectangle : " + (length * width));

    }

}

class Triangle extends Shape {

    double base;
    double height;

    Triangle(double base, double height) {

        this.base = base;
        this.height = height;

    }

    @Override
    public void calculateArea() {

        System.out.println("Area of Triangle : " + (0.5 * base * height));

    }

}
//p-9:
class Animal3 {
    public void soo(){
        System.out.println("Animal makes the sound");
    }
}
class Dog3 extends Animal3{
    @Override
    public void soo(){
        System.out.println("Dog barks.");
    }
}
class Cat3 extends Dog3{
    @Override
    public void soo(){
        System.out.println("Cat meows.");
    }
}
class Cow3 extends Cat3{
    @Override
    public void soo(){
        System.out.println("cow moos.");
    }
}
public class Main{
    public static void main(String[] args) {
        Display d1 = new Display();
        d1.show();
       //p-2:
        Calculator c1 = new Calculator();
        c1.add(10,20);
        Calculator c2 = new Calculator();
        c2.add(10,20,30);
        //p-3:
        Gamechanger g1 = new Gamechanger();
        System.out.println();
        g1.changer(19);
        g1.changer(19.0);
        g1.changer("kick");
        //p-4:
        Multipler m1 = new Multipler();
        m1.multi(10, 20);
        m1.multi(10, 20, 30);
        m1.multi(10, 20, 30, 40);
        System.out.println();
        Animal a1 = new Animal();
        a1.sound();

        Dog dog1 =  new Dog();
        dog1.sound();
        //p-6:
        Cat cat1 = new Cat();
        cat1.sound();
        //p-7:
        System.out.println();
        Animal2 Animal2 = new Animal2();
        Animal2.sounding();
        Dog2 Dog2 =new Dog2();
        Dog2.sounder(); 
        System.out.println();

      Shape shape;

         shape = new Circle(7);
         shape.calculateArea();

          shape = new Rectangle(10, 5);
         shape.calculateArea();

          shape = new Triangle(8, 6);
        shape.calculateArea();

        Animal3 Animal3 = new Animal3();
        Animal3.soo();
        Dog3 Dog3 = new Dog3();
        Dog3.soo();
        Cat3 Cat3 = new Cat3();
        Cat3.soo();
        Cow3 Cow3 = new Cow3();
        Cow3.soo()

    }
}

