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
    }
}

