package JavaRevision.MultiThreading.Example.DeadLock;

public class Hospital {
    String res1 = "Bed";
    String res2 = "Doctor";

    public void tomTreatment() {
        synchronized (res1) {
            try {
                System.out.println("Tom has acquired " + res1);
                Thread.sleep(3000);
                synchronized (res2) {
                    System.out.println("Tom has acquired " + res2);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void jerryTreatment() {
        synchronized (res2) {
            try {
                System.out.println("Jerry has acquired " + res2);
                Thread.sleep(3000);
                synchronized (res1) {
                    System.out.println("Jerry has acquired " + res1);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }



}
