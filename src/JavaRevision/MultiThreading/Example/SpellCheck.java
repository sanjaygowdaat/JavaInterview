package JavaRevision.MultiThreading.Example;

public class SpellCheck extends Thread {
    @Override
    public void run() {
        for (; ; ) {
            System.out.println("Checking the spelling...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
