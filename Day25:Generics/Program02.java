class Printer {
    // <T> must be placed before the return type to make the method generic!
    public <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

public class Program02 {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Apple", "Banana", "Mango"};
        
        System.out.print("Integer Array: ");
        myPrinter.printArray(intArray);
        
        System.out.print("String Array: ");
        myPrinter.printArray(stringArray);
    }
}
