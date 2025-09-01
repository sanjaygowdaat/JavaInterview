package JavaRevision.MultiThreading.Synchronization;

public class Synch {
    public static void main(String[] args) {

        System.out.println("Main thread executing");

        CallMe target = new CallMe();
        Caller c1 = new Caller(target, "Welcome");
        Caller c2 = new Caller(target, "to");
        Caller c3 = new Caller(target, "Synchronization");

        c1.t.start();
        c2.t.start();
        c3.t.start();

        try {
            c1.t.join();
            c2.t.join();
            c3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Exiting main thread");

    }
}
