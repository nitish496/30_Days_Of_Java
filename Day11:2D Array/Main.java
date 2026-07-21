/*
==========================================
        DAY 11 - 2D ARRAYS
==========================================

Topics Covered:
1. Declare and Print a 2D Array
2. Take Input in a 2D Array
3. Print a 2D Array
4. Find Sum of All Elements
5. Find Largest Element
6. Find Smallest Element
7. Search an Element
8. Add Two Matrices
9. Transpose of a Matrix
10. Print Diagonal Elements

Author: Nitish
==========================================
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // =========================================
        // Program 1 - Declare and Print a 2D Array
        // =========================================

        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60}
        };

        System.out.println("Elements of 2D Array:");

        for (int row = 0; row < numbers.length; row++) {

            for (int column = 0; column < numbers[row].length; column++) {

                System.out.print(numbers[row][column] + " ");

            }

            System.out.println();

        }

        // =========================================
        // Program 2 - Take Input in a 2D Array
        // =========================================

        int[][] inputMatrix = new int[2][3];

        System.out.println("\nEnter 6 Elements:");

        for (int row = 0; row < inputMatrix.length; row++) {

            for (int column = 0; column < inputMatrix[row].length; column++) {

                inputMatrix[row][column] = sc.nextInt();

            }

        }

        System.out.println("Entered Matrix:");

        for (int row = 0; row < inputMatrix.length; row++) {

            for (int column = 0; column < inputMatrix[row].length; column++) {

                System.out.print(inputMatrix[row][column] + " ");

            }

            System.out.println();

        }

        // =========================================
        // Program 3 - Print a 2D Array
        // =========================================

        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println("\n2D Array Elements:");

        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[row].length; column++) {

                System.out.print(matrix[row][column] + " ");

            }

            System.out.println();

        }

        // =========================================
        // Program 4 - Find Sum of All Elements
        // =========================================

        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[row].length; column++) {

                sum += matrix[row][column];

            }

        }

        System.out.println("\nSum of All Elements: " + sum);

        // =========================================
        // Program 5 - Find the Largest Element
        // =========================================

        int largest = matrix[0][0];

        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[row].length; column++) {

                if (matrix[row][column] > largest) {

                    largest = matrix[row][column];

                }

            }

        }

        System.out.println("Largest Element: " + largest);

        // =========================================
        // Program 6 - Find the Smallest Element
        // =========================================

        int smallest = matrix[0][0];

        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[row].length; column++) {

                if (matrix[row][column] < smallest) {

                    smallest = matrix[row][column];

                }

            }

        }

        System.out.println("Smallest Element: " + smallest);

        // =========================================
        // Program 7 - Search an Element
        // =========================================

        System.out.print("\nEnter Element to Search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[row].length; column++) {

                if (matrix[row][column] == key) {

                    found = true;
                    break;

                }

            }

            if (found) {

                break;

            }

        }

        if (found) {

            System.out.println("Element Found.");

        } else {

            System.out.println("Element Not Found.");

        }

        // =========================================
        // Program 8 - Add Two Matrices
        // =========================================

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrix2 = {
                {7, 8, 9},
                {10, 11, 12}
        };

        int[][] result = new int[2][3];

        for (int row = 0; row < matrix1.length; row++) {

            for (int column = 0; column < matrix1[row].length; column++) {

                result[row][column] = matrix1[row][column] + matrix2[row][column];

            }

        }

        System.out.println("\nSum of Two Matrices:");

        for (int row = 0; row < result.length; row++) {

            for (int column = 0; column < result[row].length; column++) {

                System.out.print(result[row][column] + " ");

            }

            System.out.println();

        }

        // =========================================
        // Program 9 - Transpose of a Matrix
        // =========================================

        int[][] originalMatrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] transpose = new int[3][2];

        for (int row = 0; row < originalMatrix.length; row++) {

            for (int column = 0; column < originalMatrix[row].length; column++) {

                transpose[column][row] = originalMatrix[row][column];

            }

        }

        System.out.println("\nOriginal Matrix:");

        for (int row = 0; row < originalMatrix.length; row++) {

            for (int column = 0; column < originalMatrix[row].length; column++) {

                System.out.print(originalMatrix[row][column] + " ");

            }

            System.out.println();

        }

        System.out.println("Transpose Matrix:");

        for (int row = 0; row < transpose.length; row++) {

            for (int column = 0; column < transpose[row].length; column++) {

                System.out.print(transpose[row][column] + " ");

            }

            System.out.println();

        }

        // =========================================
        // Program 10 - Print Diagonal Elements
        // =========================================

        int[][] diagonalMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("\nMatrix:");

        for (int row = 0; row < diagonalMatrix.length; row++) {

            for (int column = 0; column < diagonalMatrix[row].length; column++) {

                System.out.print(diagonalMatrix[row][column] + " ");

            }

            System.out.println();

        }

        System.out.print("Diagonal Elements: ");

        for (int row = 0; row < diagonalMatrix.length; row++) {

            for (int column = 0; column < diagonalMatrix[row].length; column++) {

                if (row == column) {

                    System.out.print(diagonalMatrix[row][column] + " ");

                }

            }

        }

        System.out.println();

        sc.close();

    }
}

/*
==========================================
End of Day 11

Next Topic:
ArrayList

==========================================
*/