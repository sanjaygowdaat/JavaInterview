package BitManipulation;

/*Clear / Reset the i-th Bit (Make it 0)
n & ~(1 << i)
1 << i creates a mask for the i-th bit.
~ flips the bits → only the i-th bit becomes 0, rest are 1s.
ANDing with that resets just the i-th bit.*/

public class ResetIthBit {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(resetIthBit(n));
    }

    static int resetIthBit(int n) {
        return n & ~(1 << 2);
    }
}
