package JavaRevision.MultiThreading.PCProblem;

public class Consumer implements Runnable {

    Q q;
    Thread c;

    public Consumer(Q q) {
        this.q = q;
        c = new Thread(this, "Consumer");
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}
