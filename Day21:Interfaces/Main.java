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
public class Main{
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.turnOn();
        System.out.println();
        Telvision t1 = new Telvision();
        t1.turnOn();
        t1.turnOff();
    }
}