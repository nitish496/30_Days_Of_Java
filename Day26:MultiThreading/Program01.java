// ---- Program 1 - Extending Thread ----

class MyThread01 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread running via extends Thread.");
    }
}

public class Program01 {
    public static void main(String[] args) throws InterruptedException {
        MyThread01 t1 = new MyThread01();
        t1.start();
        t1.join();
    }
}
