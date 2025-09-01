package JavaRevision.ExceptionHandling;

public class Program3 {
    public static void main(String[] args) {
        try {
            divide();
        } catch (Exception e) {
            System.out.println("Exception is handled in main method");
        }
    }

    // ducking an exception
    public static int divide() {
        return 10 / 0;
    }
}
