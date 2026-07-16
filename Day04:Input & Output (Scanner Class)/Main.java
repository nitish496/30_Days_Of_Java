/*
==========================================
        DAY 04 - INPUT & OUTPUT
==========================================

Topics Covered:
1. Scanner Class
2. Reading Integers
3. Reading Doubles
4. Reading Strings
5. Reading Characters
6. next() vs nextLine()

Author: Nitish
==========================================
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // Program 1 - Reading an Integer
        // =========================================

        Scanner input = new Scanner(System.in);

        System.out.println("========== INTEGER INPUT ==========");
        System.out.println();

        System.out.print("Enter your age: ");

        int age = input.nextInt();

        System.out.println("Your age is: " + age);

    }
}