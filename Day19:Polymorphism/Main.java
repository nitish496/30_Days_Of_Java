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

