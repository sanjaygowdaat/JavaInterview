package JavaRevision.MultiThreading.Example.DeadLock;

public class Tom implements Runnable {
    Hospital h;

    Tom(Hospital h) {
        this.h = h;
    }
    @Override
    public void run() {
        h.tomTreatment();
    }
}
