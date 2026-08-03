// ---- Program 8 - With Synchronization ----

class SafeCounter08 {
    private int count = 0;

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

        // synchronized makes increment atomic, so no updates are lost
        System.out.println("Expected: 20000, Actual: " + safe.getCount());
    }
}
