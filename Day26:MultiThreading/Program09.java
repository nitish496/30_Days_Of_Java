// ---- Program 9 - Thread States (isAlive) ----

public class Program09 {
    public static void main(String[] args) throws InterruptedException {
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
    }
}
