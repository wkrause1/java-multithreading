import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest implements Runnable {
    private String greeting;
    private ReentrantLock lock;
    public ThreadTest(String s) {
        this.greeting = s;
    }

    public void run() {
        for (int i=1; i<11; i++) {
            System.out.println(greeting);
            lock = new ReentrantLock();
            lock.lock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally{
                lock.unlock();
            }
        }
    }
}
