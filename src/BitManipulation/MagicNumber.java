package BitManipulation;

public class MagicNumber {
    public static void main(String[] args) {
        int n=6;
        System.out.println(magicNumber(n));
    }

    static int magicNumber(int n) {
        int magicNumber=0;
        int temp;
        for (int i = 0; i < 32; i++) {
            temp = n >> i;
            magicNumber += (temp & 1) * Math.pow(5, i + 1);
        }
        return magicNumber;
    }
}
