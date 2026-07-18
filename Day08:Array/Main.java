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
        //program-5
      int[]nums = {10,20,30,40,50};
      int max = nums[0];
      for(int f=0;f<nums.length;f++){
        if(nums[f]>max){
            max = nums[f];
        }
      }
      System.out.println("MAX:"+max);
      //program-6:
      int numz[]={10,20,30,40,50};
      int min = numz[0];
      for(int d=0;d<numz.length;d++){
      if(numz[d]<min){
        min=numz[d];
      }
      }System.out.println("Min:"+min);
   
      System.out.println();
     //program-7:linear search
      int numa[] = {10,20,30,40,50};
      boolean found = false;
      int target = 30;
      for(int w=0;w<numa.length;w++){
     if(numa[w]==target){
      System.out.println("Target has been found at index "+w);
      found = true;
      break;
     }
    }
    if(!found){
        System.out.println("Target has not been found");
    }
    }
}
/*
==========================================
End of Program 1

Next Program:
Take Array Input from User

==========================================
*/