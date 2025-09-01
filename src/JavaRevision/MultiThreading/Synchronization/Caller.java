package JavaRevision.MultiThreading.Synchronization;

public class Caller implements Runnable{
    String message;
    Thread t;
    CallMe target;

    public Caller(CallMe target, String message) {
        this.target = target;
        this.message = message;
        t = new Thread(this);
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(message);
            target.call1(message);
        }
    }
}
