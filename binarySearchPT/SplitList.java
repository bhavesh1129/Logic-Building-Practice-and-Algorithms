package binarySearchPT;

import java.util.*;

public class SplitList {
    public static void main(String[] args) {
        int[] nums = {5, 3, 2, 7, 9};
        System.out.println(solve(nums));
    }

    public static boolean solve(int[] nums) {
        int size = nums.length;
        if (size == 0) {
            return true;
        }
        ArrayList<Integer> leftMax = new ArrayList<>();
        ArrayList<Integer> rightMin = new ArrayList<>();
        leftMax.add(0, nums[0]);
        rightMin.add(0, nums[size - 1]);

        for (int i = 1; i < size; i++) {
            int val = Math.max(leftMax.get(i - 1), nums[i]);
            leftMax.add(i, val);
        }
        for (int i = size - 2; i >= 0; i--) {
            int val = Math.min(rightMin.get(i + 1), nums[i]);
            rightMin.add(i, val);
        }
        for (int i = 0; i < size - 1; i++) {
            if (leftMax.get(i) < rightMin.get(i + 1)) {
                return true;
            }
        }
        return false;
    }
}
