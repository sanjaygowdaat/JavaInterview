package JavaRevision.MultiThreading.Example;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital h = new Hospital();
        Thread tom = new Thread(h);
        Thread jerry = new Thread(h);
        tom.setName("Tom");
        jerry.setName("Jerry");
        tom.start();
        jerry.start();
    }
}
