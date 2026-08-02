import java.util.ArrayList;

public class Program10 {
    public static void main(String[] args) {
        // Without Generics (Pre Java 5) - Unsafe!
        ArrayList oldList = new ArrayList();
        oldList.add("Apple");
        oldList.add(100); // Allowed, but dangerous!

        // With Generics (Modern Java) - 100% Type Safe!
        ArrayList<String> safeList = new ArrayList<>();
        safeList.add("Java");
        safeList.add("Generics");
        // safeList.add(100); // COMPILE ERROR! The compiler protects you!
        
        System.out.println("Safe List Contains: " + safeList);
    }
}
