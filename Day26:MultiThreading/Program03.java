// ---- Program 3 - Thread via Lambda ----

public class Program03 {
    public static void main(String[] args) throws InterruptedException {
        Thread t3 = new Thread(() -> System.out.println("Thread running via lambda Runnable."));
        t3.start();
        t3.join();
    }
}
