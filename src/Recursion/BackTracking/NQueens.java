package Recursion.BackTracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] arr = new boolean[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = false;
            }
        }
        queens(0, arr);
    }

    static void queens(int row, boolean[][] arr) {
        if (row == arr.length) {
            display(arr);
            System.out.println();
            return;
        }
        for (int col = 0; col < arr[row].length; col++) {
            if (isSafe(row, col, arr)) {
                arr[row][col] = true;
                queens(row + 1, arr);
                arr[row][col] = false;
            }
        }
    }

    static boolean isSafe(int row, int col, boolean[][] arr) {
        //column check
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col]) {
                return false;
            }
        }
        //left diagonal check
        int leftLength = Math.min(row, col);
        for (int i = 1; i <= leftLength; i++) {
            if (arr[row - i][col - i]) {
                return false;
            }
        }
        //right diagonal check
        int rightLength = Math.min(row, arr.length - 1 - col);
        for (int i = 1; i <= rightLength; i++) {
            if (arr[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] arr) {
        for (boolean[] row : arr) {
            System.out.print("[ ");
            for (boolean col : row) {
                if (col) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("]");
        }
    }
}
