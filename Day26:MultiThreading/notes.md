# 📅 Day 26 – Multithreading in Java

Welcome to Day 26! 🚀 Today, we shatter the single-threaded speed limit.
Multithreading allows your Java programs to perform multiple tasks simultaneously, utilizing the full power of your multi-core CPU! ⚙️💻

✅ Thread Class | ✅ Runnable Interface | ✅ Synchronization | ✅ Inter-Thread Communication

---

# 📖 Quick Intro
- **Thread:** A lightweight, independent path of execution.
- **Runnable:** The preferred interface to implement when creating threads.
- **`start()` vs `run()`:** Always use `start()` to spawn a new thread! Calling `run()` just executes normal code on the main thread.
- **Synchronization:** Locking shared resources so threads don't corrupt data by accessing it at the exact same time.

---

# 🗂️ Program Index

| # | Topic | File |
|---|-------|------|
| 1 | Extending `Thread` | `Program01.java` |
| 2 | Implementing `Runnable` | `Program02.java` |
| 3 | Thread via Lambda | `Program03.java` |
| 4 | `Thread.sleep()` | `Program04.java` |
| 5 | `join()` | `Program05.java` |
| 6 | Thread Priorities | `Program06.java` |
| 7 | Race Condition | `Program07.java` |
| 8 | Synchronization | `Program08.java` |
| 9 | Thread States (`isAlive`) | `Program09.java` |
| 10 | Daemon Threads | `Program10.java` |

`Main.java` runs all ten in sequence.

---

# =========================================
# 1. Creating a Thread (Extending `Thread`) 🧵
# =========================================
**🎯 Objective:** Create a thread using the older, inheritance-based method.
📄 `Program01.java`
```java
class MyThread01 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread running via extends Thread.");
    }
}

public class Program01 {
    public static void main(String[] args) throws InterruptedException {
        MyThread01 t1 = new MyThread01();
        t1.start(); // Spawns the new thread!
        t1.join();
    }
}
```

---

# =========================================
# 2. Creating a Thread (`Runnable`) ✅
# =========================================
**🎯 Objective:** The Best Practice! Implement Runnable so your class is free to extend other classes.
📄 `Program02.java`
```java
class MyRunnable02 implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable running via implements Runnable.");
    }
}

public class Program02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t2 = new Thread(new MyRunnable02());
        t2.start(); // Spawns the new thread!
        t2.join();
    }
}
```

---

# =========================================
# 3. Thread via Lambda 🎯
# =========================================
**🎯 Objective:** `Runnable` is a functional interface, so the whole task collapses into one lambda.
📄 `Program03.java`
```java
public class Program03 {
    public static void main(String[] args) throws InterruptedException {
        // No named class needed at all
        Thread t3 = new Thread(() -> System.out.println("Thread running via lambda Runnable."));
        t3.start();
        t3.join();
    }
}
```
> This is the shortest of the three creation styles — compare it with Programs 1 and 2.

---

# =========================================
# 4. Thread Sleep ⏳
# =========================================
**🎯 Objective:** Pause a thread for a specific number of milliseconds.
📄 `Program04.java`
```java
public class Program04 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sleeping for 500ms...");

        long start = System.currentTimeMillis();
        Thread.sleep(500);
        long end = System.currentTimeMillis();

        System.out.println("Woke up after ~" + (end - start) + "ms");
    }
}
```

**💡 Variation — countdown timer:**
```java
System.out.println("Starting countdown...");

for (int i = 3; i > 0; i--) {
    System.out.println(i);
    try {
        Thread.sleep(1000); // Pauses the main thread for 1 second
    } catch (InterruptedException e) {
        System.out.println("Thread was interrupted!");
    }
}

System.out.println("Countdown complete!");
```

---

