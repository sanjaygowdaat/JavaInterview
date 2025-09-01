package JavaRevision.MultiThreading.DeadLock;

public class DeadLock implements Runnable {

    A a = new A();
    B b = new B();
    Thread t;

    public DeadLock() {
        t = new Thread(this, "RacingThread");
    }

    public void deadLockStart() {
        t.start();
        a.foo(b);
    }

    @Override
    public void run() {
        b.bar(a);
    }

    public static void main(String[] args) {
        DeadLock d = new DeadLock();
        d.deadLockStart();
    }

}
