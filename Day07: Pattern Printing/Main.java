/*
==========================================
        DAY 07 - PATTERN PRINTING
==========================================

Topics Covered:
1. Right Star Triangle
2. Inverted Star Triangle
3. Number Triangle
4. Inverted Number Triangle
5. Repeated Number Pattern
6. Floyd's Triangle
7. Character Pattern
8. Hollow Square
9. Pyramid Pattern

Author: Nitish
==========================================
*/

public class Main {

    public static void main(String[] args) {

        // =========================================
        // Program 1 - Right Star Triangle
        // =========================================

        System.out.println("========== RIGHT STAR TRIANGLE ==========\n");

        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();


        // =========================================
        // Program 2 - Inverted Star Triangle
        // =========================================

        System.out.println("========== INVERTED STAR TRIANGLE ==========\n");

        for (int row = 5; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();


        // =========================================
        // Program 3 - Number Triangle
        // =========================================

        System.out.println("========== NUMBER TRIANGLE ==========\n");

        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        System.out.println();


        // =========================================
        // Program 4 - Inverted Number Triangle
        // =========================================

        System.out.println("========== INVERTED NUMBER TRIANGLE ==========\n");

        for (int row = 5; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        System.out.println();


        // =========================================
        // Program 5 - Repeated Number Pattern
        // =========================================

        System.out.println("========== REPEATED NUMBER PATTERN ==========\n");

        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

        System.out.println();


        // =========================================
        // Program 6 - Floyd's Triangle
        // =========================================

        System.out.println("========== FLOYD'S TRIANGLE ==========\n");

        int number = 1;

        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

        System.out.println();


        // =========================================
        // Program 7 - Character Pattern
        // =========================================

        System.out.println("========== CHARACTER PATTERN ==========\n");

        for (int row = 1; row <= 5; row++) {

            char alphabet = 'A';

            for (int column = 1; column <= row; column++) {
                System.out.print(alphabet + " ");
                alphabet++;
            }

            System.out.println();
        }

        System.out.println();


        // =========================================
        // Program 8 - Hollow Square
        // =========================================

        System.out.println("========== HOLLOW SQUARE ==========\n");

        for (int row = 1; row <= 5; row++) {

            for (int column = 1; column <= 5; column++) {

                if (row == 1 || row == 5 || column == 1 || column == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            System.out.println();
        }

        System.out.println();


        // =========================================
        // Program 9 - Pyramid Pattern
        // =========================================

        System.out.println("========== PYRAMID PATTERN ==========\n");

        for (int row = 1; row <= 5; row++) {

            // Print Spaces
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");
            }

            // Print Stars
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();
    }
}

/*
==========================================
End of Day 07

Next Topic:
Arrays

==========================================
*/