package BitManipulation;

public class RangeXOR {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        System.out.println(rangeXor(a, b));
//      just for cross verification, don't use for loop, time complexity is bad for bigger values or range
        int ans = 0;
        for (int i = a; i <= b; i++) {
            ans = ans ^ i;
        }
        System.out.println(ans);
    }

    static int rangeXor(int a, int b) {
       /*  notice its a-1 and not a, because we want to include a in the range and remove xor ops till a-1 and using property a^a=0,
         we get our ans*/
        return nXor(b) ^ nXor(a - 1);
    }

    private static int nXor(int n) {
        if (n % 4 == 0) {
            return n;
        } else if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n + 1;
        } else {
            return 0;
        }
    }

}
