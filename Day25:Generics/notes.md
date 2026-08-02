Here is the updated **GitHub Cheat Sheet** for **Day 25 – Generics**. 

I have expanded every single section so that all 10 programs now feature the **full, standalone, runnable Java code** with the `main` method, just like we did for Days 23 and 24! 

Click **Copy code** and drop it straight into your repository! 🚀✨

```markdown
# 📅 Day 25 – Generics in Java

Welcome to Day 25! 🚀 Today, we learn how to write highly reusable, dynamic, and 100% type-safe code.
Generics allow you to pass Data Types (like `Integer` or `String`) as parameters to your classes and methods! 📦

✅ Generic Classes | ✅ Generic Methods | ✅ Bounded Generics | ✅ Wildcards

---

# 📖 Quick Intro
- **`<T>` (Type Parameter):** Acts as a placeholder for ANY object data type.
- **Type Safety:** The compiler forces you to use the correct data type, preventing runtime crashes!
- **No Primitives:** Generics only work with Objects (`Integer`, `Double`), never primitives (`int`, `double`).
- **Type Erasure:** Generics are secretly deleted by the compiler at runtime for backward compatibility.

---

# =========================================
# 1. The Generic Class 📦
# =========================================
**🎯 Objective:** Write one class that can hold ANY data type safely.
```java
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

public class Program1 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics!");
        System.out.println("Box contains: " + stringBox.get());
        
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("Box contains: " + intBox.get());
    }
}
```

---

# =========================================
# 2. The Generic Method 🛠️
# =========================================
**🎯 Objective:** Write a single method that accepts arrays of any object type!
```java
class Printer {
    // <T> must be placed before the return type to make the method generic!
    public <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

public class Program2 {
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
```

---

# =========================================
# 3. Multiple Type Parameters 👯
# =========================================
**🎯 Objective:** Use more than one generic placeholder (like a Dictionary)!
```java
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

public class Program3 {
    public static void main(String[] args) {
        Pair<String, Integer> studentInfo = new Pair<>("Alice", 95);
        studentInfo.display();
        
        Pair<Integer, String> employeeInfo = new Pair<>(101, "John");
        employeeInfo.display();
    }
}
```

---

# =========================================
# 4. Bounded Generics (Upper Bound) 🚧
# =========================================
**🎯 Objective:** Restrict a generic class to only accept Numbers (no Strings!).
```java
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

public class Program4 {
    public static void main(String[] args) {
        MathBox<Integer> intBox = new MathBox<>(500); // Valid!
        intBox.showData();
        
        MathBox<Double> doubleBox = new MathBox<>(99.99); // Valid!
        doubleBox.showData();
        
        // MathBox<String> strBox = new MathBox<>("Test"); // COMPILE ERROR!
    }
}
```

---

# =========================================
# 5. Unbounded Wildcard `<?>` 🃏
# =========================================
**🎯 Objective:** Pass a List of absolutely ANYTHING into a method.
```java
import java.util.Arrays;
import java.util.List;

public class Program5 {
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
```

---

# =========================================
# 6. Upper Bounded Wildcard `<? extends T>` ⬆️
# =========================================
**🎯 Objective:** Pass a List of a specific class OR its children.
```java
import java.util.Arrays;
import java.util.List;

public class Program6 {
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
```

---

# =========================================
# 7. Lower Bounded Wildcard `<? super T>` ⬇️
# =========================================
**🎯 Objective:** Pass a List of a specific class OR its parents.
```java
import java.util.ArrayList;
import java.util.List;

public class Program7 {
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
```

---

# =========================================
# 8. Generic Interfaces 🔌
# =========================================
**🎯 Objective:** Create an interface that forces generic implementation.
```java
interface Repository<T> {
    void save(T item);
}

// We implement the interface and explicitly state we are using Strings!
class UserRepository implements Repository<String> {
    @Override
    public void save(String user) { 
        System.out.println("User Saved to Database: " + user); 
    }
}

public class Program8 {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();
        repo.save("Admin_Nitish");
    }
}
```

---

# =========================================
# 9. Generic Constructors 🏗️
# =========================================
**🎯 Objective:** A non-generic class can still have a generic constructor!
```java
class DataHolder {
    // The class itself is NOT generic, but the constructor IS!
    public <T> DataHolder(T data) {
        System.out.println("DataHolder was created with: " + data);
    }
}

public class Program9 {
    public static void main(String[] args) {
        DataHolder d1 = new DataHolder(404); // Integer
        DataHolder d2 = new DataHolder("Generic Construction!"); // String
        DataHolder d3 = new DataHolder(99.99); // Double
    }
}
```

---

# =========================================
# 10. Generics in Collections 🎒
# =========================================
**🎯 Objective:** See how Collections rely ENTIRELY on generics to remain type-safe!
```java
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
```

---

# 🧠 5 Quick Interview Questions
1. **What is Type Erasure?** Generics do not exist at runtime! The compiler erases the `<T>` tags and replaces them with `Object` to maintain backward compatibility with old Java versions.
2. **Can you use primitive types in Generics?** No. You must use Wrapper classes (`Integer`, `Double`).
3. **What does `<T extends Number>` mean?** It is an Upper Bound. It restricts the Generic to only accept `Number` or its children.
4. **What is a Wildcard `?` in Generics?** It represents an unknown type, extremely useful when passing generic collections to methods.
5. **Can you instantiate a Generic type (`new T()`)?** No, because at runtime, `T` doesn't exist due to Type Erasure!

---

# 🚀 Next Day Preview: Day 26 – Multithreading
Everything you have written so far in Java has been "Single-Threaded" (executing one line at a time). Tomorrow, we unlock the true power of your computer's CPU: **Multithreading**! You will learn how to split your program into multiple threads that run simultaneously. Get ready to enter the matrix! 🌐🔥
```