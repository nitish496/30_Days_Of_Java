interface Switchable{
    void turnOn();
}

class Laptop implements Switchable{
    @Override
    public void turnOn(){
        System.out.println("Your laptop turns on.");
    }
}

public class Main{
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.turnOn();
    }
}