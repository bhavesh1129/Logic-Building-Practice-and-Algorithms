package binarySearchPT;

import java.util.*;

public class PairSumOfPower2 {
    public static void main(String[] args) {
        int[] nums = {0, 0};
        System.out.println(countPair2(nums));
    }

    private static int countPair2(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum != 0 && (sum & (sum - 1)) == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int countPair(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for (int i = 0; i < 32; i++) {
            set.add((int) (Math.pow(2, i)));
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (set.contains(nums[i] + nums[j])) {
                    res++;
                }
            }
        }
        return res;
    }
}
