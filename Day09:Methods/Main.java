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
        }else{
            System.out.println("Maximum number is:"+num5);
        }
    }
    //program-7:
    
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
        System.out.println();
    }
}