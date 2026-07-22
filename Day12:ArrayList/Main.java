/*
==========================================
        DAY 12 - ARRAYLIST
==========================================

Topics Covered:
1. Create an ArrayList
2. Take Input into an ArrayList
3. Access Elements using get()
4. Update Elements using set()
5. Remove Elements using remove()
6. Find Size using size()
7. Search Elements using contains()
8. Traverse an ArrayList
9. Find the Largest Element
10. Find the Sum of All Elements

Author: Nitish
==========================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // =========================================
        // Program 1 - Create an ArrayList
        // =========================================

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("ArrayList Elements:");
        System.out.println(numbers);

        // =========================================
        // Program 2 - Take Input into an ArrayList
        // =========================================

        ArrayList<Integer> inputNumbers = new ArrayList<>();

        System.out.print("\nHow many elements do you want to enter? ");
        int size = sc.nextInt();

        System.out.println("Enter the values:");

        for (int i = 0; i < size; i++) {

            int number = sc.nextInt();

            inputNumbers.add(number);

        }

        System.out.println("ArrayList:");
        System.out.println(inputNumbers);

        // =========================================
        // Program 3 - Access Elements using get()
        // =========================================

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        System.out.println("\nArrayList:");
        System.out.println(nums);

        System.out.println("Element at Index 0: " + nums.get(0));
        System.out.println("Element at Index 2: " + nums.get(2));
        System.out.println("Element at Index 4: " + nums.get(4));

        // =========================================
        // Program 4 - Update Elements using set()
        // =========================================

        ArrayList<String> names = new ArrayList<>();

        names.add("Nitish");
        names.add("Rahul");
        names.add("King");

        System.out.println("\nOriginal ArrayList:");
        System.out.println(names);

        names.set(1, "Premam");

        System.out.println("Updated ArrayList:");
        System.out.println(names);

        // =========================================
        // Program 5 - Remove Elements using remove()
        // =========================================

        names.remove(1);

        System.out.println("\nAfter Removing Element at Index 1:");
        System.out.println(names);

        // =========================================
        // Program 6 - Find Size using size()
        // =========================================

        int totalElements = names.size();

        System.out.println("\nTotal Elements: " + totalElements);

        // =========================================
        // Program 7 - Search Elements using contains()
        // =========================================

        System.out.print("\nEnter element to search: ");
        String search = sc.next();

        if (names.contains(search)) {

            System.out.println(search + " is present in the ArrayList.");

        } else {

            System.out.println(search + " is not present in the ArrayList.");

        }

        // =========================================
        // Program 8 - Traverse an ArrayList
        // =========================================

        System.out.println("\nTraversing using for Loop:");

        for (int i = 0; i < names.size(); i++) {

            System.out.println(names.get(i));

        }

        System.out.println("\nTraversing using Enhanced for Loop:");

        for (String name : names) {

            System.out.println(name);

        }

        // =========================================
        // Program 9 - Find the Largest Element
        // =========================================

        ArrayList<Integer> numz = new ArrayList<>();

        numz.add(10);
        numz.add(20);
        numz.add(30);
        numz.add(40);

        System.out.println("\nArrayList:");
        System.out.println(numz);

        int largest = numz.get(0);

        for (int i = 1; i < numz.size(); i++) {

            if (numz.get(i) > largest) {

                largest = numz.get(i);

            }

        }

        System.out.println("Largest Element: " + largest);

        // =========================================
        // Program 10 - Find the Sum of All Elements
        // =========================================

        int sum = 0;

        for (int i = 0; i < numz.size(); i++) {

            sum += numz.get(i);

        }

        System.out.println("Sum of All Elements: " + sum);

        sc.close();

    }

}

/*
==========================================
End of Day 12

Next Topic:
Wrapper Classes & Autoboxing

==========================================
*/