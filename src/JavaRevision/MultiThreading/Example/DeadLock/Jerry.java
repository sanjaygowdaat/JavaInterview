package JavaRevision.MultiThreading.Example.DeadLock;

public class Jerry implements Runnable {
    Hospital h;

    Jerry(Hospital h) {
        this.h = h;
    }

    @Override
    public void run() {
        h.jerryTreatment();
    }
}
