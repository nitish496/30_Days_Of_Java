/*
==========================================
        DAY 08 - ARRAYS
==========================================

Program 1 - Create and Print an Array

Author: Nitish
==========================================
*/

public class Main {

    public static void main(String[] args) {

        // =========================================
        // Program 1 - Create and Print an Array
        // =========================================

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First Element  : " + numbers[0]);
        System.out.println("Second Element : " + numbers[1]);
        System.out.println("Third Element  : " + numbers[2]);
        System.out.println("Fourth Element : " + numbers[3]);
        System.out.println("Fifth Element  : " + numbers[4]);
        System.out.println();
       //program-2:
       int [] arr= {10,20,30,40,50};
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
       System.out.println();
       //program-3:
       int []arri = {10,20,30,40,50};
       int sum =0;
       for(int j=0;j<arri.length;j++){
        sum +=arri[j];
       }
       System.out.println("Sum:"+sum);
       System.out.println();
          //program-4:
       int summ =0;
      int arrn[]={10,20,30,40,50};
      for(int k=0;k<arr.length;k++){
        summ +=arr[k];
      }
      double avg = (double) summ /arrn.length;
      System.out.println("Average:"+avg);
      System.out.println();

   
    }
}

/*
==========================================
End of Program 1

Next Program:
Take Array Input from User

==========================================
*/