// <T> is a placeholder for the Data Type
class Box<T> {
    private T item;
    
    public void set(T item) { 
        this.item = item; 
    }
    
    public T get() { 
        return item; 
    }
}

public class Program01 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics!");
        System.out.println("Box contains: " + stringBox.get());
        
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("Box contains: " + intBox.get());
    }
}
