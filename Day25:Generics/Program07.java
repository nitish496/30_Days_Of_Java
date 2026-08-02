import java.util.ArrayList;
import java.util.List;

public class Program07 {
    // Accepts List<Integer>, List<Number>, List<Object>
    public static void addNumbers(List<? super Integer> list) {
        list.add(50);
        list.add(100);
        System.out.println("List after adding: " + list);
    }

    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        numList.add(10);
        
        System.out.println("Original List: " + numList);
        addNumbers(numList); // We can pass a List of Numbers safely!
    }
}
