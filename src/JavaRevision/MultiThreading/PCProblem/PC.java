package JavaRevision.MultiThreading.PCProblem;

public class PC {
    public static void main(String[] args) {

        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.p.start();
        c.c.start();

    }
}
