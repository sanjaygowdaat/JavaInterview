package JavaRevision.MultiThreading;

public class ThreadDemo2 {
    public static void main(String[] args) {
        System.out.println("Main thread execution started");

        NewThread2 one = new NewThread2("One");
        NewThread2 two = new NewThread2("Two");
        NewThread2 three = new NewThread2("Three");

        one.t.start();
        two.t.start();
        three.t.start();


        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread : " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exiting main thread");
    }
}
