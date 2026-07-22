/*
==========================================
        DAY 13 - WRAPPER CLASSES & AUTOBOXING
==========================================

Topics Covered:
1. Wrapper Classes
2. Primitive Types vs Wrapper Classes
3. Creating Wrapper Objects
4. Autoboxing
5. Unboxing
6. Parsing Strings
7. Wrapper Class Methods
8. Wrapper Classes with ArrayList
9. Mini Calculator
10. Comprehensive Practice Program

Author: Nitish
==========================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // =========================================
        // Program 1 - Introduction to Wrapper Classes
        // =========================================

        int number = 100;
        Integer wrapperNumber = 100;

        System.out.println("Primitive Value : " + number);
        System.out.println("Wrapper Value   : " + wrapperNumber);

        System.out.println();

        // =========================================
        // Program 2 - Primitive vs Wrapper Classes
        // =========================================

        int age = 18;
        double salary = 35000.50;
        char grade = 'A';

        Integer wrapperAge = 18;
        Double wrapperSalary = 35000.50;
        Character wrapperGrade = 'A';

        System.out.println("Primitive Types");
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Grade  : " + grade);

        System.out.println();

        System.out.println("Wrapper Objects");
        System.out.println("Age    : " + wrapperAge);
        System.out.println("Salary : " + wrapperSalary);
        System.out.println("Grade  : " + wrapperGrade);

        System.out.println();

        // =========================================
        // Program 3 - Creating Wrapper Objects
        // =========================================

        Integer number1 = 100;

        Integer number2 = Integer.valueOf(200);

        // Deprecated (For Learning Purpose Only)
        Integer number3 = new Integer(300);

        System.out.println("Method 1 : " + number1);
        System.out.println("Method 2 : " + number2);
        System.out.println("Method 3 : " + number3);

        System.out.println();

        // =========================================
        // Program 4 - Autoboxing
        // =========================================

        int time = 5;
        Integer wrapperTime = time;

        double employeeSalary = 75000.50;
        Double wrapperEmployeeSalary = employeeSalary;

        char gradeLetter = 'B';
        Character wrapperGradeLetter = gradeLetter;

        boolean passed = true;
        Boolean wrapperPassed = passed;

        System.out.println("Time    : " + wrapperTime);
        System.out.println("Salary  : " + wrapperEmployeeSalary);
        System.out.println("Grade   : " + wrapperGradeLetter);
        System.out.println("Passed  : " + wrapperPassed);

        System.out.println();

        // =========================================
        // Program 5 - Unboxing
        // =========================================

        Integer wrapperNum = 150;
        int num = wrapperNum;

        Double wrapperSalary2 = 50000.75;
        double salary2 = wrapperSalary2;

        Character wrapperChar = 'A';
        char character = wrapperChar;

        Boolean wrapperBoolean = true;
        boolean result = wrapperBoolean;

        System.out.println("Integer   : " + num);
        System.out.println("Double    : " + salary2);
        System.out.println("Character : " + character);
        System.out.println("Boolean   : " + result);

        System.out.println();

        // =========================================
        // Program 6 - Parsing Strings
        // =========================================

        String value1 = "100";
        String value2 = "200";

        int firstValue = Integer.parseInt(value1);
        int secondValue = Integer.parseInt(value2);

        int sum = firstValue + secondValue;

        System.out.println("Number 1 : " + firstValue);
        System.out.println("Number 2 : " + secondValue);
        System.out.println("Sum      : " + sum);

        System.out.println();

        // =========================================
        // Program 7 - Wrapper Class Methods
        // =========================================

        Integer phoneNumber = Integer.valueOf(100);

        String text = phoneNumber.toString();

        int maximum = Integer.max(10, 1000);
        int minimum = Integer.min(1000, 100);
        int comparison = Integer.compare(10, 1000);

        System.out.println("Wrapper Object : " + phoneNumber);
        System.out.println("String Value   : " + text);
        System.out.println("Maximum Value  : " + maximum);
        System.out.println("Minimum Value  : " + minimum);
        System.out.println("Comparison     : " + comparison);

        System.out.println();

        // =========================================
        // Program 8 - Wrapper Classes with ArrayList
        // =========================================

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        System.out.println("ArrayList   : " + numbers);

        int firstNumber = numbers.get(0);

        System.out.println("First Number : " + firstNumber);

        System.out.println();

        // =========================================
        // Program 9 - Mini Calculator
        // =========================================

        System.out.print("Enter First Number : ");
        String input1 = sc.next();

        System.out.print("Enter Second Number : ");
        String input2 = sc.next();

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        System.out.println("Addition       : " + (num1 + num2));
        System.out.println("Subtraction    : " + (num1 - num2));
        System.out.println("Multiplication : " + (num1 * num2));
        System.out.println("Division       : " + (num1 / num2));
        System.out.println("Remainder      : " + (num1 % num2));

        System.out.println();

        // =========================================
        // Program 10 - Comprehensive Practice Program
        // =========================================

        String stringValue1 = "50";
        String stringValue2 = "80";

        int valueOne = Integer.parseInt(stringValue1);
        int valueTwo = Integer.parseInt(stringValue2);

        Integer wrapper1 = valueOne;
        Integer wrapper2 = valueTwo;

        ArrayList<Integer> practiceNumbers = new ArrayList<>();

        practiceNumbers.add(wrapper1);
        practiceNumbers.add(wrapper2);

        int practiceFirst = practiceNumbers.get(0);
        int practiceSecond = practiceNumbers.get(1);

        int max = Integer.max(practiceFirst, practiceSecond);
        int min = Integer.min(practiceFirst, practiceSecond);
        int compare = Integer.compare(practiceFirst, practiceSecond);

        String stringOutput = wrapper1.toString();

        System.out.println("ArrayList    : " + practiceNumbers);
        System.out.println("First Number : " + practiceFirst);
        System.out.println("Second Number: " + practiceSecond);
        System.out.println("Maximum      : " + max);
        System.out.println("Minimum      : " + min);
        System.out.println("Comparison   : " + compare);
        System.out.println("String Value : " + stringOutput);

        sc.close();
    }
}

/*
==========================================
End of Day 13

Next Topic:
Day 14 - Object-Oriented Programming (OOP) Basics

==========================================
*/