# =========================================
# 5. Thread Join 🤝
# =========================================
**🎯 Objective:** Force the Main thread to wait until a worker thread finishes before continuing.
📄 `Program05.java`
```java
public class Program05 {
    public static void main(String[] args) throws InterruptedException {
        Thread t5 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("t5 working: " + i);
            }
        });

        t5.start();
        t5.join(); // Main thread FREEZES here until 't5' dies
        System.out.println("t5 finished, main thread continues.");
    }
}
```

---

# =========================================
# 6. Thread Priorities 🥇
# =========================================
**🎯 Objective:** Suggest to the JVM which thread is more important (1 to 10).
📄 `Program06.java`
```java
public class Program06 {
    public static void main(String[] args) throws InterruptedException {
        Thread low = new Thread(() -> System.out.println("Low priority thread running."));
        Thread high = new Thread(() -> System.out.println("High priority thread running."));

        // Suggest priority to the Thread Scheduler
        low.setPriority(Thread.MIN_PRIORITY);  // 1
        high.setPriority(Thread.MAX_PRIORITY); // 10

        System.out.println("Low priority value: " + low.getPriority());
        System.out.println("High priority value: " + high.getPriority());

        low.start();
        high.start();
        low.join();
        high.join();
    }
}
```
> ⚠️ Priority is only a *hint*. The scheduler is free to ignore it, so never rely on it for correctness.

---

# =========================================
# 7. Race Condition (The Problem) 🏎️
# =========================================
**🎯 Objective:** See what happens when multiple threads edit the same variable at the exact same time without locks!
📄 `Program07.java`
```java
class Counter07 {
    private int count = 0;

    // UNSAFE! count++ is read-modify-write, not atomic.
    public void increment() { count++; }

    public int getCount() { return count; }
}

public class Program07 {
    public static void main(String[] args) throws InterruptedException {
        Counter07 unsafe = new Counter07();

        Runnable unsafeTask = () -> {
            for (int i = 0; i < 10000; i++) unsafe.increment();
        };

        Thread u1 = new Thread(unsafeTask);
        Thread u2 = new Thread(unsafeTask);
        u1.start();
        u2.start();
        u1.join();
        u2.join();

        // Expected 20000, but will be lower due to lost updates!
        System.out.println("Expected: 20000, Actual: " + unsafe.getCount());
    }
}
```
> A real run of this printed **10937** — nearly half the increments vanished. The number changes every run.

---

# =========================================
# 8. Synchronization (The Solution) 🔒
# =========================================
**🎯 Objective:** Force threads to form a single-file line to access the method.
📄 `Program08.java`
```java
class SafeCounter08 {
    private int count = 0;

    // SAFE! Only one thread can enter at a time.
    public synchronized void increment() { count++; }

    public int getCount() { return count; }
}

public class Program08 {
    public static void main(String[] args) throws InterruptedException {
        SafeCounter08 safe = new SafeCounter08();

        Runnable safeTask = () -> {
            for (int i = 0; i < 10000; i++) safe.increment();
        };

        Thread s1 = new Thread(safeTask);
        Thread s2 = new Thread(safeTask);
        s1.start();
        s2.start();
        s1.join();
        s2.join();

        // Guaranteed to be exactly 20000 every single time!
        System.out.println("Expected: 20000, Actual: " + safe.getCount());
    }
}
```

---

# =========================================
# 9. Thread States (`isAlive`) 🚦
# =========================================
**🎯 Objective:** Observe a thread move through its lifecycle: NEW → RUNNABLE → TERMINATED.
📄 `Program09.java`
```java
public class Program09 {
    public static void main(String[] args) throws InterruptedException {
        Thread t9 = new Thread(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        System.out.println("Before start - isAlive: " + t9.isAlive()); // false (NEW)
        t9.start();
        System.out.println("After start  - isAlive: " + t9.isAlive()); // true  (RUNNABLE)
        t9.join();
        System.out.println("After join   - isAlive: " + t9.isAlive()); // false (TERMINATED)
    }
}
```
> A thread cannot be restarted. Calling `start()` twice throws `IllegalThreadStateException`.

