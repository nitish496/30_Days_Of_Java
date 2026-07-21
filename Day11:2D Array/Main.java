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
     
    }
}
