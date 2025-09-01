package JavaRevision.MultiThreading;

public class ThreadDemo1 {
    public static void main(String[] args) {
        System.out.println("Main thread execution started");
        NewThread1 t = new NewThread1();
        t.start();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread : " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exiting main thread");
    }
}
