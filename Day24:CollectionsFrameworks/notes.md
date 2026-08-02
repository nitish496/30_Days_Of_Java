Here is the ultra-refined, high-density **GitHub Cheat Sheet** version for **Day 24 – Collections Framework**.

This is formatted exactly the way you like it—mapped perfectly to your 4 programs (List + Set implementations, one class per file), with all the fluff removed and the code front-and-center!

Click **Copy code** and drop it straight into your repository! 🚀✨

```markdown
# 📅 Day 24 – Java Collections Framework (List & Set)

Welcome to Day 24! 🚀 Say goodbye to fixed-size arrays forever!
Today we unlock the `java.util` package and meet the Collections Framework — dynamic, resizable, ready-to-use data structures that grow and shrink exactly when you need them to. We split the day into two families: **List** (ordered, allows duplicates) and **Set** (no duplicates allowed). Each Set implementation now lives in its own standalone file, one class per file. 📦

✅ ArrayList | ✅ LinkedList | ✅ Vector | ✅ HashSet | ✅ LinkedHashSet | ✅ TreeSet

---

# 📖 Quick Intro
- 📦 **java.util Package:** Import this to unlock every Collection interface and class.
- 📃 **List Interface:** An ordered collection that keeps insertion order and happily allows duplicate values.
- 🔗 **Set Interface:** A collection that guarantees **no duplicate elements** — add the same value twice and it's silently ignored.
- 🧵 **Vector:** The old-school, thread-safe cousin of ArrayList — synchronized, so it's safe (but slower) in multi-threaded code.
- 🌲 **TreeSet:** A Set that automatically sorts its elements for you — no manual sorting required!

---

# =========================================
# 1. ArrayList 📃 (`ListDemo.java`)
# =========================================
**🎯 Objective:** Store an ordered, resizable list of Strings using the most commonly used List implementation.
```java
import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> arraylist = new ArrayList<>();
        arraylist.add("cat");
        arraylist.add("dog");
        arraylist.add("chicken");
        System.out.println("arraylist:" + arraylist);
    }
}
```

---

# =========================================
# 2. LinkedList 🔗 (`ListDemo.java`)
# =========================================
**🎯 Objective:** Store an ordered list of Strings using a doubly-linked-list-backed structure, great for fast insertions and deletions.
```java
import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> linkList = new LinkedList<>();
        linkList.add("king");
        linkList.add("queen");
        linkList.add("prince");
        System.out.println("linkedlist:" + linkList);
    }
}
```

---

# =========================================
# 3. Vector 🧵 (`ListDemo.java`)
# =========================================
**🎯 Objective:** Store an ordered list of Integers using the synchronized, thread-safe List implementation.
```java
import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        System.out.println("Vector: " + vector);
    }
}
```
> 📌 Note: `ArrayList`, `LinkedList`, and `Vector` are all demonstrated together inside the single `ListDemo.java` file — only the Set implementations were split out into their own standalone files below.

---

# =========================================
# 4. HashSet 🎲 (`HashSetDemo.java`)
# =========================================
**🎯 Objective:** Store unique Strings with zero regard for order, and watch duplicates get automatically rejected.
```java
import java.util.*;

public class HashSetDemo {
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
# 5. LinkedHashSet 🔗🎲 (`LinkedHashSetDemo.java`)
# =========================================
**🎯 Objective:** Store unique Strings while preserving the exact order in which they were inserted.
```java
import java.util.*;

public class LinkedHashSetDemo {
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
# 6. TreeSet 🌲 (`TreeSetDemo.java`)
# =========================================
**🎯 Objective:** Store unique Integers that get automatically sorted in ascending order.
```java
import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        System.out.println("TreeSet: " + treeSet);
    }
}
```

---

# 🧠 5 Quick Interview Questions
1. **What's the core difference between a List and a Set?** `List` keeps insertion order and allows duplicate elements; `Set` guarantees every element is unique.
2. **Why would you pick a LinkedList over an ArrayList?** `LinkedList` is faster for frequent insertions/deletions in the middle, while `ArrayList` is faster for random-access reads via index.
3. **Why is Vector considered "legacy" today?** Every method in `Vector` is synchronized, which adds performance overhead even in single-threaded programs — most developers now prefer `ArrayList` and add synchronization manually only when needed.
4. **How does HashSet decide something is a "duplicate"?** It uses the object's `hashCode()` and `equals()` methods to check if an equivalent value already exists before inserting.
5. **Which Set implementation would you use if you need both uniqueness AND sorted order?** `TreeSet` — it stores unique elements and automatically sorts them using natural ordering (or a custom `Comparator`).

---

# ❓ 5 Practice Questions
1. 📝 Create an `ArrayList<String>` of your 5 favorite movies and print it.
2. 💻 Build a `LinkedList<Integer>` of 10 numbers, then remove the first and last elements.
3. 🛑 Add 5 elements to a `Vector<String>` and loop through it using a standard `for` loop with `.get(i)`.
4. 🦸‍♂️ Create a `HashSet<String>` of usernames, deliberately add 3 duplicates, and print the final size.
5. 🔀 Insert 6 random Integers into a `TreeSet` and print the smallest and largest using `.first()` and `.last()`.

---

# ⭐ 5 Challenge Programs
1. 🏦 **Duplicate Remover:** Take an `ArrayList` full of duplicate values and convert it into a `HashSet` to instantly clean it up, then convert it back to a List.
2. 📖 **Unique Word Counter:** Read a sentence, split it into words, and use a `HashSet` to count how many unique words it contains.
3. 📋 **Student Queue Manager:** Use a `LinkedList` as a queue — add students to the back and process (remove) them from the front.
4. 💥 **Leaderboard Builder:** Use a `TreeSet<Integer>` to store player scores and print them from highest to lowest.
5. 🤫 **Login History Tracker:** Use a `LinkedHashSet<String>` to record unique login timestamps in the exact order users logged in.

---

> *"Arrays are fixed. Collections adapt."* 📦

---

# 🚀 Next Day Preview: Day 25 – Generics
You've been writing `List<String>` and `Set<Integer>` all day — those angle brackets `<>` aren't magic, they're **Generics**! 🔍
Tomorrow, we peel back the curtain and learn how to write our own generic classes and methods, letting a single piece of code work safely with any data type while catching type errors at compile time instead of runtime. Get ready to type-proof your Java! 🚀🔥
```
