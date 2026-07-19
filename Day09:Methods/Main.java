/*
==========================================
        DAY 09 - METHODS
==========================================

Author: Nitish
==========================================
*/

public class Main {

    // =========================================
    // Program 1 - Print Hello Using Method
    // =========================================

    public static void printHello() {
        System.out.println("Hello, Java");
    }

    // =========================================
    // Program 2 - Call Method Multiple Times
    // =========================================

    public static void printMessage() {
        System.out.println("Welcome to Java");
    }

    // =========================================
    // Program 3 - Method with Parameters
    // =========================================

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // =========================================
    // Program 4 - Add Two Numbers Using Method
    // =========================================

    public static void addNumbers(int firstNumber, int secondNumber) {
        System.out.println("Sum = " + (firstNumber + secondNumber));
    }

    // =========================================
    // Program 5 - Find Square of a Number
    // =========================================

    public static void squareNumber(int number) {
        System.out.println("Square = " + (number * number));
    }

    // =========================================
    // Program 6 - Find Maximum of Two Numbers
    // =========================================

    public static void findMaximum(int firstNumber, int secondNumber) {

        if (firstNumber > secondNumber) {
            System.out.println("Maximum Number = " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("Maximum Number = " + secondNumber);
        } else {
            System.out.println("Both Numbers are Equal");
        }

    }

    // =========================================
    // Program 7 - Check Even or Odd
    // =========================================

    public static void checkEvenOdd(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is an Even Number");
        } else {
            System.out.println(number + " is an Odd Number");
        }

    }

    // =========================================
    // Program 8 - Method Returning a Value
    // =========================================

    public static int addNumbers(int firstNumber, int secondNumber) {

        int sum = firstNumber + secondNumber;

        return sum;

    }

    // =========================================
    // Program 9 - Find Factorial Using Method
    // =========================================

    public static int findFactorial(int number) {

        int factorial = 1;

        for (int index = 1; index <= number; index++) {
            factorial *= index;
        }

        return factorial;

    }

    public static void main(String[] args) {

        // =========================================
        // Program 1 - Print Hello Using Method
        // =========================================

        printHello();

        System.out.println();

        // =========================================
        // Program 2 - Call Method Multiple Times
        // =========================================

        printMessage();
        printMessage();
        printMessage();
        printMessage();
        printMessage();

        System.out.println();

        // =========================================
        // Program 3 - Method with Parameters
        // =========================================

        greet("Nitish");
        greet("Ram");
        greet("King");

        System.out.println();

        // =========================================
        // Program 4 - Add Two Numbers Using Method
        // =========================================

        addNumbers(20, 30);
        addNumbers(50, 60);

        System.out.println();

        // =========================================
        // Program 5 - Find Square of a Number
        // =========================================

        squareNumber(5);

        System.out.println();

        // =========================================
        // Program 6 - Find Maximum of Two Numbers
        // =========================================

        findMaximum(10, 20);
        findMaximum(10, 10);

        System.out.println();

        // =========================================
        // Program 7 - Check Even or Odd
        // =========================================

        checkEvenOdd(10);
        checkEvenOdd(15);

        System.out.println();

        // =========================================
        // Program 8 - Method Returning a Value
        // =========================================

        int result = addNumbers(10, 20);

        System.out.println("Sum = " + result);

        System.out.println();

        // =========================================
        // Program 9 - Find Factorial Using Method
        // =========================================

        int factorial = findFactorial(5);

        System.out.println("Factorial = " + factorial);

    }
}

/*
==========================================
End of Day 09

Next Topic:
Strings

==========================================
*/