//program-1:right star program
public class Main{
public static void main(String[] args) {
    


for(int row =1;row<=5;row++){
    for(int column = 1;column<=row;column++){
        System.out.print("*");
    }
    System.out.println();
}
    //program-2:inverted star triangle
    for(int i =5; i>=1;i--){
        for(int j =1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println();

    //program-3:Number triangle
    for(int q=1;q<=5;q++){
        for(int w=1;w<=q;w++){
            System.out.print(w+" ");
        }
        System.out.println();
    }

   
   

 } 
}