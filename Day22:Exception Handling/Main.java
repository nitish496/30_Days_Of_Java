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
 
 public static void main(String[]args){
    program1();
    program2();
 }
}