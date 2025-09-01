package Recursion;

public class NumberPalindrome {
    public static void main(String[] args) {
        int n = 5665;
        System.out.println("Is a palindrome : " + palindrome(n));
    }

    static boolean palindrome(int n) {
        int originalNum = n;
        int rev = 0;
        return originalNum == reverse(n, rev);
    }

    static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        rev = rev * 10 + (n % 10);
        return reverse(n / 10, rev);
    }
}
