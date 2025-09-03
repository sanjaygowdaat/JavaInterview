package JavaRevision.MultiThreading.Example.PC;

public class Consumer implements Runnable{
    Factory f;

    public Consumer(Factory f) {
        this.f = f;
    }
    @Override
    public void run() {
        while (true) {
            f.consume();
        }
    }
}
