package OOP.Video6.ExceptionHandling;

public class Program5 {
    public static void main(String[] args) {
        String name = "Adi";
        try {
            if (name.equals("Adi")) {
                throw new CustomException("Custom exception testing");
            }
        } catch (CustomException ce) {
            System.out.println(ce.getMessage());
        }
    }
}
