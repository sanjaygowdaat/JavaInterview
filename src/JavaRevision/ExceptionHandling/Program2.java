package JavaRevision.ExceptionHandling;

public class Program2 {
    public static int divide() throws Exception {
        try {
            return 10 / 0;
        } catch (Exception e) {
            System.out.println("Exception handled inside divide method");
            throw e;
        } finally{
            System.out.println("Divide method execution completed");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(divide());
        } catch (Exception e) {
            System.out.println("Exception handled in main method");
        }
        System.out.println("Program execution completed");
    }
}
