import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //p-1:
     int[][] numbers={{10,20,30},{40,50,60}};
     System.out.println("Elements of 2D array:");
     for(int r=0;r<numbers.length;r++){
        for(int c=0;c<numbers[r].length;c++){
            System.out.print(numbers[r][c]+" ");
        }
        System.out.println();
     }
     //p-2:
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter 6 elements:");
     int[][]num=new int[2][3];
     for(int row=0;row<num.length;row++){
        for(int column =0;column<num[row].length;column++){
            num[row][column]=sc.nextInt();
        }
     }
     System.out.println("Entered Matrix:");
     for(int row=0;row<num.length;row++){
        for(int column=0;column<num[row].length;column++){
            System.out.print(num[row][column]+" ");
        }
        System.out.println();
     }
     sc.close();
     //p-3:
     int[][]nums = {{10,20,30},{40,50,60},{70,80,90}};
     System.out.println("2D Array elements:");
     for(int ro=0;ro<nums.length;ro++){
        for(int co=0;co<nums[ro].length;co++){
            System.out.print(nums[ro][co]+" ");
        }
        System.out.println();
    }
        //p-4:
        int[][]nu={{10,20,30},{40,50,60},{70,80,90}};
        int sum =0;
        for(int w=0;w<nu.length;w++){
            for(int q=0;q<nu[w].length;q++){
                sum+=nu[w][q];
            }
        }
        System.out.println("Sum of all elements:"+sum);
     
    }
}
