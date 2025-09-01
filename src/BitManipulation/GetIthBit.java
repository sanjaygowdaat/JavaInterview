package BitManipulation;
/*
1. Get the i-th Bit (Check if it's 1 or 0)
(n >> i) & 1
*/
public class GetIthBit
{
    public static void main(String[] args) {
        int n=13;
        System.out.println(getIthBit(n));
    }

    public static int getIthBit(int n) {
        return 1 & (n >> 1);
    }
}
