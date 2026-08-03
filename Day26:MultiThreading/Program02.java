// ---- Program 2 - Implementing Runnable ----

class MyRunnable02 implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable running via implements Runnable.");
    }
}

public class Program02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t2 = new Thread(new MyRunnable02());
        t2.start();
        t2.join();
    }
}
