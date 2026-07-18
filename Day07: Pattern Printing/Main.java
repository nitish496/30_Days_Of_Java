//program-1:right star program
public class Main{
public static void main(String[] args) {
    


for(int row =1;row<=5;row++){
    for(int column = 1;column<=row;column++){
        System.out.print("*");
    }
    System.out.println();
}
  System.out.println();
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
    System.out.println();

    //program-4:Inverted number triangle
     for(int z=5;z>=1;z--){
        for(int x =1;x<=z;x++){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    System.out.println();

    //program-5:repeated number pattern
    for(int m=1;m<=5;m++){
        for(int n=1;n<=m;n++){
            System.out.print(m+" ");
        }
        System.out.println();
    }
    System.out.println();
    //program-6:
    int num=1;
    for(int v=1;v<=5;v++){
        for(int b=1;b<=v;b++){
            System.out.print(num+" ");
            num++;
        }
        System.out.println();
    }
    System.out.println();
   
   

 } 
}