import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Red");
        linkedHashSet.add("Green");
        linkedHashSet.add("Blue");
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
