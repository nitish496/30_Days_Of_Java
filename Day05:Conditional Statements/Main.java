/*
==========================================
        DAY 05 - CONDITIONAL STATEMENTS
==========================================

Topics Covered:
1. if Statement
2. if-else Statement
3. else-if Ladder
4. Nested if
5. switch Statement
6. Switch Expression

Author: Nitish
==========================================
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // =========================================
        // Program 1 - if Statement
        // =========================================

        System.out.println("========== IF STATEMENT ==========");
        System.out.println();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }
      //program-2:
      System.out.println("Enter your marks:");
      int marks = input.nextInt();

      if(marks>=40){
        System.out.println("Pass");
      }else{
        System.out.println("Fail");
      }
      //program-3:

      if(marks>=90){
        System.out.println("Grade:S");
      }else if(marks>=80){
        System.out.println("Grade:A");
      }else if(marks>=70){
        System.out.println("Grade:B");
      }else if(marks>=60){
        System.out.println("Grade:C");
      }else if(marks>=50){
        System.out.println("Grade:D");
      }else if(marks>=40){
        System.out.println("Grade:E");
      }else{
        System.out.println("Grade:F");
      }
      //program-4:

      System.out.println("Did you pass the driving test (true/false):");
      boolean DrivingTest=input.nextBoolean();
      if(age>=18){
        if(DrivingTest){
            System.out.println("Your approved for driving license");
        }else{
            System.out.println("U did not passed your driving test BETTER LUCK NEXT TIME");
        }
      }else{
        System.out.println("You are not eligible for Driving test");
      }

        input.close();
    }
}