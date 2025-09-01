package Math;

public class ModularInverse {
    public static void main(String[] args) {
        long m = 1000000007;
        long b = 2;
        System.out.println(modularInverse(b, m - 2, m));
    }

    static long modularInverse(long base, long exponent, long m) {
        long result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % m;
            }
            base = (base * base) % m;
            exponent = exponent >> 1;
        }
        return result;
    }
}
