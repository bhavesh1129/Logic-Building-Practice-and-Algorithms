package binarySearchPT;

import java.util.ArrayList;

public class MonotonusStringGroup {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(solve(str));
    }

    public static int solve(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int count = 1;
        Boolean isIncreasing = null;
        for (int i = 1; i < s.length(); i++) {
            if (isIncreasing == null) {
                isIncreasing = s.charAt(i) > s.charAt(i - 1);
            }

            if (isIncreasing && s.charAt(i) <= s.charAt(i - 1) ||
                    !isIncreasing && s.charAt(i) >= s.charAt(i - 1)) {
                isIncreasing = null;
                count++;
            }
        }
        return count;
    }
}
