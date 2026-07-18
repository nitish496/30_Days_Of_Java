import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Hello");
        }
        System.out.println();
        //program-2
        int i=1;
        while(i<=5){
            System.out.println("Hello");
            i++;
        }
        System.out.println();
        //program-3

        int number = 1;
        do{
            System.out.println("Hello");
            number++;
        }while(number<=5);
       System.out.println();

       //program-4:
       for(int even=2;even<=10;even+=2){
        System.out.println(even);
       }
       System.out.println();
     //program-5:
     System.out.println("Enter the number to multiply:");
      int num = sc.nextInt();
      for(int z=0;z<=10;z++){
        System.out.println(num+"*"+z+" = "+ (num * z));
      }
      System.out.println();
      //program-6:Break
      for(int q=1;q<=10;q++){
        if(q==6){
            break;
        }
        System.out.println(q);
      }
      System.out.println();
      
    }

}

