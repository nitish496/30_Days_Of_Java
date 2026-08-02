import java.util.*;

public class Program04 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
