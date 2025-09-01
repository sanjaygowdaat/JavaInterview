package Recursion.BackTracking;

import java.util.Arrays;

public class NKnights {
    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];
        for (char[] r : board) {
            Arrays.fill(r, '.');
        }
        int target = 3;
        nKnights(board, 0, 0, target);
        System.out.println(count);
    }

    static int count = 0;
    static void nKnights(char[][] board, int row, int col, int target) {
        if (target == 0) {
            count++;
            for (char[] r : board) {
                for (char c : r) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        if (col == board[row].length) {
            if (row == board.length - 1) {
                return;
            }
            row = row + 1;
            col = 0;
        }
        if (isValid(board, row, col)) {
            board[row][col] = 'K';
            nKnights(board, row, col + 1, target - 1);
            board[row][col] = '.';
        }
        nKnights(board, row, col + 1, target);
    }

    static boolean isValid(char[][] board, int row, int col) {
        if (row > 1 && col > 0 && board[row - 2][col - 1] == 'K') {
            return false;
        }
        if (row > 1 && col < board.length - 1 && board[row - 2][col + 1] == 'K') {
            return false;
        }
        if (row > 0 && col > 1 && board[row - 1][col - 2] == 'K') {
            return false;
        }
        if (row > 0 && col < board.length - 2 && board[row - 1][col + 2] == 'K') {
            return false;
        }
        return true;
    }
}
