package binarySearchPT;

import java.util.*;

public class ANumberAndItsTriple {
    public static void main(String[] args) {
        int[] nums = {3, 0};
        System.out.println(solve(nums));
    }

    public static boolean solve(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i] && map.containsKey(nums[i] * 3)) {
                return true;
            }
        }
        return false;
    }
}
