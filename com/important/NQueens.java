package com.important;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        printNQueens(board, 0);
    }

    private static void printNQueens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
            if (isQueenSafe(board, row, col)) {
                board[row][col] = true;
                printNQueens(board, row + 1);
                board[row][col] = false;
            }
        }
    }

    private static boolean isQueenSafe(boolean[][] board, int row, int col) {
        //upwards
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (board[i][j]) {
                return false;
            }
        }

        //diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }

        //diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board[0].length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
