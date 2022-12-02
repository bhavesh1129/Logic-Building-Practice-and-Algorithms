package binarySearchPT;

import java.util.*;

public class BreakStringIntoWords {
    public static void main(String[] args) {
        String[] words = {"hello", "world"};
        String s = "hellofoobarworld";
        System.out.println(solve(words, s));
    }

    private static boolean solve(String[] words, String s) {
        List<String> dict = new ArrayList<>();
        for (String str : words) {
            dict.add(str);
        }
        return wordBreak(s, dict);
    }

    public static boolean wordBreak(String s, List<String> dict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String subStr = s.substring(j, i);
                if (dp[j] && dict.contains(subStr)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
