interface Switchable{
    void turnOn();
}

class Laptop implements Switchable{
    @Override
    public void turnOn(){
        System.out.println("Your laptop turns on.");
    }
}

interface Switchable2{
    void turnOn();
    void turnOff();

}
//p-2:
class Telvision implements Switchable2{
    @Override
    public void turnOn(){
        System.out.println("tv has been turned on.");
    }
    @Override
    public void turnOff(){
        System.out.println("tv has been turned off.");
    }
}
//p-3:
interface Switchable3{
    void turnOn();
    void turnOff();
}
class Laptop2 implements Switchable3{
    @Override
    public void turnOn(){
        System.out.println("Laptop has been turned on.");
    }
    @Override
    public void turnOff(){
        System.out.println("Laptop has been turned off.");
    }
}
class Television2 implements Switchable3{
    @Override
    public void turnOn(){
        System.out.println("tv has been turned on.");
    }
    @Override
    public void turnOff(){
        System.out.println("tv has been turned off.");
    }
}
//p-4:
interface Camera{
    void Photo();
}
interface call{
    void Calling();
}
class Smartphone implements Camera,call{
    @Override
    public void Photo(){
        System.out.println("photo has been taken and stored in phone");
    }
    @Override
    public void Calling(){
        System.out.println("your phone is caling someone. ");
    }
}
public class Main{
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.turnOn();
        System.out.println();
        Telvision t1 = new Telvision();
        t1.turnOn();
        t1.turnOff();
        System.out.println();
        Laptop2 l2 = new Laptop2();
        l2.turnOn();
        l2.turnOff();
        Television2 t2 = new Television2();
      t2.turnOn();
      t2.turnOff();
        System.out.println();
        Smartphone p1 = new Smartphone();
        p1.Photo();
        p1.Calling();
    }
}