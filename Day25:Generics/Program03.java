class Pair<K, V> {
    private K key;
    private V value;
    
    public Pair(K key, V value) { 
        this.key = key; 
        this.value = value; 
    }
    
    public void display() {
        System.out.println("Key: " + key + " | Value: " + value);
    }
}

public class Program03 {
    public static void main(String[] args) {
        Pair<String, Integer> studentInfo = new Pair<>("Alice", 95);
        studentInfo.display();
        
        Pair<Integer, String> employeeInfo = new Pair<>(101, "John");
        employeeInfo.display();
    }
}
