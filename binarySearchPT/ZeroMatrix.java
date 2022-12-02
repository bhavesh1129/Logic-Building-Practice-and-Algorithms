package binarySearchPT;

import java.util.Arrays;

public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{5, 0, 0, 5, 8},
                {9, 8, 10, 3, 9},
                {0, 7, 2, 3, 1},
                {8, 0, 6, 7, 2},
                {4, 1, 8, 5, 10}};
        int[][] ans = sol(matrix);
        System.out.println(Arrays.toString(ans));
    }

    private static int[][] sol(int[][] matrix) {
        int[] r = new int[matrix.length];
        int[] c = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    r[i] = 1;
                    c[j] = 1;
                }
            }
        }
        System.out.println(Arrays.toString(r));
        System.out.println(Arrays.toString(c));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (r[i] == 1 || c[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}
