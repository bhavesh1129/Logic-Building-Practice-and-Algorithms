package hashmap;

import java.util.*;

public class ThreeSumWithMultiplicity {
    public static void main(String[] args) {
//        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
//        int target = 8;
//        System.out.println(threeSumMulti1(arr, target));
    }

    public static int threeSumMulti1(int[] A, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int mod = 1000000007;
        for (int i = 0; i < A.length; i++) {
            res = (res + map.getOrDefault(target - A[i], 0)) % mod;

            for (int j = 0; j < i; j++) {
                int temp = A[i] + A[j];
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }
        return res;
    }

    private static int threeSumMulti(int[] arr, int target) {
        Map<Integer, Long> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0l) + 1l);
        }
        System.out.println(map);
        long ans = 0l;
        for (int i : map.keySet()) {
            for (int j : map.keySet()) {
                int k = target - i - j;
                if (map.containsKey(k)) {
                    long freq1 = map.get(i);
                    long freq2 = map.get(j);
                    long freq3 = map.get(k);
                    if (i == j && j == k) {
                        ans += ((freq1) * (freq2 - 1) * (freq3 - 2)) / 6;
                    } else if (i == j && i != k) {
                        ans += ((freq1) * (freq2 - 1)) / 2 * freq3;
                    } else if (i < j && j < k) {
                        ans += freq1 * freq2 * freq3;
                    }
                }
                ans = ans % 1000000007;
            }
        }
        return (int) ans;
    }
}
