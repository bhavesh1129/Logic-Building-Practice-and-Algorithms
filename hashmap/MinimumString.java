package hashmap;

import java.util.*;

public class MinimumString {
    public static void main(String[] args) {
        String s = "ehyoe", t = "hello";
        System.out.println(solve(s, t));
    }

    public static int solve(String s, String t) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            arr[c - 'a']--;
        }
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                cnt += arr[i];
            }
        }
        return cnt;
    }
}
