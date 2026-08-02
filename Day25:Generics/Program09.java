class DataHolder {
    // The class itself is NOT generic, but the constructor IS!
    public <T> DataHolder(T data) {
        System.out.println("DataHolder was created with: " + data);
    }
}

public class Program09 {
    public static void main(String[] args) {
        DataHolder d1 = new DataHolder(404); // Integer
        DataHolder d2 = new DataHolder("Generic Construction!"); // String
        DataHolder d3 = new DataHolder(99.99); // Double
    }
}
