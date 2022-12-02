package binarySearchPT;

import java.util.*;

public class CompleteArithmeticSequence {
    public static void main(String[] args) {
        int[] nums = {0, 0};
        System.out.println(solve2(nums));
    }

    private static int solve2(int[] arr) {
        int n = arr.length;
        if (n == 2 && arr[0] == 0 && arr[1] == 0) {
            return 0;
        }
        int diff = (arr[n - 1] - arr[0]) / n;
        return findMissingUtil(arr, 0, n - 1, diff);
    }

    private static int findMissingUtil(int arr[], int low, int high, int diff) {
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if ((arr[mid] - arr[0]) / diff == mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return arr[high] + diff;
    }

    public static int solve3(int[] nums) {
        int commDiff = nums[1] - nums[0];
        int nextElm = 0;
        for (int i = 1; i < nums.length; i++) {
            nextElm = nums[i - 1] + commDiff;
            if (nums[i] != nextElm) {
                return nextElm;
            }
        }
        return -1;
    }
}
