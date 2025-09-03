package BitManipulation;

public class CalculatePower {
    public static void main(String[] args) {
        int base = 3;
        int exponent = 6;
        System.out.println(power(base, exponent));
    }

    static int power(int base, int exponent) {
        int result=1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = result * base;
            }
            exponent=exponent>>1;
            base=base*base;
        }
        return result;
    }
}
/* base squaring happens every iteration, but it gets multiplied with result only if the LSB is set to 1.
 base in this case starts with 3 -> 3^2 -> 3^4 -> 3^8 (3, 3^2, 3^2^2, 3^2^2^2...)*/
/*6 = 110₂
6 = (1 × 4) + (1 × 2) + (0 × 1)
= 4 + 2
3^6 = 3^(4 + 2) = 3^4 * 3^2*/
