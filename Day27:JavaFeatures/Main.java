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

    // ---------- main ----------
    public static void main(String[] args) {
        System.out.println("=== Program 1: Lambda basics - old way vs new way ===");
        program1();
        System.out.println();
        System.out.println("=== Program 2: Lambda with parameters ===");
        program2();
    }
}
