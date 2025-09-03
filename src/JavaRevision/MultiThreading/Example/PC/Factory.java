package JavaRevision.MultiThreading.Example.PC;

public class Factory {
    int i;
    boolean itemAvailable = false;

    synchronized public void produce(int i) {
        while (itemAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.i = i;
        System.out.println("Producer has produced item : " + i);
        itemAvailable = true;
        notify();
    }

    synchronized public void consume() {
        while (!itemAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumer has consumed item : " + i);
        itemAvailable = false;
        notify();
    }

}
