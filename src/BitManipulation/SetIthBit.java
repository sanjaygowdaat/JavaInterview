package BitManipulation;

public class SetIthBit {
    public static void main(String[] args) {
        int n=9;
        System.out.println(setIthBit(n));
    }

    public static int setIthBit(int n) {

        return n | (1 << 2);
    }
}
