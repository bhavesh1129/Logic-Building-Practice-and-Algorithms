package com;

import java.util.*;

public class Practice {

    public static void main(String[] args) {
//        int[][] costs = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};
//        System.out.println(twoCitySchedCost(costs));
//        int[][] mat = {{1, 1, 0, 0, 0},
//                {1, 1, 1, 1, 0},
//                {1, 0, 0, 0, 0},
//                {1, 1, 0, 0, 0},
//                {1, 1, 1, 1, 1}};
//        int k = 3;
//        int[] ans = kWeakestRows(mat, k);
//        System.out.println(Arrays.toString(ans));


//        int[][] mat = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
//        int[][] ans = merge(mat);
//        for (int[] i : ans) {
//            System.out.println(Arrays.toString(i));
//        }


//        int[] nums = {1, 1, 1, 1, 1};
//        int target = 3;
//        System.out.println(findTargetSumWays(nums, target));


//        System.out.println(longestValidParentheses("()(()"));


//        int[] nums = {1, -1};
//        int k = 0;
//        System.out.println(maxSlidingWindow(nums, k));
//        int[] tasks = {4, 4, 4, 4};
//        System.out.println(minimumRounds(tasks));
        int[] nums1 = {55, 30, 5, 4, 2}, nums2 = {100, 20, 10, 10, 5};
        System.out.println(maxDistance(nums1, nums2));
    }

    public static int maxDistance(int[] A, int[] B) {
        int res = 0, j = -1;
        for (int i = 0; i < A.length; i++) {
            while (j + 1 < B.length && A[i] <= B[j + 1]) {
                j++;
            }
            res = Math.max(res, j - i);
        }
        return res;
    }

    public String[] solve(String digits) {
        List<String> ans = new ArrayList<>();
        return ans.toArray(new String[0]);
    }

    public static int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : tasks) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int count = 0;
        for (int freq : map.values()) {
            if (freq == 1) {
                return -1;
            }
            count += (freq + 2) / 3;
        }
        return count;
    }

    public static int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        List<Integer> list = new ArrayList<>(n);
        int totalCost = 0;
        for (int i = 0; i < n; i++) {
            totalCost += costs[i][0];
            list.add(i, costs[i][1] - costs[i][0]);
        }
        Collections.sort(list);
        for (int i = 0; i < n / 2; i++) {
            totalCost += list.get(i);
        }
        return totalCost;
    }

    public static int[] kWeakestRows(int[][] matrix, int k) {
        int[] countArr = new int[matrix.length];
        ArrayList<Integer> sortedArr = new ArrayList<>();

        // count soliders
        for (int i = 0; i < matrix.length; i++) {
            int countSoilders = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    countSoilders++;
                } else {
                    break;
                }
            }
            countArr[i] = countSoilders;
            sortedArr.add(i);
        }

        // sort array
        for (int i = 1; i < countArr.length; i++) {
            int app = i;
            for (int j = i - 1; j >= 0; j--) {
                if (countArr[i] < countArr[j]) {
                    app--;
                }
            }
            sortedArr.remove(i);
            sortedArr.add(app, i);
        }

        // print kth array
        int[] res = new int[k];
        for (int i = 0; i < res.length; i++) {
            res[i] = sortedArr.get(i);
        }
        return res;
    }

    public int solve(String str, int k) {
        return longestSubString(str, 0, str.length(), k);
    }

    public int longestSubString(String str, int start, int end, int k) {
        int left, right;
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        for (int i = start; i < end; i++) {
            if (freq[str.charAt(i) - 'a'] < k) {
                left = longestSubString(str, start, i, k);
                right = longestSubString(str, i + 1, end, k);
                return Math.max(left, right);
            }
        }
        return end - start;
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int ans = 0;
        LinkedList<int[]> merged = new LinkedList();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] <= interval[0]) {
                merged.add(interval);
            } else {
                ans++;
                if (merged.getLast()[1] > interval[1]) {
                    merged.removeLast();
                    merged.add(interval);
                }
            }
        }
        return ans;
    }

    public static void maxSlidingWindow(int[] nums, int k) {
        if (nums.length <= 1) {
            System.out.println(Arrays.toString(nums));
            return;
        }
        int[] res = new int[nums.length - k + 1];
        int x = 0;
        int max = nums[0];
        for (int i = 0; i < k; i++) {
            max = Math.max(max, nums[i]);
        }
        res[x++] = max;
        max = nums[1];
        for (int j = 1; j <= nums.length - k; j++) {
            for (int p = j; p < j + k; p++) {
                max = Math.max(max, nums[p]);
            }
            res[x++] = max;
            if (j + 1 < nums.length) {
                max = nums[j + 1];
            }
        }
        System.out.println(Arrays.toString(res));
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    Set<Integer> visited = new HashSet();
    boolean found = false;

    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == word.charAt(0)) {
                    dfs(board, i, j, word, 0, row, col);
                    visited = new HashSet();
                }
            }
        }
        return found;
    }

    private void dfs(char[][] board, int i, int j, String word, int ptr, int m, int n) {
        if (i < 0 || j < 0 || i >= m || j >= n) {
            return;
        }
        if (visited.contains(i + j)) {
            return;
        }
        if (board[i][j] == word.charAt(ptr)) {
            ptr++;
            visited.add(i + j);
            if (ptr == word.length()) {
                found = true;
                return;
            }
        } else {
            return;
        }
        dfs(board, i + 1, j, word, ptr, m, n);
        dfs(board, i - 1, j, word, ptr, m, n);
        dfs(board, i, j + 1, word, ptr, m, n);
        dfs(board, i, j - 1, word, ptr, m, n);
        visited.remove(i + j);
    }

    static int m = 0;

    public static int findTargetSumWays(int[] nums, int target) {
        calculate(nums, 0, 0, target);
        return m;
    }

    public static void calculate(int[] nums, int i, int sum, int target) {
        if (i == nums.length) {
            if (sum == target) {
                m++;
            }
        } else {
            calculate(nums, i + 1, sum + nums[i], target);
            calculate(nums, i + 1, sum - nums[i], target);
        }
    }

    public static int longestValidParentheses(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }
}
