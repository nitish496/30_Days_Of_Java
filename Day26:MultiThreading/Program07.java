// ---- Program 7 - Without Synchronization (race condition) ----

class Counter07 {
    private int count = 0;

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

        // count++ is not atomic, so updates get lost
        System.out.println("Expected: 20000, Actual: " + unsafe.getCount());
    }
}
