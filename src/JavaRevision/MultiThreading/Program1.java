package JavaRevision.MultiThreading;

public class Program1 {
    public static void main(String[] args) {
        try {
            System.out.println("Addition activity started");
            int a = 10;
            int b = 20;
            int res = a + b;
            Thread.sleep(5000);
            System.out.println(res);
            System.out.println("Addition activity ended");

            System.out.println("Printing activity started");
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(5000);
            }
            System.out.println("Printing activity ended");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("Program ended");
        }

    }
}
