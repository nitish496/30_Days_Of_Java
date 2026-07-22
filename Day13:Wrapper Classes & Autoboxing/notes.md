Here is the absolute maximum-density, zero-fluff version, refined to the extreme. It is stripped down to pure technical facts and code.

```markdown
# 📅 Day 13 – Wrapper Classes & Autoboxing

✅ Wrapper Classes | ✅ Autoboxing | ✅ Unboxing | ✅ Parsing | ✅ ArrayList Integration

---

# 📖 1. Core Concepts
A **Wrapper Class** wraps a primitive (`int`) into a functional Object (`Integer`).
- **Why?** Collections (`ArrayList`) **only accept Objects**, not primitives.
- **Rule:** Primitives = Stack memory (Fast). Objects = Heap memory (Slower).

### 📦 Quick Reference & Theory
- `int` ➔ `Integer` | `double` ➔ `Double` | `char` ➔ `Character` | `boolean` ➔ `Boolean`
- **Identity:** Primitives are raw data. Wrappers are full Objects.
- **Default Value:** Primitives = `0`. Wrappers = `null`.
- **Methods:** Primitives have zero. Wrappers have tools (`.max()`, `.parseInt()`).

---

# =========================================
# 1. Creating Wrapper Objects
# =========================================
**📝 Syntax:** `Integer a = 100;`
```java
public class Program1 {
    public static void main(String[] args) {
        Integer a = 100; // Best Practice (Direct)
        Integer b = Integer.valueOf(100); // Also good (Memory optimized)
    }
}
```
**💡 Key Points:** Java caches numbers -128 to 127 to save RAM when using `valueOf()`.
**⚠️ Mistake:** `new Integer(100);` is deprecated and wastes memory.

---

# =========================================
# 2. Autoboxing
# =========================================
**🤔 Concept:** Java auto-converts a Primitive ➔ Object.
```java
public class Program2 {
    public static void main(String[] args) {
        int num = 50;
        Integer wrappedNum = num; // Autoboxing!
    }
}
```
**🔍 Explanation:** Java secretly compiles this as `Integer.valueOf(num)`.

---

# =========================================
# 3. Unboxing
# =========================================
**🤔 Concept:** Java auto-extracts an Object ➔ Primitive.
```java
public class Program3 {
    public static void main(String[] args) {
        Integer wrappedNum = 100;
        int rawNum = wrappedNum; // Unboxing!
    }
}
```
**🔍 Explanation:** Java secretly compiles this as `wrappedNum.intValue()`.
**⚠️ Mistake:** Unboxing a `null` wrapper object crashes with a `NullPointerException`.

---

# =========================================
# 4. Parsing Strings into Numbers
# =========================================
**🤔 Concept:** Extracting math numbers from Web Input text.
```java
public class Program4 {
    public static void main(String[] args) {
        int a = Integer.parseInt("100");
        double b = Double.parseDouble("99.9");
        boolean c = Boolean.parseBoolean("true");
    }
}
```
**⚠️ Mistake:** `Integer.parseInt("50A")` crashes with a `NumberFormatException`.

---

# =========================================
# 5. Common Wrapper Methods
# =========================================
**🤔 Concept:** Using pre-built math logic.
```java
public class Program5 {
    public static void main(String[] args) {
        int highest = Integer.max(10, 50); // Returns 50
        double lowest = Double.min(5.5, 9.9); // Returns 5.5
        String text = Integer.valueOf(55).toString(); // "55"
    }
}
```
**💡 Key Points:** `parseInt()` returns a primitive. `valueOf()` returns an Object.

---

# =========================================
# 6. Mini-Calculator & ArrayList
# =========================================
**🎯 Objective:** Combine Parsing, Autoboxing, and ArrayList!
```java
import java.util.ArrayList;
public class Program6 {
    public static void main(String[] args) {
        double p1 = Double.parseDouble("19.99"); // 1. Parsing
        double p2 = Double.parseDouble("5.50");

        ArrayList<Double> cart = new ArrayList<>();
        cart.add(p1); // 2. Autoboxing
        cart.add(p2);

        double sum = 0;
        for (Double price : cart) sum += price; // 3. Unboxing

        double highest = Double.max(p1, p2); // 4. Wrapper Method
        
        System.out.println("Total: $" + sum + " | Max Item: $" + highest);
    }
}
```

---

# 🧠 5 Quick Interview Questions
1. **Base class of numeric wrappers?** `java.lang.Number`.
2. **`parseInt()` vs `valueOf()`?** `parseInt` returns primitive; `valueOf` returns Object.
3. **Are Wrappers mutable?** No. Completely Immutable.
4. **Why isn't Java 100% OOP?** Relies on raw primitives for processing speed.
5. **Parse "Hello" as Boolean?** Safely returns `false` (only exactly `"true"` returns true).

---

# ❓ 5 Practice Questions
1. Create an `Integer` object via direct assignment with value `500`.
2. Parse String `"2024"` into an `int` primitive.
3. Write one line demonstrating Autoboxing.
4. Use `Double.max()` to find the highest of `4.5` and `9.2`.
5. Add a primitive `int` to an `ArrayList<Integer>`.

---

# ⭐ 5 Challenge Programs
1. Ask for two numbers as Strings, parse them, and print their sum.
2. Store 5 primitive `double` prices in `ArrayList<Double>`, find their average.
3. Purposely trigger a `NumberFormatException` and catch it.
4. Purposely trigger a `NullPointerException` via Unboxing.
5. Take binary String (`"1010"`) and use `Integer.parseInt(text, 2)` to convert to base-10!

---

> *"The beautiful thing about learning is that no one can take it away from you." — B.B. King*

---

# 🚀 Next Day Preview: Day 14 – OOP Basics
Tomorrow, you create your OWN Objects!
- **Classes:** The architectural blueprint.
- **Objects:** The actual houses built from the blueprint.
- **Attributes & Methods:** Giving objects data and behaviors.
```