---

# =========================================
# 10. Daemon Threads 👻
# =========================================
**🎯 Objective:** Create a low-priority background thread that dies automatically when the app closes.
📄 `Program10.java`
```java
public class Program10 {
    public static void main(String[] args) throws InterruptedException {
        Thread daemon = new Thread(() -> System.out.println("Daemon thread running (background task)."));

        // Must be set BEFORE start()!
        daemon.setDaemon(true);
        System.out.println("Is daemon? " + daemon.isDaemon());

        daemon.start();
        daemon.join();
    }
}
```

**💡 Variation — endless background worker:**
```java
Thread daemon = new Thread(() -> {
    while (true) {
        System.out.println("Daemon running in background...");
        try { Thread.sleep(500); } catch (Exception e) {}
    }
});

daemon.setDaemon(true); // Won't stop the program from exiting!
daemon.start();

try { Thread.sleep(1200); } catch (Exception e) {}
System.out.println("Main thread shutting down. Daemon will be killed instantly.");
```

---

# 🎁 Bonus Topics (no program file yet)

These two go beyond the ten programs above — worth knowing, and good candidates to turn into code later.

## Inter-Thread Communication 🗣️
**🎯 Objective:** Use `wait()` and `notify()` to make threads talk to each other.
```java
class Bakery {
    boolean breadReady = false;

    public synchronized void eatBread() {
        while (!breadReady) {
            try { wait(); } catch (InterruptedException e) {} // Drops lock & sleeps
        }
        System.out.println("Customer: Bread eaten!");
    }

    public synchronized void bakeBread() {
        System.out.println("Baker: Baking bread...");
        breadReady = true;
        notify(); // Wakes up the sleeping Customer thread!
    }
}

public class BakeryDemo {
    public static void main(String[] args) {
        Bakery shop = new Bakery();

        Thread customer = new Thread(() -> shop.eatBread());
        Thread baker = new Thread(() -> {
            try { Thread.sleep(1000); } catch (Exception e) {}
            shop.bakeBread();
        });

        customer.start();
        baker.start();
    }
}
```

## ExecutorService (Thread Pools) 🏊‍♂️
**🎯 Objective:** Stop managing threads manually. Use a pool of recycled threads for massive performance!
```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolDemo {
    public static void main(String[] args) {
        // Creates a pool with exactly 2 reusable threads
        ExecutorService pool = Executors.newFixedThreadPool(2);

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " is processing a task.");
        };

        // Submit 4 tasks to a 2-thread pool.
        // Threads will recycle to handle the backlog!
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);

        // Critical step to prevent memory leaks!
        pool.shutdown();
    }
}
```

---

# 🧠 5 Quick Interview Questions
1. **Difference between `Process` and `Thread`?** A process is a heavy executing application (like Chrome). A thread is a lightweight path of execution inside that process (like downloading a file).
2. **Why prefer `Runnable` over `Thread`?** Java doesn't support multiple inheritance. If you extend `Thread`, you can't extend anything else.
3. **Difference between `start()` and `run()`?** `start()` spawns a new thread. `run()` just executes the code on the current main thread (no multithreading happens!).
4. **What is a Race Condition?** A bug that occurs when multiple threads try to read/write shared data at the exact same time without locks.
5. **Difference between `sleep()` and `wait()`?** `sleep()` pauses the thread but KEEPS the lock. `wait()` pauses the thread and DROPS the lock so others can use it.

---

# 🚀 Next Day Preview: Day 27 – Java 8 Features
Multithreading makes your code fast, but what makes your code *beautiful*? Tomorrow, we dive into the modern era of Java. You will learn **Lambda Expressions `()->{}`**, the incredible **Stream API**, and how to write 10 lines of code in just 1 single line! Get ready to write code like a senior architect! 🌟🔥
