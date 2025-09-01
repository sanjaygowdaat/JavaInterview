package Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 4321;
        System.out.println(product(n));
    }

    static int product(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * product(n / 10);
    }
}
