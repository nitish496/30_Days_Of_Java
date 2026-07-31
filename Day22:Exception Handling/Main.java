//p-1:
public class Main{
    static void program1(){
        System.out.println("program-1");
        try{
            int result = 10/0;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Cannot be divisble by zero.");
        }finally{
            System.out.println("Program ended.");
        }
    }
    //p-2:
    static void program2(){
        System.out.println("Program-2");
        try{
            int[]arr={10,20,30};
            System.out.println(arr[5]);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception occurred"+e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds"+e.getMessage());
        }
    }
   //p-3:
   static void program3(){
    System.out.println("program-3:");
    try{
        int result1 = 10/0;
        System.out.println(result1);
    }catch(ArithmeticException e){
        System.out.println("Cannot be divisible by zero.");
    }finally{
        System.out.println("finally block executed.");
    }
    System.out.println("Program ended.");
   }
   //p-4:
static void program4(){
    System.out.println("Program-4:");
    int age =16;
    try{
        if(age<18){
            throw new ArithmeticException("Age must be 18 or above.");
        }else{
            System.out.println("you're eligible. ");
        }
    }catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }finally{
        System.out.println("Finally block has been executed.");
    }
    System.out.println("program has been ended.");
}
//p-5:
static void checkAge(int age) throws ArithmeticException{
    if(age<18){
        throw new ArithmeticException("Age must be 18 or above.");
    }
    System.out.println("You are eligible.");
}
//p-6:
static void ageCheck(int age) throws InvalidAgeException{
 if(age<18){
    throw new InvalidAgeException("Age must be above 18.");
 }
 System.out.println("you are eligible");
}
//p-7:
static void program7(){
    System.out.println("program-7");
    try{
        System.out.println("Outer try block.");
    try{
        int[]arr= {10,20,30};
        System.out.println(arr[6]);
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Inner catch array index is out of bounds.");
    }
    int result = 10/0;
    System.out.println(result);
   }catch(ArithmeticException e){
    System.out.println("Arithmetic exception cannot divide by zero.");
   }
   System.out.println("program ended.");

   
}
 public static void main(String[]args){
    program1();
    program2();
    program3();
    program4();
    //p-5:
    System.out.println("Program-5:");
    try{
        checkAge(19);
    }catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }
    System.out.println("Program ended.");
    //p-6:
    System.out.println("program-6:");
    try{
    ageCheck(16);
    }catch(InvalidAgeException e){
    System.out.println(e.getMessage());
    }
    System.out.println("Program ended.");
    program7();
 }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
