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
public class Main{
    public static void main(String[]args){
        Dog d1 = new Dog();
        d1.sound();
    }
}