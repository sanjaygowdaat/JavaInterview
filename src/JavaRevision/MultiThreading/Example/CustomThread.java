package JavaRevision.MultiThreading.Example;

public class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println("Custom Thread started execution");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Custom Thread exiting");
    }
}
