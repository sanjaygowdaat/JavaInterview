package JavaRevision.ExceptionHandling;

public class Program5 {
    public static void main(String[] args) {
        try {
            int ans = 10 / 0;
        } finally {
            System.out.println("Main method execution is over without catch block");
        }
    }
}
