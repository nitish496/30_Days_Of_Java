Here is the ultimate, lightning-fast, zero-fluff version for Day 12 in the exact "cheat-sheet" style you love. You can easily click **Copy code** below and paste it straight into your repository!

```markdown
# 📅 Day 12 – ArrayList

Welcome to Day 12! Standard arrays have a massive flaw: **Fixed Size**. Today, we unlock dynamic memory using **ArrayList**, a built-in Java data structure that automatically grows and shrinks!
✅ Create | ✅ `add()` | ✅ `get()` | ✅ `set()` | ✅ `remove()` | ✅ `contains()` | ✅ `size()`

---

# 📖 Quick Intro
An **ArrayList** is a resizable, dynamic array from the Java Collections Framework. 
- **Why use it?** Perfect for dynamic data like Shopping Carts, Contact Lists, and active Users.
- **Structure:** `ArrayList<String> list = new ArrayList<>();`
- **Rule:** Can **only** store Objects (`Integer`, `String`). Cannot store primitives (`int`, `double`).

---

# 📊 Array vs ArrayList
| Feature | `Array` (Standard) | `ArrayList` (Dynamic) |
| :--- | :--- | :--- |
| **Size** | Fixed (Static). | Dynamic (Grows/Shrinks). |
| **Data Types** | Primitives and Objects. | **Objects ONLY** (Use Wrapper Classes). |
| **Syntax** | `int[] arr = new int[5];` | `ArrayList<Integer> list = new ArrayList<>();` |
| **Updating** | `arr[0] = 10;` | `list.set(0, 10);` |
| **Reading** | `arr[0]` | `list.get(0);` |
| **Size Property**| `arr.length` | `list.size()` |

---

# 🧠 Wrapper Classes
To store numbers in an ArrayList, Java auto-converts primitives into Wrapper Classes (Autoboxing).
- `int` ➔ `Integer`
- `double` ➔ `Double`
- `char` ➔ `Character`
- `boolean` ➔ `Boolean`

---

# =========================================
# 1. Create and Add: `add()`
# =========================================
**🎯 Objective:** Append to the end. | **🤔 Concept:** Dynamic growth. | **📝 Syntax:** `list.add(val);`
```java
import java.util.ArrayList;
public class Program1 {
    public static void main(String[] args) {
        ArrayList<String> guests = new ArrayList<>();
        guests.add("Alice");
        guests.add("Bob");
        System.out.println("List: " + guests);
    }
}
```
**🖥 Output:** `List: [Alice, Bob]`
**🔍 Explanation:** Appends items sequentially. Printing the variable nicely formats it.
**⚠️ Mistake:** `ArrayList<string>` (Lowercase 's'). Must be capitalized `String`.

---

# =========================================
# 2. Access Elements: `get()`
# =========================================
**🎯 Objective:** Retrieve by index. | **🤔 Concept:** Zero-indexed access. | **📝 Syntax:** `list.get(0);`
```java
import java.util.ArrayList;
public class Program2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red"); colors.add("Blue");
        System.out.println("First color: " + colors.get(0));
    }
}
```
**🖥 Output:** `First color: Red`
**💡 Key Points:** First element is `get(0)`. Last element is `get(size() - 1)`.
**⚠️ Mistake:** `colors[0]`. You cannot use bracket notation on Collections.

---

# =========================================
# 3. Update Elements: `set()`
# =========================================
**🎯 Objective:** Replace data. | **🤔 Concept:** Overwrites specific index. | **📝 Syntax:** `list.set(idx, val);`
```java
import java.util.ArrayList;
public class Program3 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(50); scores.add(60);
        scores.set(1, 99); // Updates index 1
        System.out.println("Scores: " + scores);
    }
}
```
**🖥 Output:** `Scores: [50, 99]`
**🔍 Explanation:** Replaces `60` with `99`. Does not change total list size.
**⚠️ Mistake:** `list.set(5, 10)` when size is only 2 (IndexOutOfBounds error).

---

# =========================================
# 4. Delete Elements: `remove()`
# =========================================
**🎯 Objective:** Delete data. | **🤔 Concept:** Auto-shifts elements left. | **📝 Syntax:** `list.remove(idx);`
```java
import java.util.ArrayList;
public class Program4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple"); fruits.add("Banana"); fruits.add("Mango");
        fruits.remove(1); // Deletes Banana
        System.out.println("List: " + fruits);
    }
}
```
**🖥 Output:** `List: [Apple, Mango]`
**🔍 Explanation:** "Mango" dynamically shifts from index 2 to index 1.
**💡 Key Points:** Auto-shifting prevents empty "holes" in your data.

---

# =========================================
# 5. Check Existence: `contains()`
# =========================================
**🎯 Objective:** Search list. | **🤔 Concept:** Returns boolean. | **📝 Syntax:** `list.contains(val);`
```java
import java.util.ArrayList;
public class Program5 {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<>();
        users.add("admin");
        System.out.println("Has admin? " + users.contains("admin"));
        System.out.println("Has root? " + users.contains("root"));
    }
}
```
**🖥 Output:** `Has admin? true` | `Has root? false`
**💡 Key Points:** Strictly case-sensitive ("Admin" != "admin").
**⚠️ Mistake:** Writing manual loops to search for simple strings instead of using `contains()`.

---

# =========================================
# 6. Find Size: `size()`
# =========================================
**🎯 Objective:** Get element count. | **🤔 Concept:** Actual data count. | **📝 Syntax:** `list.size();`
```java
import java.util.ArrayList;
public class Program6 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Tesla"); cars.add("Ford");
        System.out.println("Total cars: " + cars.size());
    }
}
```
**🖥 Output:** `Total cars: 2`
**⚠️ Mistake:** `cars.length`. Use `.size()` (with parentheses) for ArrayLists!

---

# =========================================
# 7 & 8. Iterating Arrays
# =========================================
**🎯 Objective:** Loop through data. | **🤔 Concept:** Standard `for` vs Enhanced `for`.
```java
import java.util.ArrayList;
public class Program7 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Tokyo"); cities.add("Paris");
        
        // 1. Standard Loop (When you need index 'i')
        for (int i = 0; i < cities.size(); i++) {
            System.out.println("City " + i + ": " + cities.get(i));
        }
        
        // 2. Enhanced Loop (Cleanest and Safest!)
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
```
**💡 Key Points:** Enhanced loop completely prevents `IndexOutOfBoundsException`.

---

# =========================================
# 9. Storing Wrapper Classes
# =========================================
**🎯 Objective:** Store primitives. | **🤔 Concept:** Autoboxing.
```java
import java.util.ArrayList;
public class Program9 {
    public static void main(String[] args) {
        ArrayList<Double> gpas = new ArrayList<>();
        gpas.add(3.5); gpas.add(4.0); // Primitives auto-wrapped
        
        double sum = 0.0;
        for (Double gpa : gpas) sum += gpa; // Auto-unwrapped!
        System.out.println("Average: " + (sum / gpas.size()));
    }
}
```
**💡 Key Points:** Generics `< >` only accept Classes (`Integer`, `Double`).

---

# =========================================
# 10. Mini-Project: Interactive To-Do List
# =========================================
**🎯 Objective:** Interactive CLI app using all methods.
```java
import java.util.ArrayList;
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("1.View | 2.Add | 3.Remove | 4.Exit: ");
            int choice = sc.nextInt(); sc.nextLine();
            
            if (choice == 1) {
                for (int i = 0; i < tasks.size(); i++) System.out.println(i + ": " + tasks.get(i));
            } else if (choice == 2) {
                System.out.print("Task: ");
                tasks.add(sc.nextLine());
            } else if (choice == 3) {
                System.out.print("Index to remove: ");
                int i = sc.nextInt();
                if (i >= 0 && i < tasks.size()) tasks.remove(i);
            } else if (choice == 4) {
                break;
            }
        }
    }
}
```

---

# 🧠 5 Quick Interview Questions
1. **Array vs ArrayList?** Fixed size vs Dynamic size. Primitives vs Objects.
2. **Initial capacity of ArrayList?** Default is 10.
3. **Can it hold duplicates?** Yes, lists allow duplicates and `null` values.
4. **How does it grow?** Creates a new array 50% larger, copies data, deletes old array.
5. **How to sort it?** Use `Collections.sort(listName);`.

---

# ❓ 5 Practice Questions
1. Create an `ArrayList<Integer>` and add numbers 1, 2, 3.
2. Replace the first element of your list with `99`.
3. Check if your list contains the number `50`.
4. Iterate through a list using an Enhanced `for` loop.
5. Add user input to a list in a `while` loop until they type "STOP".

---

# ⭐ 5 Challenge Programs
1. Find the highest number inside an `ArrayList<Integer>`.
2. Transfer all elements from ArrayList A into ArrayList B.
3. Remove all duplicate elements from an ArrayList.
4. Reverse an ArrayList entirely.
5. Merge two sorted ArrayLists into a single sorted list.

---

> *"Programming isn't about what you know; it's about what you can figure out."*

---

# 🚀 Next Day Preview: Day 13 – Wrapper Classes
Today you saw we had to use `Integer` instead of `int`. Tomorrow we explore why!
- **Autoboxing:** How Java automatically wraps primitives into Objects.
- **Unboxing:** How Java unwraps Objects back into primitives.
- Primitive vs Wrapper Classes: When to use which!
```