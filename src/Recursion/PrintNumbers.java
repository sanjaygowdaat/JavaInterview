package Recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        int n=10;
        revPrintNumbers(n);
        System.out.println();
        printNumbers(n);
    }

    static void revPrintNumbers(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print(n + " ");
        revPrintNumbers(n-1);
    }

    static void printNumbers(int n) {
        if (n <= 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.print(n + " ");
    }
}
