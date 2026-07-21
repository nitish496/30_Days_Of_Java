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
     //p-5:
     int[][]n={{10,20,30},{40,50,60},{70,80,90}};
     int largest = n[0][0];
     for(int a =0;a<n.length;a++){
        for(int s =0;s<n[a].length;s++){
           if(n[a][s]>largest){
            largest=n[a][s];
           }
        }
     }
     System.out.println("Largest:"+largest);
     //p-6:
  int[][]array = {{10,20,30},{40,50,60},{70,80,90}};
   int smallest = array[0][0];
   for(int z=0;z<array.length;z++){
    for(int x=0;x<array[z].length;x++){
        if(array[z][x]<smallest){
            smallest=array[z][x];
        }
    }
   }
   System.out.println("Smallest:"+smallest);
   //p-7:
  
int[][] numz = {
        {10,20,30},
        {40,50,60},
        {70,80,90}
};

System.out.print("Enter the element to search: ");
int key = sc.nextInt();

boolean found = false;

for (int e = 0; e < numz.length; e++) {

    for (int r = 0; r < numz[e].length; r++) {

        if (numz[e][r] == key) {
            found = true;
            break;
        }
    }

    if (found) {
        break;
    }
}

if (found) {
    System.out.println("Element has been found.");
} else {
    System.out.println("Element has not been found.");
}
//p-8:
int [][] m1 = {{1,2,3},{4,5,6}};
int [][] m2 = {{7,8,9},{10,11,12}};
int[][] result = new int[2][3];

for(int o =0;o<m1.length;o++){
    for(int p=0;p<m1[o].length;p++){
        result[o][p]=m1[o][p]+m2[o][p];
    }
}
System.out.println("sum of two matrices:");
for(int o=0;o<result.length;o++){
    for(int p=0;p<result[o].length;p++){
        System.out.print(result[o][p]+" ");
    }
    System.out.println();
}
//p-9:
int [][]m = {{1,2,3},{4,5,6}};
int[][]transpose = new int [3][2];
for(int y=0;y<m.length;y++){
    for(int u=0;u<m[y].length;u++){
        transpose[u][y]=m[y][u];
    }
}
System.out.println("Original matrix:");
for(int y=0;y<m.length;y++){
    for(int u =0;u<m[y].length;u++){
        System.out.print(m[y][u]+" ");
    }
    System.out.println();
}
System.out.println("Transpose martrix:");
for(int y=0;y<transpose.length;y++){
    for(int u=0;u<transpose[y].length;u++){
        System.out.print(transpose[y][u]+" ");
    }
    System.out.println();
}
    }
}
