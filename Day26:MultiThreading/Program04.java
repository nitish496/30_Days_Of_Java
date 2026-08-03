// ---- Program 4 - Thread.sleep() ----

public class Program04 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sleeping for 500ms...");

        long start = System.currentTimeMillis();
        Thread.sleep(500);
        long end = System.currentTimeMillis();

        System.out.println("Woke up after ~" + (end - start) + "ms");
    }
}
