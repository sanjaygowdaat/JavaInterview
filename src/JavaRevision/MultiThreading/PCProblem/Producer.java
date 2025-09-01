package JavaRevision.MultiThreading.PCProblem;

public class Producer implements Runnable {

    Q q;
    Thread p;
    public Producer(Q q) {
        this.q = q;
        p = new Thread(this, "Producer");
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}
