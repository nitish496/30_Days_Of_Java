import java.util.*;

public class Program02 {

    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add(0, "Elephant"); // insert at front
        System.out.println("LinkedList: " + linkedList);
    }
}
