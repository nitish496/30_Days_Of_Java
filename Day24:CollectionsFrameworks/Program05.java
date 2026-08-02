import java.util.*;

public class Program05 {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Red"); // duplicate, ignored
        System.out.println("HashSet: " + hashSet);
    }
}
