package FunStuff;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] board = new char[3][3];
        boolean gameOver = false;
        char player = 'X';
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], ' ');
        }
        printBoard(board);
        while (!gameOver) {
            System.out.println("Player " + player + " enter the row and column : ");
            int row = scan.nextInt();
            int col = scan.nextInt();
            board[row][col] = player;
            gameOver = wonGame(board, player);
            if (gameOver) {
                printBoard(board);
                System.out.println("Player " + player + " won the game!");
            } else {
                printBoard(board);
                player = (player == 'X') ? 'O' : 'X';
            }
        }
    }

    private static boolean wonGame(char[][] board, char player) {
        // check for rows
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        // check for columns
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        // check for top left to bottom right diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        // check for top right to bottom left diagonal
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.println();
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
        }
        System.out.println();
    }
}
