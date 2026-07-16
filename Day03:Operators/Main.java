/*
==========================================
        DAY 03 - OPERATORS
==========================================

Topics Covered:
1. Arithmetic Operators
2. Assignment Operators
3. Relational Operators
4. Logical Operators
5. Unary Operators
6. Operator Precedence

Author: Nitish
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

        System.out.println();

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

        // =========================================
        // Program 4 - Logical Operators
        // =========================================

        boolean isStudent = true;
        boolean hasID = false;

        System.out.println("========== LOGICAL OPERATORS ==========");
        System.out.println();

        System.out.println("isStudent && hasID : " + (isStudent && hasID)); // Both conditions must be true
        System.out.println("isStudent || hasID : " + (isStudent || hasID)); // At least one condition must be true
        System.out.println("!isStudent         : " + (!isStudent));         // Flips the result
        System.out.println("!hasID             : " + (!hasID));             // Flips the result

        System.out.println();

        // =========================================
        // Program 5 - Unary Operators
        // =========================================

        int num = 10;

        System.out.println("========== UNARY OPERATORS ==========");
        System.out.println();

        System.out.println("Initial Value : " + num);

        num++;
        System.out.println("After ++      : " + num);

        num--;
        System.out.println("After --      : " + num);

        System.out.println();

        // =========================================
        // Program 6 - Operator Precedence
        // =========================================

        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;

        System.out.println("========== OPERATOR PRECEDENCE ==========");
        System.out.println();

        System.out.println("10 + 5 * 2   = " + result1);
        System.out.println("(10 + 5) * 2 = " + result2);

        System.out.println();
    }
}

/*
==========================================
End of Day 03

Next Topic:
Input & Output (Scanner Class)

==========================================
*/