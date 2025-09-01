package OOP.Video6.ExceptionHandling;

public class Program4 {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 10 / a;
            int[] c = {1};
            c[20] = 19;
        } catch (ArithmeticException e1) {
            System.out.println(e1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println(e2);
        }
        System.out.println("After try catch block");
    }
}
