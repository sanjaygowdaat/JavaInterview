package Recursion.BackTracking;

public class SolveSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        if (solveSudoku(board, 0, 0)) {
            System.out.println("Solution found : ");
            for (char[] r : board) {
                for (char c : r) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Solution not found");
        }
    }

    public static boolean solveSudoku(char[][] board, int row, int col) {
        if (col == board.length) {
            if (row == board.length-1) {
                return true;
            }
            row = row + 1;
            col = 0;
        }
        if (board[row][col] == '.') {
            for (char i = '1'; i <= '9'; i++) {
                if (isValid(board, row, col, i)) {
                    board[row][col] = i;
                    if (solveSudoku(board, row, col + 1))  return true;
                    board[row][col] = '.';
                }
            }
            return false;
        } else return solveSudoku(board, row, col + 1);
    }

    public static boolean isValid(char[][] board, int row, int col, char num) {
        // 3x3 grid check
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        // row check
        for (int k = 0; k < board.length; k++) {
            if (board[row][k] == num) {
                return false;
            }
        }
        // col check
        for (int l = 0; l < board.length; l++) {
            if (board[l][col] == num) {
                return false;
            }
        }
        return true;
    }
}
