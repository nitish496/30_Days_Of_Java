// ---- Program 5 - join() ----

public class Program05 {
    public static void main(String[] args) throws InterruptedException {
        Thread t5 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("t5 working: " + i);
            }
        });

        t5.start();
        t5.join();
        System.out.println("t5 finished, main thread continues.");
    }
}
