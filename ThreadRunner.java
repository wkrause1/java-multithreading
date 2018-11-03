public class ThreadRunner {
    public static void main (String[] args) {
        Runnable r1 = new ThreadTest("Hello");
        Runnable r2 = new ThreadTest("Goodbye");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
