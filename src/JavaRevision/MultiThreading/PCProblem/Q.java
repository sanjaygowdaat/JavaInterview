package JavaRevision.MultiThreading.PCProblem;

public class Q {
    int n;
    boolean value = true;

    synchronized public int get() {
        while (value) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        System.out.println("Consumed : " + n);
        value = true;
        notify();
        return n;
    }

    synchronized public void put(int n) {
        while (!value) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        System.out.println("Produced: " + n);
        value = false;
        this.n = n;
        notify();
    }

}
