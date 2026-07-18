/*
==========================================
        DAY 06 - LOOPS
==========================================

Topics Covered:
1. for Loop
2. while Loop
3. do-while Loop
4. break Statement
5. continue Statement
6. Nested Loop

Author: Nitish
==========================================
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // =========================================
        // Program 1 - for Loop
        // =========================================

        System.out.println("========== FOR LOOP ==========");
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
        }

        System.out.println();

        // =========================================
        // Program 2 - while Loop
        // =========================================

        System.out.println("========== WHILE LOOP ==========");
        System.out.println();

        int count = 1;

        while (count <= 5) {
            System.out.println("Hello");
            count++;
        }

        System.out.println();

        // =========================================
        // Program 3 - do-while Loop
        // =========================================

        System.out.println("========== DO-WHILE LOOP ==========");
        System.out.println();

        int number = 1;

        do {
            System.out.println("Hello");
            number++;
        } while (number <= 5);

        System.out.println();

        // =========================================
        // Program 4 - Print Even Numbers
        // =========================================

        System.out.println("========== EVEN NUMBERS ==========");
        System.out.println();

        for (int even = 2; even <= 10; even += 2) {
            System.out.println(even);
        }

        System.out.println();

        // =========================================
        // Program 5 - Multiplication Table
        // =========================================

        System.out.println("========== MULTIPLICATION TABLE ==========");
        System.out.println();

        System.out.print("Enter a number: ");
        int numberToMultiply = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numberToMultiply + " x " + i + " = " + (numberToMultiply * i));
        }

        System.out.println();

        // =========================================
        // Program 6 - break Statement
        // =========================================

        System.out.println("========== BREAK STATEMENT ==========");
        System.out.println();

        for (int i = 1; i <= 10; i++) {

            if (i == 6) {
                break;
            }

            System.out.println(i);
        }

        System.out.println();

        // =========================================
        // Program 7 - continue Statement
        // =========================================

        System.out.println("========== CONTINUE STATEMENT ==========");
        System.out.println();

        for (int i = 1; i <= 10; i++) {

            if (i == 7) {
                continue;
            }

            System.out.println(i);
        }

        System.out.println();

        // =========================================
        // Program 8 - Number Pattern
        // =========================================

        System.out.println("========== NUMBER PATTERN ==========");
        System.out.println();

        for (int row = 1; row <= 5; row++) {

            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();

        input.close();
    }
}

/*
==========================================
End of Day 06

Next Topic:
Arrays

==========================================
*/
