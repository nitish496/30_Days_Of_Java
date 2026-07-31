//p-1:
public class Main{
    public static void main(String[] args) {
        try{
            int result = 10/0;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Cannot be divisble by zero.");
        }finally{
            System.out.println("Program ended.");
        }
    }
}