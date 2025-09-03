package JavaRevision.MultiThreading.Example;

public class AutoSave extends Thread {
    @Override
    public void run() {
        for (; ; ) {
            System.out.println("Autosaving...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
