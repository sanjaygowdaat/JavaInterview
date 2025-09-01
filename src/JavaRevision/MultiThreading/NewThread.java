package JavaRevision.MultiThreading;

public class NewThread implements Runnable {
    Thread t;
    public NewThread() {
        t = new Thread(this, "New Thread");
        System.out.println("Created new thread");
    }

    public void run() {
        try {
            System.out.println("Started child thread run method");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child thread : " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Child thread interrupted");
        }
        System.out.println("Exiting child thread");
    }
}
