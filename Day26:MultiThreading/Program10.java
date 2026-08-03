// ---- Program 10 - Daemon Thread ----

public class Program10 {
    public static void main(String[] args) throws InterruptedException {
        Thread daemon = new Thread(() -> System.out.println("Daemon thread running (background task)."));

        // must be set before start()
        daemon.setDaemon(true);
        System.out.println("Is daemon? " + daemon.isDaemon());

        daemon.start();
        daemon.join();
    }
}
