package BitManipulation;

/*Toggle the i-th Bit (Flip 1 to 0 or 0 to 1)
n ^ (1 << i)
XOR with 1 flips the bit.*/

public class ToggleIthBit
{
    public static void main(String[] args) {
        int n=13;
        System.out.println(toggleIthBit(n));
    }

    static int toggleIthBit(int n) {
        return n ^ (1 << 1);
    }
}
