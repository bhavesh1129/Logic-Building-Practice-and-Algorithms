package binarySearchPT;

import java.util.*;

public class InPlaceMoveZerosToEndOfList {
    public static void main(String[] args) {
//        int[] nums = {0, 1, 0, 2, 3};
//        System.out.println(Arrays.toString(solve(nums)));

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solve2(nums)));
    }

    public static int[] solve2(int[] nums) {
        int[] ans = new int[nums.length];
        int k = 0, mul = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    mul *= nums[j];
                }
            }
            ans[k++] = mul;
            mul = 1;
        }
        return ans;
    }

    public static int[] solve(int[] nums) {
        int[] res = new int[nums.length];
        int j = nums.length - 1, k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                res[j--] = 0;
            } else {
                res[k++] = nums[i];
            }
        }
        return res;
    }
}
