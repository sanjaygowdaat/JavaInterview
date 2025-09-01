package JavaRevision.Practice;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1200;
//        System.out.println(reverseWithZeros(n));
        System.out.println(parseInteger("0012"));
    }

    public static int reverse(int num) {
        int rev = 0;
        int rem = 0;

        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }

    public static String reverseWithZeros(int num) {
        String number = String.valueOf(num);
        StringBuilder rev = new StringBuilder(number);
        return rev.reverse().toString();
    }

    public static int parseInteger(String number) {
        int n = Integer.parseInt(number);
        return n;
    }

}
