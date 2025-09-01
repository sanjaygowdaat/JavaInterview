package OOP.Video6.ExceptionHandling;

import java.util.Random;

public class Program3 {
    public static void main(String[] args) {
        Random random = new Random();
        int a, b, c = 0;
        for (int i = 0; i < 32000; i++) {
            try {
                b = random.nextInt();
                c = random.nextInt();
                a = 12345 / (b / c);
            } catch (Exception e) {
                System.out.println(e);
                a = 0;
            }
            System.out.println("The value of a is : " + a);
        }
    }
}
