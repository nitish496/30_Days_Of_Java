import java.util.*;

public class Program10 {

    public static void main(String[] args) {

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Charlie", 95);
        treeMap.put("Alice", 90);
        treeMap.put("Bob", 85);
        System.out.println("TreeMap (sorted by key): " + treeMap);

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 90);
        hashMap.put("Bob", 85);
        hashMap.put("Charlie", 95);

        System.out.println("Iterating HashMap entries:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
