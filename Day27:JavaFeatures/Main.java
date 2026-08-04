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

    // ---------- main ----------
    public static void main(String[] args) {
        System.out.println("=== Program 1: Lambda basics - old way vs new way ===");
        program1();
    }
}
