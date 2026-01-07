package FunStuff;

import java.util.Random;

public class GenerateRandomString {
    public static void main(String[] args) {
        System.out.println(generateRandomString(5));
    }

    public static String generateRandomString(int size) {
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            char ch = (char) (97 + (int) (26 * random.nextFloat()));
            sb.append(ch);
        }
        return sb.toString();
    }
}
