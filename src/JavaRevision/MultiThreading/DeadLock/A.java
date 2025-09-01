package JavaRevision.MultiThreading.DeadLock;

public class A {

    synchronized public void foo(B b) {
        System.out.println("Inside foo method , thread : " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Trying to call b.last()");
        b.last();
    }

    synchronized public void last() {
        System.out.println("Last method in A");
    }

}


