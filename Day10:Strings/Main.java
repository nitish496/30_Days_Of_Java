/*
==========================================
        DAY 10 - STRINGS
==========================================

Topics Covered:
1. Create and Print a String
2. Take String Input
3. Find String Length
4. Print Each Character using charAt()
5. Concatenate Two Strings
6. Compare Two Strings
7. Convert to Uppercase and Lowercase
8. Check if a String Contains a Word
9. Replace Characters in a String
10. Reverse a String

Author: Nitish
==========================================
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // =========================================
        // Program 1 - Create and Print a String
        // =========================================

        String message = "Welcome to Java Programming";

        System.out.println("Message : " + message);
        System.out.println();

        // =========================================
        // Program 2 - Take String Input
        // =========================================

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");
        System.out.println();

        // =========================================
        // Program 3 - Find String Length
        // =========================================

        System.out.print("Enter a Language: ");
        String language = sc.nextLine();

        int length = language.length();

        System.out.println("Language : " + language);
        System.out.println("Length   : " + length);
        System.out.println();

        // =========================================
        // Program 4 - Print Each Character Using charAt()
        // =========================================

        System.out.println("Characters in the String:");

        for (int index = 0; index < language.length(); index++) {
            System.out.println(language.charAt(index));
        }

        System.out.println();

        // =========================================
        // Program 5 - Concatenate Two Strings
        // =========================================

        String firstName = "Nitish";
        String lastName = "Kumar";
        String fullName = firstName + " " + lastName;

        System.out.println("First Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("Full Name  : " + fullName);
        System.out.println();

        // =========================================
        // Program 6 - Compare Two Strings
        // =========================================

        System.out.print("Enter First Language: ");
        String firstLanguage = sc.nextLine();

        System.out.print("Enter Second Language: ");
        String secondLanguage = sc.nextLine();

        if (firstLanguage.equals(secondLanguage)) {
            System.out.println("Both Strings are Equal.");
        } else {
            System.out.println("Both Strings are Not Equal.");
        }

        System.out.println();

        // =========================================
        // Program 7 - Convert String to Uppercase and Lowercase
        // =========================================

        System.out.print("Enter Any Word: ");
        String word = sc.nextLine();

        System.out.println("Original String  : " + word);
        System.out.println("Uppercase String : " + word.toUpperCase());
        System.out.println("Lowercase String : " + word.toLowerCase());

        System.out.println();

        // =========================================
        // Program 8 - Check if a String Contains a Word
        // =========================================

        System.out.print("Enter a Sentence: ");
        String sentence = sc.nextLine();

        if (sentence.contains("Java")) {
            System.out.println("The word 'Java' is found.");
        } else {
            System.out.println("The word 'Java' is not found.");
        }

        System.out.println();

        // =========================================
        // Program 9 - Replace Characters in a String
        // =========================================

        System.out.print("Enter a Sentence: ");
        String originalSentence = sc.nextLine();

        String updatedSentence = originalSentence.replace("Java", "Python");

        System.out.println("Original String : " + originalSentence);
        System.out.println("Updated String  : " + updatedSentence);

        System.out.println();

        // =========================================
        // Program 10 - Reverse a String
        // =========================================

        System.out.print("Enter a Word: ");
        String reverseWord = sc.nextLine();

        System.out.print("Reversed String : ");

        for (int index = reverseWord.length() - 1; index >= 0; index--) {
            System.out.print(reverseWord.charAt(index));
        }

        System.out.println();

        sc.close();
    }
}

/*
==========================================
End of Day 10

Next Topic:
2D Arrays

==========================================
*/