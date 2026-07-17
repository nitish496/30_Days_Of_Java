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
        input.close();
    }
}