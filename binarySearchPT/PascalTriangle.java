package binarySearchPT;

import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.toString(solve(n)));
    }

    public static int[] solve(int n) {
        int[] res = new int[n + 1];
        List<List<Integer>> mL = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            List<Integer> list = new ArrayList<>();
            if (i == 0) {
                list.add(1);
            } else if (i == 1) {
                list.add(1);
                list.add(1);
            } else {
                list.add(1);
                for (int j = 1; j < i; j++) {
                    list.add(mL.get(i - 1).get(j) + mL.get(i - 1).get(j - 1));
                }
                list.add(1);
            }
            mL.add(list);
        }
        for (int i = 0; i <= n; i++) {
            res[i] = mL.get(n).get(i);
        }
        return res;
    }
}
