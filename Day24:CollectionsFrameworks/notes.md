# 📅 Day 24 – Java Collections Framework

Welcome to Day 24! 🚀 Say goodbye to fixed-size arrays forever!
Today we unlock the `java.util` package and meet the Collections Framework — dynamic, resizable, ready-to-use data structures that grow and shrink exactly when you need them to. We tour all four families: **List** (ordered, duplicates allowed), **Set** (uniqueness enforced), **Queue** (priority/processing order) and **Map** (key → value pairs). 📦

✅ ArrayList | ✅ LinkedList | ✅ Vector | ✅ Stack | ✅ HashSet | ✅ LinkedHashSet | ✅ TreeSet | ✅ PriorityQueue | ✅ HashMap | ✅ LinkedHashMap | ✅ TreeMap

---

# 📖 Quick Intro
- 📦 **java.util Package:** Import this to unlock every Collection interface and class.
- 📃 **List Interface:** An ordered collection that keeps insertion order and happily allows duplicate values. (`ArrayList`, `LinkedList`, `Vector`, `Stack`)
- 🔗 **Set Interface:** A collection that guarantees **no duplicate elements** — add the same value twice and it's silently ignored. (`HashSet`, `LinkedHashSet`, `TreeSet`)
- 🎟️ **Queue Interface:** A collection built for processing elements in a specific order. `PriorityQueue` always serves the *smallest* element first, no matter the insertion order.
- 🗺️ **Map Interface:** Stores data as **key → value** pairs. Keys are unique; values can repeat. (`HashMap`, `LinkedHashMap`, `TreeMap`)
- 🧵 **Vector & Stack:** The old-school, thread-safe cousins of ArrayList — synchronized, so they're safe (but slower) in multi-threaded code.
- 🌲 **TreeSet / TreeMap:** Auto-sorting structures — elements (or keys) are kept in natural order for you, no manual sorting required!

---

# =========================================
# 1. ArrayList 📃
# =========================================
**🎯 Objective:** Store an ordered, resizable list of Strings using the most commonly used List implementation.
```java
import java.util.*;

public class Program01 {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        System.out.println("ArrayList: " + arrayList);
    }
}
```

---

# =========================================
# 2. LinkedList 🔗
# =========================================
**🎯 Objective:** Build a doubly-linked list and insert an element at the front using the two-argument `add(index, element)` method.
```java
import java.util.*;

public class Program02 {

    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add(0, "Elephant"); // insert at front
        System.out.println("LinkedList: " + linkedList);
    }
}
```

---

# =========================================
# 3. Vector 🧵
# =========================================
**🎯 Objective:** Store an ordered list of Integers using the synchronized, thread-safe List implementation.
```java
import java.util.*;

public class Program03 {

    public static void main(String[] args) {

        List<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        System.out.println("Vector: " + vector);
    }
}
```

---

# =========================================
# 4. Stack 🥞
# =========================================
**🎯 Objective:** Use the LIFO (Last-In-First-Out) structure — `push()` items on top and `pop()` the most recent one off.
```java
import java.util.*;

public class Program04 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
```

---

# =========================================
# 5. HashSet 🎲
# =========================================
**🎯 Objective:** Store unique Strings with zero regard for order, and watch duplicates get automatically rejected.
```java
import java.util.*;

public class Program05 {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Red"); // duplicate, ignored
        System.out.println("HashSet: " + hashSet);
    }
}
```

---

# =========================================
# 6. LinkedHashSet 🔗🎲
# =========================================
**🎯 Objective:** Store unique Strings while preserving the exact order in which they were inserted.
```java
import java.util.*;

public class Program06 {

    public static void main(String[] args) {

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Red");
        linkedHashSet.add("Green");
        linkedHashSet.add("Blue");
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
```

---

# =========================================
# 7. TreeSet 🌲
# =========================================
**🎯 Objective:** Store unique Integers that get automatically sorted in ascending order.
```java
import java.util.*;

public class Program07 {

    public static void main(String[] args) {

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        System.out.println("TreeSet (sorted): " + treeSet);
    }
}
```

---

# =========================================
# 8. PriorityQueue 🎟️
# =========================================
**🎯 Objective:** Add numbers in random order and `poll()` them back out smallest-first, proving the queue reorders by priority.
```java
import java.util.*;

public class Program08 {

    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        System.out.print("Polling in priority order: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
    }
}
```

