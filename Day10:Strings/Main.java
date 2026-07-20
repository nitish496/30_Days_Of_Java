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
       //program-6:
        System.out.print("Enter the first language:");
        String lang1=sc.nextLine();
        System.out.print("Enter the second language:");
        String lang2 = sc.nextLine();
        if(lang1.equals(lang2)){
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        }
        //program-7:
        System.out.print("Enter any word:");
        String lang3=sc.nextLine();
        System.out.println("Language:"+lang3);
        System.out.println("UpperCase:"+lang3.toUpperCase());
        System.out.println("LowerCase:"+lang3.toLowerCase());
        //program-8:
        System.out.print("Enter the sentence:");
        String sen = sc.nextLine();
        if(sen.contains("java")){
            System.out.println("the word java has been found in sentence");
        }else{
          System.out.println("the word java has not been found in sentence");
        }
        System.out.print("Enter the sentence to change the word:");
         String sen1 = sc.nextLine();
          System.out.println("Original:"+sen1);
          String newLang = sen1.replace("java", "python");
          System.out.println("Updated String:"+newLang);
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