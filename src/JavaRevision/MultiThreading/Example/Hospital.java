package JavaRevision.MultiThreading.Example;

public class Hospital implements Runnable {
    @Override
    synchronized public void run() {
        try {
            System.out.println("Patient " + Thread.currentThread().getName() + " is entering the ICU");
            Thread.sleep(1000);
            System.out.println("Patient " + Thread.currentThread().getName() + " is getting operated");
            Thread.sleep(1000);
            System.out.println("Patient " + Thread.currentThread().getName() + " is exiting the ICU");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
