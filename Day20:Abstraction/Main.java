//p-1:
abstract class Animal{
    abstract void sound();

    
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks.");
    }

}

//p-2:
abstract class Animal2{
    void eat(){
        System.out.println("Animal's eat food.");

    }
    abstract void sound();

}
class Dog2 extends Animal2{
    @Override
    void sound(){
        System.out.println("Dog2 barks");
    }
}
//p-3:
abstract class vechile{
    abstract void start();
}
class car extends vechile{
    @Override
    void start(){
        System.out.println("The car starts working.");
    }
}
public class Main{
    public static void main(String[]args){
        Dog d1 = new Dog();
        d1.sound();
        Dog2 d2 = new Dog2();
        d2.eat();
        d2.sound();
        car c1 = new car();
        c1.start();
    }
}
