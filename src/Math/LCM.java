package Math;

public class LCM {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        System.out.println(lcm(a, b));
    }

    static int lcm(int a, int b) {
        return (a * b) / (gcd(a, b));
    }

    static int gcd(int a, int b) {
        int temp;
        while (b > 0) {
            temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}
