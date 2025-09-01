package JavaRevision.MultiThreading;

public class Addition extends Thread {
    @Override
    public void run() {
        int a = 10;
        int b = 20;
        int res = a + b;
        System.out.println(res);
    }
}
