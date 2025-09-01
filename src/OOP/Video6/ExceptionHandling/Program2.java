package OOP.Video6.ExceptionHandling;

public class Program2 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("After exception object is thrown ");
        } catch (Exception e) {
            System.out.println(e);
//            System.out.println("Arithmetic exception : Divide by zero");
        }
        System.out.println("After catch statement");
        System.out.println("Last line...");
    }
}
