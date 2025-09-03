package JavaRevision.MultiThreading.Example.PC;

public class FactoryApp {
    public static void main(String[] args) {
        Factory f = new Factory();
        Producer p = new Producer(f);
        Consumer c = new Consumer(f);
        Thread producer = new Thread(p);
        Thread consumer = new Thread(c);
        producer.start();
        consumer.start();
    }
}
