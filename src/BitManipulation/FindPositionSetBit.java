package BitManipulation;

public class FindPositionSetBit {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(findPosition(n));
    }

    public static int findPosition(int n) {
        int pointer=0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << pointer)) != 0) {
                return pointer;
            } else {
                pointer++;
            }
        }
        return -1;
    }
}
