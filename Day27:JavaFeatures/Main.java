import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {

    // A functional interface = an interface with EXACTLY ONE abstract method.
    // This is what allows us to write a lambda for it.
    @FunctionalInterface
    interface Greeting {
        void sayHello();
    }

    @FunctionalInterface
    interface Calculator {
        int operate(int a, int b);
    }

    // ---------- Program 1: Lambda basics - old way vs new way ----------
    static void program1() {
        System.out.println("===== Program 1 - Lambda Basics =====");

        // OLD WAY: anonymous class - lots of boilerplate
        Greeting oldWay = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from the OLD way");
            }
        };
        oldWay.sayHello();

        // NEW WAY: lambda - same thing, one line
        Greeting newWay = () -> System.out.println("Hello from the LAMBDA");
        newWay.sayHello();
    }

    // ---------- Program 2: Lambda with parameters ----------
    static void program2() {
        System.out.println("===== Program 2 - Lambda with Parameters =====");

        // (a, b) are the inputs, everything after -> is what it does
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("10 + 5 = " + add.operate(10, 5));
        System.out.println("10 * 5 = " + multiply.operate(10, 5));
    }

    // ---------- Program 3: Predicate for true/false checks ----------
    static void program3() {
        System.out.println("===== Program 3 - Predicate (true/false) =====");

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println("Is 10 even? " + isEven.test(10));
        System.out.println("Is 7 even?  " + isEven.test(7));
    }

    // ---------- Program 4: Function for input to output ----------
    static void program4() {
        System.out.println("===== Program 4 - Function (input -> output) =====");

        // Function<InputType, OutputType>
        Function<String, Integer> getLength = word -> word.length();

        System.out.println("Length of 'Java'   = " + getLength.apply("Java"));
        System.out.println("Length of 'Python' = " + getLength.apply("Python"));
    }

    // ---------- Program 5: forEach the Java 8 way ----------
    static void program5() {
        System.out.println("===== Program 5 - forEach =====");

        List<String> languages = Arrays.asList("Java", "Python", "C++");

        // OLD WAY
        System.out.println("Old for-each loop:");
        for (String lang : languages) {
            System.out.println(lang);
        }

        // NEW WAY
        System.out.println("New forEach with lambda:");
        languages.forEach(lang -> System.out.println(lang));
    }

    // ---------- Program 6: Method references ----------
    static void program6() {
        System.out.println("===== Program 6 - Method Reference =====");

        List<String> languages = Arrays.asList("Java", "Python", "C++");

        // These two lines do EXACTLY the same thing:
        languages.forEach(lang -> System.out.println(lang)); // lambda
        languages.forEach(System.out::println);              // method reference

        // Read "System.out::println" as "just use the println method"
    }

    // ---------- Program 7: Stream filter() ----------
    static void program7() {
        System.out.println("===== Program 7 - Stream filter() =====");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evenNumbers = numbers.stream()   // 1. turn list into a stream
                .filter(n -> n % 2 == 0)               // 2. keep only evens
                .collect(Collectors.toList());         // 3. turn back into a list

        System.out.println("Original: " + numbers);
        System.out.println("Only evens: " + evenNumbers);
    }

    // ---------- main ----------
    public static void main(String[] args) {
        System.out.println("=== Program 1: Lambda basics - old way vs new way ===");
        program1();
        System.out.println();
        System.out.println("=== Program 2: Lambda with parameters ===");
        program2();
        System.out.println();
        System.out.println("=== Program 3: Predicate for true/false checks ===");
        program3();
        System.out.println();
        System.out.println("=== Program 4: Function for input to output ===");
        program4();
        System.out.println();
        System.out.println("=== Program 5: forEach the Java 8 way ===");
        program5();
        System.out.println();
        System.out.println("=== Program 6: Method references ===");
        program6();
        System.out.println();
        System.out.println("=== Program 7: Stream filter() ===");
        program7();
    }
}
