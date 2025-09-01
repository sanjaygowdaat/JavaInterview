package BitManipulation;

public class RowSumPascalsTriangle {
    public static void main(String[] args) {
        int n=5;
        System.out.println("Sum of " + n + " row elements of a pascals triangle : " + rowSum(n));
    }

    static int rowSum(int n) {
        return 1 << (n - 1);
    }
}
