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

        Scanner input = new Scanner(System.in);

        // =========================================
        // Program 1 - Reading an Integer
        // =========================================

        System.out.println("========== INTEGER INPUT ==========");
        System.out.println();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Your age is: " + age);
        System.out.println();

        // =========================================
        // Program 2 - Reading a Double
        // =========================================

        System.out.println("========== DOUBLE INPUT ==========");
        System.out.println();

        System.out.print("Enter your CGPA: ");
        double cgpa = input.nextDouble();

        System.out.println("Your CGPA is: " + cgpa);
        System.out.println();

        // =========================================
        // Program 3 - Reading a String (next)
        // =========================================

        System.out.println("========== STRING INPUT (next) ==========");
        System.out.println();

        System.out.print("Enter your first name: ");
        String name = input.next();

        System.out.println("Hello, " + name + "!");
        System.out.println();

        // =========================================
        // Program 4 - Reading a Full Sentence
        // =========================================

        // Clear the input buffer
        input.nextLine();

        System.out.println("========== STRING INPUT (nextLine) ==========");
        System.out.println();

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Welcome, " + fullName + "!");
        System.out.println();

        // =========================================
        // Program 5 - Reading a Character
        // =========================================

        System.out.println("========== CHARACTER INPUT ==========");
        System.out.println();

        System.out.print("Enter your grade: ");
        char grade = input.next().charAt(0);

        System.out.println("Your grade is: " + grade);
        System.out.println();

        // =========================================
        // Program 6 - Student Information
        // =========================================

        // Clear the input buffer
        input.nextLine();

        System.out.println("========== STUDENT INFORMATION ==========");
        System.out.println();

        System.out.print("Enter your full name: ");
        String studentName = input.nextLine();

        System.out.print("Enter your age: ");
        int studentAge = input.nextInt();

        System.out.print("Enter your CGPA: ");
        double studentCgpa = input.nextDouble();

        System.out.print("Enter your grade: ");
        char studentGrade = input.next().charAt(0);

        System.out.println();

        System.out.println("========== STUDENT DETAILS ==========");
        System.out.println("Name  : " + studentName);
        System.out.println("Age   : " + studentAge);
        System.out.println("CGPA  : " + studentCgpa);
        System.out.println("Grade : " + studentGrade);

        System.out.println();

        // Close Scanner
        input.close();
    }
}

/*
==========================================
End of Day 04

Next Topic:
Conditional Statements (if, if-else, else-if, switch)

==========================================
*/