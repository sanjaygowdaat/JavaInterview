package JavaRevision.MultiThreading.Example.DeadLock;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital h1 = new Hospital();
//        Hospital h2 = new Hospital();
        Tom t = new Tom(h1);
        Jerry j = new Jerry(h1);
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(j);
        t1.start();
        t2.start();
    }
}
