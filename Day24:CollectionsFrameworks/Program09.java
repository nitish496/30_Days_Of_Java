import java.util.*;

public class Program09 {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 90);
        hashMap.put("Bob", 85);
        hashMap.put("Charlie", 95);
        System.out.println("HashMap: " + hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Alice", 90);
        linkedHashMap.put("Bob", 85);
        linkedHashMap.put("Charlie", 95);
        System.out.println("LinkedHashMap: " + linkedHashMap);
    }
}
