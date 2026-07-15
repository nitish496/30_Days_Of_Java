
/*
==========================================
        DAY 03 - OPERATORS
==========================================
*/

public class Main {

    public static void main(String[] args) {

        // =========================================
        // Program 1 - Arithmetic Operators
        // =========================================

        int a = 10;
        int b = 10;

        System.out.println("========== ARITHMETIC OPERATORS ==========");
        System.out.println();

        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division       : " + (a / b));
        System.out.println("Modulus        : " + (a % b));

// =========================================
// Program 2 - Assignment Operators
// =========================================

int number = 10;

System.out.println("========== ASSIGNMENT OPERATORS ==========");
System.out.println();

System.out.println("Initial Value : " + number);

number += 5;
System.out.println("After += 5    : " + number);

number -= 3;
System.out.println("After -= 3    : " + number);

number *= 2;
System.out.println("After *= 2    : " + number);

number /= 4;
System.out.println("After /= 4    : " + number);

number %= 3;
System.out.println("After %= 3    : " + number);

System.out.println();


// =========================================
// Program 3 - Relational Operators
// =========================================

int x = 20;
int y = 10;

System.out.println("========== RELATIONAL OPERATORS ==========");
System.out.println();

System.out.println("x == y : " + (x == y));
System.out.println("x != y : " + (x != y));
System.out.println("x > y  : " + (x > y));
System.out.println("x < y  : " + (x < y));
System.out.println("x >= y : " + (x >= y));
System.out.println("x <= y : " + (x <= y));

System.out.println();
    }
}