package JavaRevision.ExceptionHandling;

public class Program1 {
    public static void main(String[] args) {
        try {
            int div = 10 / 0;
            System.out.println(div);
        } catch (Exception e) {
            System.out.println("Denominator cant be zero");
        } finally {
            System.out.println("After try catch block");
        }
    }
}
