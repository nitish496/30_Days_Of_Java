// =========================================
// Day 26 - Multithreading
// Programs 1 to 10
// =========================================

// ---- Program 1 - Extending Thread ----
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread running via extends Thread.");
    }
}

// ---- Program 2 - Implementing Runnable ----
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable running via implements Runnable.");
    }
}

// ---- Program 7 - Unsafe counter (race condition) ----
class Counter {
    private int count = 0;
    public void increment() { count++; }
    public int getCount() { return count; }
}

// ---- Program 8 - Safe counter (synchronized) ----
class SafeCounter {
    private int count = 0;
    public synchronized void increment() { count++; }
    public int getCount() { return count; }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // =========================================
        // Program 1 - Extending Thread
        // =========================================
        System.out.println("===== Program 1 - Extending Thread =====");
        MyThread t1 = new MyThread();
        t1.start();
        t1.join();
        System.out.println();

        // =========================================
        // Program 2 - Implementing Runnable
        // =========================================
        System.out.println("===== Program 2 - Implementing Runnable =====");
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
        t2.join();
        System.out.println();

        // =========================================
        // Program 3 - Thread via Lambda
        // =========================================
        System.out.println("===== Program 3 - Thread via Lambda =====");
        Thread t3 = new Thread(() -> System.out.println("Thread running via lambda Runnable."));
        t3.start();
        t3.join();
        System.out.println();

        // =========================================
        // Program 4 - Thread.sleep()
        // =========================================
        System.out.println("===== Program 4 - Thread.sleep() =====");
        System.out.println("Sleeping for 500ms...");
        long start = System.currentTimeMillis();
        Thread.sleep(500);
        long end = System.currentTimeMillis();
        System.out.println("Woke up after ~" + (end - start) + "ms");
        System.out.println();

        // =========================================
        // Program 5 - join()
        // =========================================
        System.out.println("===== Program 5 - join() =====");
        Thread t5 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("t5 working: " + i);
            }
        });
        t5.start();
        t5.join();
        System.out.println("t5 finished, main thread continues.");
        System.out.println();

        // =========================================
        // Program 6 - Thread Priority
        // =========================================
        System.out.println("===== Program 6 - Thread Priority =====");
        Thread low = new Thread(() -> System.out.println("Low priority thread running."));
        Thread high = new Thread(() -> System.out.println("High priority thread running."));
        low.setPriority(Thread.MIN_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Low priority value: " + low.getPriority());
        System.out.println("High priority value: " + high.getPriority());
        low.start();
        high.start();
        low.join();
        high.join();
        System.out.println();

        // =========================================
        // Program 7 - Without Synchronization
        // =========================================
        System.out.println("===== Program 7 - Without Synchronization =====");
        Counter unsafe = new Counter();
        Runnable unsafeTask = () -> {
            for (int i = 0; i < 10000; i++) unsafe.increment();
        };
        Thread u1 = new Thread(unsafeTask);
        Thread u2 = new Thread(unsafeTask);
        u1.start();
        u2.start();
        u1.join();
        u2.join();
        System.out.println("Expected: 20000, Actual: " + unsafe.getCount());
        System.out.println();

        // =========================================
        // Program 8 - With Synchronization
        // =========================================
        System.out.println("===== Program 8 - With Synchronization =====");
        SafeCounter safe = new SafeCounter();
        Runnable safeTask = () -> {
            for (int i = 0; i < 10000; i++) safe.increment();
        };
        Thread s1 = new Thread(safeTask);
        Thread s2 = new Thread(safeTask);
        s1.start();
        s2.start();
        s1.join();
        s2.join();
        System.out.println("Expected: 20000, Actual: " + safe.getCount());
        System.out.println();

        // =========================================
        // Program 9 - Thread States (isAlive)
        // =========================================
        System.out.println("===== Program 9 - Thread States =====");
        Thread t9 = new Thread(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        System.out.println("Before start - isAlive: " + t9.isAlive());
        t9.start();
        System.out.println("After start  - isAlive: " + t9.isAlive());
        t9.join();
        System.out.println("After join   - isAlive: " + t9.isAlive());
        System.out.println();

        // =========================================
        // Program 10 - Daemon Thread
        // =========================================
        System.out.println("===== Program 10 - Daemon Thread =====");
        Thread daemon = new Thread(() -> System.out.println("Daemon thread running (background task)."));
        daemon.setDaemon(true);
        System.out.println("Is daemon? " + daemon.isDaemon());
        daemon.start();
        daemon.join();
    }
}