---

# =========================================
# 9. HashMap & LinkedHashMap 🗺️
# =========================================
**🎯 Objective:** Store key → value pairs two ways — `HashMap` (no order guarantee) vs `LinkedHashMap` (insertion order preserved).
```java
import java.util.*;

public class Program09 {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 90);
        hashMap.put("Bob", 85);
        hashMap.put("Charlie", 95);
        System.out.println("HashMap: " + hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Alice", 90);
        linkedHashMap.put("Bob", 85);
        linkedHashMap.put("Charlie", 95);
        System.out.println("LinkedHashMap: " + linkedHashMap);
    }
}
```

---

# =========================================
# 10. TreeMap & entrySet Iteration 🌲🗺️
# =========================================
**🎯 Objective:** Auto-sort a Map by its keys with `TreeMap`, then loop through every key → value pair using `entrySet()`.
```java
import java.util.*;

public class Program10 {

    public static void main(String[] args) {

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Charlie", 95);
        treeMap.put("Alice", 90);
        treeMap.put("Bob", 85);
        System.out.println("TreeMap (sorted by key): " + treeMap);

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 90);
        hashMap.put("Bob", 85);
        hashMap.put("Charlie", 95);

        System.out.println("Iterating HashMap entries:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
```

---

# 🧠 5 Quick Interview Questions
1. **What's the core difference between a List, a Set, and a Map?** `List` keeps insertion order and allows duplicates; `Set` guarantees every element is unique; `Map` stores unique **keys** each mapped to a value.
2. **Why would you pick a LinkedList over an ArrayList?** `LinkedList` is faster for frequent insertions/deletions (like `add(0, ...)` at the front), while `ArrayList` is faster for random-access reads via index.
3. **Why are Vector and Stack considered "legacy" today?** Every method is synchronized, which adds performance overhead even in single-threaded programs — modern code prefers `ArrayList` and `ArrayDeque`.
4. **How does a PriorityQueue decide what comes out first?** It keeps elements in a heap ordered by natural ordering (or a custom `Comparator`), so `poll()` always returns the smallest/highest-priority element — **not** the first one inserted.
5. **Which Map would you use if you need keys in sorted order?** `TreeMap` — it sorts by key automatically. Use `LinkedHashMap` if you instead want insertion order, and `HashMap` when order doesn't matter at all (fastest).

---

# ❓ 5 Practice Questions
1. 📝 Create an `ArrayList<String>` of your 5 favorite movies and print it.
2. 💻 Build a `LinkedList<Integer>` of 10 numbers, then remove the first and last elements.
3. 🛑 Push 5 elements onto a `Stack<String>` and pop them all off, printing each one.
4. 🦸‍♂️ Create a `HashSet<String>` of usernames, deliberately add 3 duplicates, and print the final size.
5. 🔀 Build a `HashMap<String, Integer>` of 5 students and their marks, then print all pairs using `entrySet()`.

---

# ⭐ 5 Challenge Programs
1. 🏦 **Duplicate Remover:** Take an `ArrayList` full of duplicate values and convert it into a `HashSet` to instantly clean it up, then convert it back to a List.
2. 📖 **Word Frequency Counter:** Read a sentence, split it into words, and use a `HashMap<String, Integer>` to count how many times each word appears.
3. 📋 **Undo Manager:** Use a `Stack<String>` to record user actions and pop them off one by one to "undo" them.
4. 💥 **Hospital Triage System:** Use a `PriorityQueue` to store patients by severity score and serve the most urgent one first.
5. 🤫 **Phone Book:** Use a `TreeMap<String, String>` to store names and phone numbers so they're always printed alphabetically.

---

> *"Arrays are fixed. Collections adapt."* 📦

---

# 🚀 Next Day Preview: Day 25 – Generics
You've been writing `List<String>`, `Set<Integer>` and `Map<String, Integer>` all day — those angle brackets `<>` aren't magic, they're **Generics**! 🔍
Tomorrow, we peel back the curtain and learn how to write our own generic classes and methods, letting a single piece of code work safely with any data type while catching type errors at compile time instead of runtime. Get ready to type-proof your Java! 🚀🔥
