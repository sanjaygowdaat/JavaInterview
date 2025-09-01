package JavaRevision.MultiThreading;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main thread execution started");
        NewThread nt = new NewThread();
        nt.t.start();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main thread : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exiting Main thread");
    }
}
