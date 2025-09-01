package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class NQueens1 {
    public static void main(String[] args) {
        int n = 3;
        char[][] arr = new char[n][n];
        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }
        boolean[] col = new boolean[arr.length];
        boolean[] leftDiagonal = new boolean[2 * arr.length - 1];
        boolean[] rightDiagonal = new boolean[2 * arr.length - 1];
        System.out.println(nQueens(arr, 0, col, leftDiagonal, rightDiagonal));
    }

    static ArrayList<ArrayList<String>> nQueens(char[][] board, int row, boolean[] col, boolean[] leftDiagonal, boolean[] rightDiagonal) {
        if (row == board.length) {
            ArrayList<String> list = new ArrayList<>();
            for (char[] r : board) {
                list.add(new String(r));
            }
            ArrayList<ArrayList<String>> ans = new ArrayList<>();
            ans.add(list);
            return ans;
        }
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for (int column = 0; column < board[row].length; column++) {
            if (col[column] || leftDiagonal[row - column + (board.length - 1)] || rightDiagonal[row + column]) {
                continue;
            }
            col[column] = leftDiagonal[row - column + (board.length - 1)] = rightDiagonal[row + column] = true;
            board[row][column] = 'Q';
            res.addAll(nQueens(board, row + 1, col, leftDiagonal, rightDiagonal));
            board[row][column] = '.';
            col[column] = leftDiagonal[row - column + (board.length - 1)] = rightDiagonal[row + column] = false;
        }
        return res;
    }

}
