package Recursion;

public class NaturalNoSum
{
    public static void main(String[] args) {
        int n=5;
        int ans=sumOfNaturalNumbers(n);
        System.out.println(ans);
    }

    public static int sumOfNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }
}
