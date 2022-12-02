package binarySearchPT;

import java.util.*;

public class RemoveOneLetter {
    public static void main(String[] args) {
        String s0 = "hello";
        String s1 = "helo";
        System.out.println(solve(s0, s1));
    }

    public static boolean solve(String s0, String s1) {
//        s0 -> large string and s1 -> small string
        if (s0.length() != s1.length() + 1) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s0.charAt(i)) {
                return s1.substring(i) == s0.substring(i + 1);
            }
        }
        return true;
    }
}
