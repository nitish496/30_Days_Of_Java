/*
==========================================
        DAY 08 - ARRAYS
==========================================

Topics Covered:
1. Create and Print an Array
2. Traverse Array using Loop
3. Sum of Array Elements
4. Average of Array Elements
5. Find Maximum Element
6. Find Minimum Element
7. Linear Search
8. Reverse an Array
9. Copy One Array to Another
10. Count Even and Odd Numbers
11. Find Second Largest Element
12. Check if Array is Sorted

Author: Nitish
==========================================
*/

public class Main {

    public static void main(String[] args) {

        // =========================================
        // Program 1 - Create and Print an Array
        // =========================================

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First Element  : " + numbers[0]);
        System.out.println("Second Element : " + numbers[1]);
        System.out.println("Third Element  : " + numbers[2]);
        System.out.println("Fourth Element : " + numbers[3]);
        System.out.println("Fifth Element  : " + numbers[4]);

        System.out.println();

        // =========================================
        // Program 2 - Print Array Using Loop
        // =========================================

        int[] array = {10, 20, 30, 40, 50};

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

        System.out.println();

        // =========================================
        // Program 3 - Sum of Array Elements
        // =========================================

        int[] values = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int index = 0; index < values.length; index++) {
            sum += values[index];
        }

        System.out.println("Sum = " + sum);

        System.out.println();

        // =========================================
        // Program 4 - Average of Array Elements
        // =========================================

        int[] marks = {10, 20, 30, 40, 50};

        int total = 0;

        for (int index = 0; index < marks.length; index++) {
            total += marks[index];
        }

        double average = (double) total / marks.length;

        System.out.println("Average = " + average);
                System.out.println();

        // =========================================
        // Program 5 - Find Maximum Element
        // =========================================

        int[] numbers1 = {10, 20, 30, 40, 50};

        int maximum = numbers1[0];

        for (int index = 1; index < numbers1.length; index++) {

            if (numbers1[index] > maximum) {
                maximum = numbers1[index];
            }

        }

        System.out.println("Maximum = " + maximum);

        System.out.println();

        // =========================================
        // Program 6 - Find Minimum Element
        // =========================================

        int[] numbers2 = {10, 20, 30, 40, 50};

        int minimum = numbers2[0];

        for (int index = 1; index < numbers2.length; index++) {

            if (numbers2[index] < minimum) {
                minimum = numbers2[index];
            }

        }

        System.out.println("Minimum = " + minimum);

        System.out.println();

        // =========================================
        // Program 7 - Linear Search
        // =========================================

        int[] numbers3 = {10, 20, 30, 40, 50};

        int target = 30;
        boolean found = false;

        for (int index = 0; index < numbers3.length; index++) {

            if (numbers3[index] == target) {
                System.out.println(target + " found at index " + index);
                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println(target + " not found.");
        }

        System.out.println();

        // =========================================
        // Program 8 - Reverse an Array
        // =========================================

        int[] numbers4 = {10, 20, 30, 40, 50};

        System.out.println("Array in Reverse Order:");

        for (int index = numbers4.length - 1; index >= 0; index--) {
            System.out.println(numbers4[index]);
        }
                System.out.println();

        // =========================================
        // Program 9 - Copy One Array to Another
        // =========================================

        int[] source = {10, 20, 30, 40, 50};
        int[] destination = new int[source.length];

        for (int index = 0; index < source.length; index++) {
            destination[index] = source[index];
        }

        System.out.println("Copied Array:");

        for (int index = 0; index < destination.length; index++) {
            System.out.println(destination[index]);
        }

        System.out.println();

        // =========================================
        // Program 10 - Count Even and Odd Numbers
        // =========================================

        int[] numbers5 = {1, 2, 3, 4, 5};

        int evenCount = 0;
        int oddCount = 0;

        for (int index = 0; index < numbers5.length; index++) {

            if (numbers5[index] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

        }

        System.out.println("Even Count = " + evenCount);
        System.out.println("Odd Count = " + oddCount);

        System.out.println();

        // =========================================
        // Program 11 - Find Second Largest Element
        // =========================================

        int[] numbers6 = {10, 20, 50, 40, 30};

        int largest = numbers6[0];
        int secondLargest = numbers6[0];

        for (int index = 1; index < numbers6.length; index++) {

            if (numbers6[index] > largest) {
                secondLargest = largest;
                largest = numbers6[index];
            } else if (numbers6[index] > secondLargest) {
                secondLargest = numbers6[index];
            }

        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);

        System.out.println();

        // =========================================
        // Program 12 - Check if Array is Sorted
        // =========================================

        int[] numbers7 = {10, 20, 30, 40, 50};

        boolean isSorted = true;

        for (int index = 0; index < numbers7.length - 1; index++) {

            if (numbers7[index] > numbers7[index + 1]) {
                isSorted = false;
                break;
            }

        }

        if (isSorted) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }

    }
}

/*
==========================================
End of Day 08

Next Topic:
Methods (Functions)

==========================================
*/