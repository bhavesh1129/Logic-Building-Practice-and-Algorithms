package binarySearchPT;

import java.util.*;

public class LongestSubWithCharCountOfAtleastK {
    public static void main(String[] args) {
        String s = "abccddeefg";
        int k = 2;
        System.out.println(solve(s, k));
    }

    public static int solve(String s, int k) {
        int maxLen = 0;
        int freq[] = new int[26];
        Arrays.fill(freq, 0);
        for (int i = 0; i < s.length(); i++) {
            setZero(freq);
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;
                if (atLeastK(freq, k)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    private static void setZero(int[] freq) {
        for (int i = 0; i < 26; i++) {
            freq[i] = 0;
        }
    }

    private static boolean atLeastK(int freq[], int k) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0 && freq[i] < k)
                return false;
        }

        return true;
    }
}
