import java.util.Arrays;
import java.util.List;

public class Program05 {
    // <?> means "List of Unknown Type"
    public static void printAnything(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<String> stringList = Arrays.asList("Java", "C++", "Python");

        System.out.print("Printing Integers: ");
        printAnything(intList);
        
        System.out.print("Printing Strings: ");
        printAnything(stringList);
    }
}
