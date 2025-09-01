package JavaRevision.ExceptionHandling;

public class Program6 {
    public static void main(String[] args) {
        try {
            if (true) {
                throw new CustomException();
            }
        } catch (CustomException ce) {
            ce.printStackTrace();
        }
        System.out.println(" Program execution completed");
    }
}
