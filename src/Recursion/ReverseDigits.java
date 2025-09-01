package Recursion;

public class ReverseDigits {
    public static void main(String[] args) {
        int n = 1234;
        int numReverse = 0;
        System.out.println(reverse(n, numReverse));
    }

    static int reverse(int n, int numReverse) {
        if (n == 0) {
            return numReverse;
        }
        numReverse = numReverse * 10 + (n % 10);
        return reverse(n / 10, numReverse);
    }
}
