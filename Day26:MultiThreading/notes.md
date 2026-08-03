
```markdown
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

# =========================================
# 1. Creating a Thread (Extending `Thread`) 🧵
# =========================================
**🎯 Objective:** Create a thread using the older, inheritance-based method.
```java
class MyThread extends Thread {
    @Override
    public void run() { 
        System.out.println("Thread is running natively!"); 
    }
}

public class Program1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // Spawns the new thread!
    }
}
```

---

# =========================================
# 2. Creating a Thread (`Runnable`) ✅
# =========================================
**🎯 Objective:** The Best Practice! Implement Runnable so your class is free to extend other classes.
```java
class MyRunnable implements Runnable {
    @Override
    public void run() { 
        System.out.println("Runnable thread is executing!"); 
    }
}

public class Program2 {
    public static void main(String[] args) {
        MyRunnable task = new MyRunnable();
        Thread t1 = new Thread(task);
        t1.start(); // Spawns the new thread!
    }
}
```

---

# =========================================
# 3. Thread Sleep ⏳
# =========================================
**🎯 Objective:** Pause a thread for a specific number of milliseconds.
```java
public class Program3 {
    public static void main(String[] args) {
        System.out.println("Starting countdown...");
        
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            try {
                // Pauses the main thread for 1 second (1000ms)
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            }
        }
        
        System.out.println("Countdown complete!");
    }
}
```

---

# =========================================
# 4. Thread Join 🤝
# =========================================
**🎯 Objective:** Force the Main thread to wait until Thread A finishes before continuing.
```java
public class Program4 {
    public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            try { 
                Thread.sleep(2000); 
                System.out.println("Worker thread finished its heavy task.");
            } catch (InterruptedException e) {}
        });

        worker.start();
        
        try {
            System.out.println("Main thread is waiting for worker...");
            worker.join(); // Main thread FREEZES here until 'worker' dies
        } catch (InterruptedException e) {}
        
        System.out.println("Main thread resumes! Worker is completely done.");
    }
}
```

---

# =========================================
# 5. Thread Priorities 🥇
# =========================================
**🎯 Objective:** Suggest to the JVM which thread is more important (1 to 10).
```java
public class Program5 {
    public static void main(String[] args) {
        Thread tLow = new Thread(() -> System.out.println("Low Priority executed"));
        Thread tHigh = new Thread(() -> System.out.println("High Priority executed"));
        
        // Suggest priority to the Thread Scheduler
        tLow.setPriority(Thread.MIN_PRIORITY); // 1
        tHigh.setPriority(Thread.MAX_PRIORITY); // 10
        
        tLow.start();
        tHigh.start();
    }
}
```

---

# =========================================
# 6. Race Condition (The Problem) 🏎️
# =========================================
**🎯 Objective:** See what happens when multiple threads edit the same variable at the exact same time without locks!
```java
class UnsafeCounter {
    int count = 0;
    
    // UNSAFE! Threads will overwrite each other's work!
    public void increment() { 
        count++; 
    }
}

public class Program6 {
    public static void main(String[] args) {
        UnsafeCounter counter = new UnsafeCounter();
        
        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) counter.increment();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        
        t1.start();
        t2.start();
        
        try { t1.join(); t2.join(); } catch (Exception e) {}
        
        // Expected 20000, but will likely be much lower due to Race Conditions!
        System.out.println("Final Count (Corrupted): " + counter.count);
    }
}
```

---

# =========================================
# 7. Synchronization (The Solution) 🔒
# =========================================
**🎯 Objective:** Force threads to form a single-file line to access the method.
```java
class SafeCounter {
    int count = 0;
    
    // SAFE! Only one thread can enter at a time.
    public synchronized void increment() { 
        count++; 
    }
}

public class Program7 {
    public static void main(String[] args) {
        SafeCounter counter = new SafeCounter();
        
        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) counter.increment();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        
        t1.start();
        t2.start();
        
        try { t1.join(); t2.join(); } catch (Exception e) {}
        
        // Guaranteed to be exactly 20000 every single time!
        System.out.println("Final Count (Safe): " + counter.count);
    }
}
```

---

# =========================================
# 8. Inter-Thread Communication 🗣️
# =========================================
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

public class Program8 {
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

---

# =========================================
# 9. Daemon Threads 👻
# =========================================
**🎯 Objective:** Create a low-priority background thread that dies automatically when the app closes.
```java
public class Program9 {
    public static void main(String[] args) {
        Thread daemon = new Thread(() -> {
            while (true) {
                System.out.println("Daemon running in background...");
                try { Thread.sleep(500); } catch (Exception e){}
            }
        });
        
        // Must be set BEFORE start()!
        // Because it is a Daemon, it will not stop the program from exiting!
        daemon.setDaemon(true); 
        daemon.start();
        
        try { Thread.sleep(1200); } catch (Exception e){}
        System.out.println("Main thread shutting down. Daemon will be killed instantly.");
    }
}
```

---

# =========================================
# 10. ExecutorService (Thread Pools) 🏊‍♂️
# =========================================
**🎯 Objective:** Stop managing threads manually. Use a pool of recycled threads for massive performance!
```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program10 {
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
```