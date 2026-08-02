// T must be Number or a child of Number (Integer, Double, etc.)
class MathBox<T extends Number> {
    private T num;
    
    public MathBox(T num) { 
        this.num = num; 
    }
    
    public void showData() {
        System.out.println("MathBox is holding: " + num);
    }
}

public class Program04 {
    public static void main(String[] args) {
        MathBox<Integer> intBox = new MathBox<>(500); // Valid!
        intBox.showData();
        
        MathBox<Double> doubleBox = new MathBox<>(99.99); // Valid!
        doubleBox.showData();
        
        // MathBox<String> strBox = new MathBox<>("Test"); // COMPILE ERROR!
    }
}
