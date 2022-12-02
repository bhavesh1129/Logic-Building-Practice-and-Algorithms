package com.important;

public class NKnight {
    public static void main(String[] args) {
        int n = 5;
        int[][] board = new int[n][n];
        printNKnight(board, 2, 0, 1);
    }

    private static void printNKnight(int[][] board, int row, int col, int move) {
        if (row < 0 || col < 0 || row >= board.length || col >= board.length || board[row][col] > 0) {
            return;
        } else if (move == board.length * board.length) {
            board[row][col] = move;
            display(board);
            board[row][col] = 0;
            return;
        }

        board[row][col] = move;
        printNKnight(board, row - 2, col + 1, move + 1);
        printNKnight(board, row - 1, col + 2, move + 1);
        printNKnight(board, row + 1, col + 2, move + 1);
        printNKnight(board, row + 2, col + 1, move + 1);
        printNKnight(board, row + 2, col - 1, move + 1);
        printNKnight(board, row + 1, col - 2, move + 1);
        printNKnight(board, row - 1, col - 2, move + 1);
        printNKnight(board, row - 2, col - 1, move + 1);
        board[row][col] = 0;
    }

    private static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}