package OOP.Video6.ExceptionHandling;

public class Program1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
//        // will throw arithmetic exception : divide by zero, which will be handled by default
//        // handler since we are not handling it manually here
//        int c = a / b;

        divide(a, b);
    }

    private static void divide(int a, int b) {
        System.out.println(a / b);
    }

}
