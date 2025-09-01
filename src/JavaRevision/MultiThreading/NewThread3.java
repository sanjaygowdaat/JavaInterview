package JavaRevision.MultiThreading;

public class NewThread3 implements Runnable {
    Thread t;
    String name;

    public NewThread3(String name) {
        this.name = name;
        t = new Thread(this, name);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " is interrupted");
        }
        System.out.println("Exiting thread :  " + name);
    }
}
