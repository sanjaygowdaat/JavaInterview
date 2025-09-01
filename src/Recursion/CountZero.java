package Recursion;

public class CountZero {
    public static void main(String[] args) {
        int n = 1110;
        int count = 0;
        System.out.println(countZero(n, count));
    }

    static int countZero(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            return countZero(n / 10, count + 1);
        } else {
            return countZero(n / 10, count);
        }
    }
}
