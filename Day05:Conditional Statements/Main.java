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

        System.out.println();

        // =========================================
        // Program 2 - if-else Statement
        // =========================================

        System.out.println("========== IF-ELSE STATEMENT ==========");
        System.out.println();

        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        System.out.println();

        // =========================================
        // Program 3 - else-if Ladder
        // =========================================

        System.out.println("========== ELSE-IF LADDER ==========");
        System.out.println();

        if (marks >= 90) {
            System.out.println("Grade: S");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else if (marks >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }

        System.out.println();

        // =========================================
        // Program 4 - Nested if Statement
        // =========================================

        System.out.println("========== NESTED IF ==========");
        System.out.println();

        System.out.print("Did you pass the driving test? (true/false): ");
        boolean passedDrivingTest = input.nextBoolean();

        if (age >= 18) {

            if (passedDrivingTest) {
                System.out.println("Your driving license has been approved.");
            } else {
                System.out.println("You did not pass the driving test. Better luck next time!");
            }

        } else {
            System.out.println("You are not eligible to apply for a driving license.");
        }


        System.out.println("Menu")
        System.out.println("1.tea");
        System.out.println("2.coffee");
        System.out.println("3.cool drink");
        System.out.println("4.cold coffee");
        System.out.println("choose your drink:");

        int inner= input.nextInt();
        switch(inner){
            case 1:
                System.out.println("You choose tea");
                break;
            case 2:
                System.out.println("You choose coffee");
                break;
            case 3:
                System.out.println("You choose cool drink");
                break;
            case 4:
                System.out.println("You choose cold coffee");
                break;
        }
        input.close();
    }
}

/*
==========================================
End of Day 05

Next Topic:
switch Statement

==========================================
*/