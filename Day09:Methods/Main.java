//program-1:
public class Main{
    public static void printHello(){
        System.out.println("Hello,Java");
    }
    //program-2:
    public static void printMessage(){
        System.out.println("Welcome to java");
    }

    //program-3:
    public static void greet(String name){
        System.out.println("Hello, "+name+" !");
    }
    //program-4:
    public static void addNumbers(int num1,int num2){
        System.out.println(num1+num2);
    }
    //program-5:
    public static void squareNum(int num3){
        System.out.println(num3*num3);
    }
    //program-6:
    public static void MaxNum(int num4,int num5){
        if(num4>num5){
            System.out.println("Maximum number is :"+num4);
        }else if (num5>num4){
            System.out.println("Maximum number is:"+num5);
        }else{
            System.out.println("Both are equal");
        }
    }
    //program-7:
    public static void EvenOdd(int num6){
        if(num6%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }

        public static void main(String[] args) {
        printHello();
        System.out.println();
        printMessage();
        printMessage();
        printMessage();
        printMessage();
        printMessage();
        System.out.println();
        greet("nitish");
        greet("ram");
        greet("king");
        System.out.println();
        addNumbers(20,30);
        addNumbers(50, 60);
        System.out.println();
        squareNum(5);
        System.out.println();
        MaxNum(10, 20);
        MaxNum(10,10);
        System.out.println();
        EvenOdd(10);
        System.out.println();
        int result1 = addNum(10, 20);
        System.out.println("Sum = "+result1);
        System.out.println();
        int result = findfactorial(5);
        System.out.println("result:"+result);
    }
}