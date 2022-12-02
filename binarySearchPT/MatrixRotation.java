package binarySearchPT;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixRotation {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        rotate(arr);
//        solve(arr);
        int[] ans = solve(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] solve(int[][] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int row = arr.length;
        if (row == 0) {
            int[] emptyArr = {};
            return emptyArr;
        }
        int col = arr[0].length;
        int[] ans = new int[row * col];
        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = col - 1;
        int k = 0;
        if (arr.length == 0 || arr[0].length == 0) {
            return ans;
        }

        while (k < row * col) {
            // top
            for (int i = top, j = left; j <= right; j++) {
                res.add(arr[i][j]);
            }
            top++;
            if (left > right || top > bottom)
                break;

            // right
            for (int i = top, j = right; i <= bottom; i++) {
                res.add(arr[i][j]);
            }
            right--;
            if (top > bottom || left > right)
                break;

            // bottom
            for (int i = bottom, j = right; j >= left; j--) {
                res.add(arr[i][j]);
            }
            bottom--;
            if (top > bottom || left > right)
                break;

            // left
            for (int i = bottom, j = left; i >= top; i--) {
                res.add(arr[i][j]);
            }
            left++;
            if (top > bottom || left > right)
                break;
            k++;
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }

    public static void solve2(int[][] matrix) {
        int[][] arr = new int[matrix.length][matrix[0].length];
        int k = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[k][j] = matrix[j][i];
            }
            k++;
        }
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static void rotate(int[][] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int[] temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
