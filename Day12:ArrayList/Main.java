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
// Program 2 - Take Inadd into an ArrayList
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
       

//p-3:
ArrayList<Integer>nums = new  ArrayList<>();
nums.add(10);
nums.add(20);
nums.add(30);
nums.add(40);
nums.add(50);

System.out.println("ArrayList:");
System.out.println(nums);
System.out.println("Elements at Index 0:"+nums.get(0));
System.out.println("Elements at Index 0:"+nums.get(2));
System.out.println("Elements at Index 0:"+nums.get(4));

//p-4:
ArrayList<String>names = new ArrayList<>();
names.add("Nitish");
names.add("rahul");
names.add("king");

System.out.println("ArrayList:");
System.out.println(names);

//updating the values
names.set(1,"premam");
System.out.println("Updated values:");
System.out.println(names);
System.out.println();
//p-5:
names.remove(1);
System.out.println("after removing the element at Index 1");
System.out.println(names);
//p-6:
int totalElements = names.size();
System.out.print("Total Elements:"+totalElements);
System.out.println();
//p-7:
System.out.print("Enter element to search:");
 String search = sc.next();

 if(names.contains(search)){
   System.out.println(search+" is present in the ArrayList");
 }else{
   System.out.println(search+" is not present in the ArrayList");
 }
 sc.close();
 //p-8:
 for(int i=0;i<names.size();i++){
   System.out.println(names.get(i));
 }
 //now using enchaned loop:
 for(String name:names){
   System.out.println(names);
 }
 //p-9:
  ArrayList<Integer>numz = new ArrayList<>();
  numz.add(10);
  numz.add(20);
  numz.add(30);
  numz.add(40);
  System.out.println("ArrayList:");
  System.out.println(numz);

  int largest = numz.get(0);
  for(int i=0;i<numz.size();i++){
   if(numz.get(i)>largest){
      largest= numz.get(i);
   }
  }
     System.out.print("largest:"+largest);
   System.out.println();
   //p-10:
  int sum = 0;
  for(int z=0;z<numz.size();z++){
    sum+=numz.get(z);
  }
  System.out.print("Sum of all elements:"+sum);
  System.out.println();
  
   } 
}
