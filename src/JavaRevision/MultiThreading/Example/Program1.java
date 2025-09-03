package JavaRevision.MultiThreading.Example;

public class Program1 {
    public static void main(String[] args) {

        System.out.println("Main thread started executing ");
        CustomThread ct = new CustomThread();
        System.out.println("Custom Thread is alive : " + ct.isAlive());
        ct.start();
        System.out.println("Custom Thread is alive : " + ct.isAlive());
        try {
            ct.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Custom Thread is alive : " + ct.isAlive());
        System.out.println("Main thread exiting ");
    }
}
