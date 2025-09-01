package JavaRevision.MultiThreading;

public class ThreadDemo3 {
    public static void main(String[] args) {
        System.out.println("Main thread execution started");

        NewThread3 one = new NewThread3("One");
        NewThread3 two = new NewThread3("Two");
        NewThread3 three = new NewThread3("Three");

        one.t.start();
        two.t.start();
        three.t.start();

        System.out.println("Thread one is alive : " + (one.t.isAlive()));
        System.out.println("Thread two is alive : " + two.t.isAlive());
        System.out.println("Thread three is alive : " + three.t.isAlive());

        try {
            one.t.join();
            two.t.join();
            three.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Thread one is alive : " + (one.t.isAlive()));
        System.out.println("Thread two is alive : " + two.t.isAlive());
        System.out.println("Thread three is alive : " + three.t.isAlive());

        System.out.println("Exiting main thread");

    }
}
