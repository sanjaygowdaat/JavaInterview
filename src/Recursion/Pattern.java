package Recursion;

public class Pattern {
    public static void main(String[] args) {
        int n = 4;
//        pattern(n, 0);
        revPattern(n, 0);
    }

    //dry run this for better understanding the difference between the two
    static void revPattern(int n, int count) {
        if (n == 0) {
            return;
        }
        if (count < n) {
            revPattern(n, ++count);
            System.out.print("* ");
        } else {
            revPattern(n - 1, 0);
            System.out.println();
        }
    }

    static void pattern(int n, int count) {
        if (n == 0) {
            return;
        }
        if (count < n) {
            System.out.print("* ");
            pattern(n, ++count);
        } else {
            System.out.println();
            pattern(n - 1, 0);
        }

    }
}
