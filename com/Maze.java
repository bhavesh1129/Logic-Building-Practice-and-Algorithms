package com;

import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
//        normalPath("", 3, 3);
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        mazeWithRestrictions("", maze, 0, 0);
        int[][] path = new int[maze.length][maze[0].length];
        mazeUsingBacktracking("", maze, 0, 0, path, 1);
    }

    private static void mazeUsingBacktracking(String s, boolean[][] maze, int row, int col, int[][] path, int step) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(s);
            System.out.println();
            return;
        }
        /* obstacle */
        if (!maze[row][col]) {
            return;
        }
        maze[row][col] = false;
        path[row][col] = step;
        //down
        if (row < maze.length - 1) {
            mazeUsingBacktracking(s + "D", maze, row + 1, col, path, step + 1);
        }
        //right
        if (col < maze[0].length - 1) {
            mazeUsingBacktracking(s + "R", maze, row, col + 1, path, step + 1);
        }
        //up
        if (row > 0) {
            mazeUsingBacktracking(s + "U", maze, row - 1, col, path, step + 1);
        }
        //left
        if (col > 0) {
            mazeUsingBacktracking(s + "L", maze, row, col - 1, path, step + 1);
        }
        maze[row][col] = true;
        path[row][col] = 0;
    }

    private static void normalPath(String s, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(s);
            return;
        }
        //down
        if (row > 1) {
            normalPath(s + "D", row - 1, col);
        }
        //right
        if (col > 1) {
            normalPath(s + "R", row, col - 1);
        }
    }

    private static void mazeWithRestrictions(String s, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(s);
            return;
        }
        /* obstacle */
        if (!maze[row][col]) {
            return;
        }
        //down
        if (row < maze.length - 1) {
            mazeWithRestrictions(s + "D", maze, row + 1, col);
        }
        //right
        if (col < maze[0].length - 1) {
            mazeWithRestrictions(s + "R", maze, row, col + 1);
        }
    }
}
