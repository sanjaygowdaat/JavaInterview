package JavaRevision.MultiThreading;

public class NewThread1 extends Thread {

    public NewThread1() {
        super("Child Thread");
        System.out.println("Child thread created");
    }

    public void run() {
        System.out.println("Child thread run method started");
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted");
        }
        System.out.println("Exiting child thread");
    }

}
