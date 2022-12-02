package challengeQns.infosys;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        int row = 3;
        int[][] mat = {{3, 4, 8}, {5, 6, 9}, {7, 5, 4}};
        int res = traverse(mat);
        System.out.println(res);
    }

    private static int traverse(int[][] mat) {
        boolean leftToRight = true;
        int[] tempArr = new int[mat.length * mat[0].length];
        ArrayList<Integer> sqNum = new ArrayList<>();
        int x = 0, temp = 0;
        for (int i = 0; i < mat.length; i++) {
            if (leftToRight) {
                for (int j = 0; j < mat[0].length; j++) {
                    temp += mat[i][j];
                    if (isPerfect(temp)) {
                        sqNum.add(temp);
                        Arrays.fill(tempArr, 0);
                        temp = 0;
                        x = 0;
                    } else {
                        tempArr[x++] = mat[i][j];
                    }
                }
            } else {
                for (int j = mat[0].length - 1; j >= 0; j--) {
                    temp += mat[i][j];
                    if (isPerfect(temp)) {
                        sqNum.add(temp);
                        Arrays.fill(tempArr, 0);
                        temp = 0;
                        x = 0;
                    } else {
                        tempArr[x++] = mat[i][j];
                    }
                }
            }
            leftToRight = !leftToRight;
        }
        int max = 0;
        for (int val : sqNum) {
            max = Math.max(val, max);
        }
        return max == 0 ? -1 : max;
    }

    private static boolean isPerfect(int x) {
        if (x >= 0) {
            int sr = (int) Math.sqrt(x);
            return ((sr * sr) == x);
        }
        return false;
    }
}
