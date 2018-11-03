public class ThreadTest implements Runnable {
    private String greeting;
    public ThreadTest(String s) {
        this.greeting = s;
    }

    public void run() {
        for (int i=1; i<11; i++) {
            System.out.println(greeting);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
