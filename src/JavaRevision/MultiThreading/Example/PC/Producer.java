package JavaRevision.MultiThreading.Example.PC;

public class Producer implements Runnable {
    Factory f;

    public Producer(Factory f) {
        this.f = f;
    }
    @Override
    public void run() {
        int i = 1;
        while (true) {
            f.produce(i++);
        }
    }
}
