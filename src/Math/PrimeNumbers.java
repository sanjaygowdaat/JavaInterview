package Math;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 40;
        printPrimeNumbers(n);
    }

    static void printPrimeNumbers(int n) {
        boolean[] isComposite = new boolean[n + 1]; //  We need an array of size n+1 so that we can represent numbers from 0 to n
        for (int i = 2; i * i <= n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        for (int k = 2; k <= n; k++) {
            if (!isComposite[k]) {
                System.out.print(k + " ");
            }
        }
    }
}
// kunal kushwaha math dsa video