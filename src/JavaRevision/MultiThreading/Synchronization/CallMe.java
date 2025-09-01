package JavaRevision.MultiThreading.Synchronization;

public class CallMe {
    public void call(String msg) {
        System.out.print("[ " + msg);
        try {
            Thread.sleep(000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println(" ]");
    }

    public void call1(String msg) {
        try {
            System.out.print("( " + "Testing");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println(" )");
    }

}
