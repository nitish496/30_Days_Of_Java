import java.util.Scanner;
import java.util.ArrayList;
public class Main {
   public static void main(String[] args) {
    //p-1:
    ArrayList<Integer>numbers= new ArrayList<>();
    numbers.add(10);
     numbers.add(20);
      numbers.add(30);
       numbers.add(40);

       System.out.print("ArrayList Elements:");
       System.out.println(numbers);

// =========================================
// Program 2 - Take Input into an ArrayList
// =========================================

Scanner sc = new Scanner(System.in);

ArrayList<Integer> num = new ArrayList<>();

System.out.print("How many elements do you want to enter?: ");
int size = sc.nextInt();

System.out.println("Enter the values:");

for (int i = 0; i < size; i++) {

    int number = sc.nextInt();

    num.add(number);

}

System.out.println("ArrayList:");
System.out.println(num);
       sc.close();


   } 
}
