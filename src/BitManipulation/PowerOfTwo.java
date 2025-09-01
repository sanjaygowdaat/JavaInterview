package BitManipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n=15;
        System.out.println(powerOfTwo(n));
        System.out.println(isPowerOfTwo(n));
    }

    static boolean powerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }
//    alternate method
    static boolean isPowerOfTwo(int n) {
        int setCount = 0;
        while (n > 0) {
            n = n >> 1;
            if ((n & 1) == 1) {
                setCount++;
            }
        }
        if (setCount == 1) {
            return true;
        } else {
            return false;
        }

    }
}
