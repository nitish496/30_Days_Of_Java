//p-1:
class Display{
    public void show(){
        System.out.println("I wil be back.");
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
    }
}

