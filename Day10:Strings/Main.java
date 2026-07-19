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

        //program-3:
        String language = sc.nextLine();
        int length = language.length();

        System.out.println("lang :"+language);
        System.out.println("length:"+length);
        //program-4:
        for(int index=0;index<language.length();index++){
         System.out.println(language.charAt(index));
        }
        //program-5
        String firstName = "Nitish";
        String secName = "Kumar";
        String fullName = firstName +" "+secName;
        System.out.println("firstName:"+firstName);
        System.out.println("lastName:"+secName);
        System.out.println("fullName:"+fullName);
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