package binarySearchPT;

import java.util.*;

public class LongestSSWith2DistinctChars {
    public static void main(String[] args) {
        String str = "hhdhhbhww";
        System.out.println(solve2(str));
    }

    public static int solve2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int maxCount = 0;
        int firstIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            while (map.size() > 2) {
                map.put(arr[firstIdx], map.get(arr[firstIdx]) - 1);
                if (map.get(arr[firstIdx]) == 0) {
                    map.remove(arr[firstIdx]);
                }
                firstIdx++;
            }
            maxCount = Math.max(maxCount, i - firstIdx + 1);
        }
        return maxCount;
    }
}
