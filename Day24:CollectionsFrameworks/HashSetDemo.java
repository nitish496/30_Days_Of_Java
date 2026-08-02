import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Red"); // duplicate, ignored
        System.out.println("HashSet: " + hashSet);
    }
}
