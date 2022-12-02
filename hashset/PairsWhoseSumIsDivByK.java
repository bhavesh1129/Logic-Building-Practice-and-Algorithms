package hashset;

import java.util.*;

public class PairsWhoseSumIsDivByK {
    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 3, 13};
        int k = 6;
//        pairsWhoseSumIsDivByK(arr, k);
        int[][] mat = {{1, 2, 3}, {1, 1, 1}, {1, 2, 3}};
        System.out.println(checkValid(mat));
    }

    private static void pairsWhoseSumIsDivByK(int[] arr, int k) {
        Map<Integer, Integer> map = new TreeMap<>();
        int count = 0;
        for (int val : arr) {
            int rem = val % k;
            map.put(rem, map.getOrDefault(rem, count) + 1);
        }
        int cnt = 0;
        for (int val : arr) {
            int rem = val % k;
            if (map.containsKey(k - rem)) {
                map.put(rem, map.get(rem) - 1);
                cnt++;
            }
        }
//        System.out.println(map);
//        System.out.println(cnt);
    }

    public static boolean checkValid(int[][] matrix) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                map.put(matrix[i][j], map.getOrDefault(matrix[i][j], 0) + 1);
            }
        }
        for (int val : map.values()) {
            if (val != matrix.length) {
                return false;
            }
        }
        return true;
    }
}
