package JavaRevision.MultiThreading;

public class NewThread2 implements Runnable {
    Thread t;
    String threadName;

    public NewThread2(String threadName) {
        this.threadName = threadName;
        t = new Thread(this, this.threadName);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " thread is interrupted. ");
        }
    }
}
