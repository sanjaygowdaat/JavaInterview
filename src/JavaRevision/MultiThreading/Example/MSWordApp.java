package JavaRevision.MultiThreading.Example;

public class MSWordApp {
    public static void main(String[] args) {
        System.out.println("Main thread started executing");
        Typing type = new Typing();
        SpellCheck sc = new SpellCheck();
        AutoSave as = new AutoSave();
        type.start();
        sc.setDaemon(true);
        as.setDaemon(true);
        sc.start();
        as.start();
        try {
            type.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread exiting");
    }
}
