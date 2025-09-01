package JavaRevision.MultiThreading.DeadLock;

public class B {
    synchronized public void bar(A a) {
        System.out.println("Inside bar method , thread : " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Trying to call a.last()");
        a.last();
    }

    synchronized public void last() {
        System.out.println("Last Method in B");
    }
}
