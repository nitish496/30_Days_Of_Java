import java.util.Arrays;
import java.util.List;

public class Program06 {
    // Accepts List<Number>, List<Integer>, List<Double>
    public static double sumAll(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(5, 10, 15);
        List<Double> doubles = Arrays.asList(2.5, 3.5);

        System.out.println("Sum of ints: " + sumAll(ints));
        System.out.println("Sum of doubles: " + sumAll(doubles));
    }
}
