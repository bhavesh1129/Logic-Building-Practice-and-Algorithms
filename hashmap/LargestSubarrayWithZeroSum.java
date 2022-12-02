package hashmap;

import java.util.*;

public class LargestSubarrayWithZeroSum {
    public static void main(String[] args) {
        int n = 8;
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(largestZeroSum(arr));
    }

    private static int largestZeroSum(int[] arr) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(sum, -1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                int len = i - map.get(sum);
                if (len > count) {
                    count = len;
                }
            } else {
                map.put(sum, i);
            }
        }
//        System.out.println(map);
        return count;
    }
}
