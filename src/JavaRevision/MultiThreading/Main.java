package JavaRevision.MultiThreading;

public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Thread name : " + t.getName());
        // changing the thread name
        t.setName("NewMain");
        System.out.println("New thread name for main thread : " + t.getName());

        try{
            for (int i = 0; i <= 10; i++) {
                Thread.sleep(3000);
                System.out.println(i + 1);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
