package com.important;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        solveSudoku(board, 0, 0);
    }

    private static void solveSudoku(int[][] board, int row, int col) {
        if (row == board.length) {
            display(board);
            return;
        }

        int nextI = 0;
        int nextJ = 0;

        if (col == board[0].length - 1) {
            nextI = row + 1;
            nextJ = 0;
        } else {
            nextI = row;
            nextJ = col + 1;
        }

        if (board[row][col] != 0) {
            solveSudoku(board, nextI, nextJ);
        } else {
            for (int possibleValues = 1; possibleValues <= 9; possibleValues++) {
                if (isValid(board, row, col, possibleValues)) {
                    board[row][col] = possibleValues;
                    solveSudoku(board, nextI, nextJ);
                    board[row][col] = 0;
                }
            }
        }
    }

    private static boolean isValid(int[][] board, int row, int col, int possibleValues) {
        //for col check
        for (int j = 0; j < board[0].length; j++) {
            if (board[row][j] == possibleValues) {
                return false;
            }
        }

        //for row check
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == possibleValues) {
                return false;
            }
        }

        //for 3*3 box check
        int subMatrixI = row / 3 * 3;
        int subMatrixJ = col / 3 * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[subMatrixI + i][subMatrixJ + j] == possibleValues) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}