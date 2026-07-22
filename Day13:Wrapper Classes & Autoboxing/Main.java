import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //p-1:
        int number = 100;
        Integer wrapperNumber = 100;

        System.out.println("primirtive value:"+number);
        System.out.println("Wrapper value:"+wrapperNumber);
        System.out.println();

            //p-2:
        //primitive values:
        int age = 18;
        String name="Nitish";
        double num = 35000.5;
        char grade = 'A';
       //Wrapper objects:
       Integer wrapperAge=18;
       Double  wrapperSalary = 35000.5;
       Character wrapperGrade = 'A';

       System.out.println("Primitive types:");
       System.out.println("age:"+age);
       System.out.println("num:"+num);
       System.out.println("grade:"+grade);
        System.out.println("Wrapper objects:");
        System.out.println("age:"+wrapperAge);
        System.out.println("num:"+wrapperNumber);
       System.out.println("grade:"+wrapperGrade);
       System.out.println();
     //p-3:
     ///method-1:
     Integer number1 = 100;
     ///method-2:
     Integer number2 = Integer.valueOf(200);
     ///method-3:
     Integer number3 = new Integer(300);

     System.out.println("Method1:"+number1);
     System.out.println("Method2:"+number2);
     System.out.println("Method3:"+number3);
     System.out.println();

     //p-4:
     int time = 5;
     Integer wrapperTime = time;
     double sal = 75000.5;
     Double wrapperSal = sal;
     char garder = 'B';
     Character wrapperGrader = garder;
     boolean passed = true;
     Boolean wrapperPassed = passed;

     System.out.println("Time:"+wrapperTime);
     System.out.println("salary:"+wrapperSal);
     System.out.println("grade:"+wrapperGrader);
     System.out.println("passed:"+wrapperPassed);
     System.out.println();
     //p-5:
         Integer wrapperNumz = 150;

        int numz = wrapperNumz;

        Double wrapperSala = 50000.75;

        double sala = wrapperSala;

        Character wrapperGrad = 'A';

        char grad = wrapperGrad;

        Boolean wrapperPasse = true;

        boolean passe = wrapperPasse;

        System.out.println("Integer : " + numz);
        System.out.println("Double  : " + sala);
        System.out.println("Character : " + grad);
        System.out.println("Boolean : " + passe);
        System.out.println();
       //p-6:
       String number01 = "100";
       String number4= "200";

       int num1 = Integer.parseInt(number01);
       int num2 = Integer.parseInt(number4);
        int sum = num1+num2;
        System.out.println("number 1:"+num1);
         System.out.println("number 2:"+num2);
          System.out.println("Sum :"+sum);
          System.out.println();
          //p-7:
          Integer phoneNumber = Integer.valueOf(100);
          String text = phoneNumber.toString();
          int max = Integer.max(10, 1000);
          int min = Integer.min(1000,100);
          int compare = Integer.compare(10, 1000);

          System.out.println("phone number:"+phoneNumber);
          System.out.println("text:"+text);
          System.out.println("Maximum:"+max);
          System.out.println("Minimum:"+min);
          System.out.println("Compare:"+compare);
          System.out.println();
          //p-8:
          ArrayList<Integer>numbers = new ArrayList<>();
          numbers.add(100);
          numbers.add(200);
          numbers.add(300);

          System.out.println("ArrayList:"+numbers);

          int firstNumbers = numbers.get(0);
          System.out.println("first number:"+firstNumbers);
          System.out.println();

    }
}