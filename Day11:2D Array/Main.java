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
 
     
    }
}
