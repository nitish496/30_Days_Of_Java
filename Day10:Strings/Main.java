/*
==========================================
        DAY 10 - STRINGS
==========================================

Author: Nitish
==========================================
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // Program 2 - Take String Input
        // =========================================

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");
        System.out.println();

        System.out.print("Enter the language:");

        String language = sc.nextLine();
        int length = language.length();

        System.out.println("lang :"+language);
        System.out.println("length:"+length);

        sc.close();

    }
}

/*
==========================================
End of Program 2

Next Program:
Find String Length

==========================================
*/