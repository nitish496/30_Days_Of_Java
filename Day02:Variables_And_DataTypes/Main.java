/*
==========================================
        DAY 02 - VARIABLES & DATA TYPES
==========================================

Topics Covered:
1. Variables
2. Primitive Data Types
3. Type Conversion (Widening)
4. Type Casting (Narrowing)

Author: Nitish
==========================================
*/

public class Main {

    public static void main(String[] args) {

        // =========================================
        // Program 1 - Variables
        // =========================================

        String name = "Nitish";
        int age = 18;
        double cgpa = 9.0;
        char grade = 'A';
        boolean isStudent = true;

        System.out.println("========== STUDENT PROFILE ==========");
        System.out.println();

        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("CGPA       : " + cgpa);
        System.out.println("Grade      : " + grade);
        System.out.println("Student    : " + isStudent);

        System.out.println();

        // =========================================
        // Program 2 - Primitive Data Types
        // =========================================

        byte byteValue = 100;
        short shortValue = 10000;
        int intValue = 400000;
        long longValue = 12345678901L;
        float floatValue = 1.00f;
        double doubleValue = 2.34589394;
        char charValue = 'A';
        boolean isJavaFun = true;

        System.out.println("========== PRIMITIVE DATA TYPES ==========");
        System.out.println();

        System.out.println("byte      : " + byteValue);
        System.out.println("short     : " + shortValue);
        System.out.println("int       : " + intValue);
        System.out.println("long      : " + longValue);
        System.out.println("float     : " + floatValue);
        System.out.println("double    : " + doubleValue);
        System.out.println("char      : " + charValue);
        System.out.println("boolean   : " + isJavaFun);

        System.out.println();

        // =========================================
        // Program 3 - Type Conversion (Widening)
        // =========================================

        int marks = 95;
        double convertedMarks = marks;

        System.out.println("========== TYPE CONVERSION ==========");
        System.out.println();

        System.out.println("Original int       : " + marks);
        System.out.println("Converted double   : " + convertedMarks);

        System.out.println();

        // =========================================
        // Program 4 - Type Casting (Narrowing)
        // =========================================

        double price = 99.99;
        int roundedPrice = (int) price;

        System.out.println("========== TYPE CASTING ==========");
        System.out.println();

        System.out.println("Original double    : " + price);
        System.out.println("Converted int      : " + roundedPrice);

    }
}

/*
==========================================
End of Day 02

Next Topic:
Operators

==========================================
*/