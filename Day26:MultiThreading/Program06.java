// ---- Program 6 - Thread Priority ----

public class Program06 {
    public static void main(String[] args) throws InterruptedException {
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
    }
}
