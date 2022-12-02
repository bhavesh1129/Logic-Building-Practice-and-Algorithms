package binarySearchPT;

import java.util.*;

public class AnagramChecks {
    public static void main(String[] args) {
        String s0 = "a";
        String s1 = "b";
//        String s0 = "bedroom";
//        String s1 = "bathroom";
        System.out.println(solve(s0, s1));
    }

    public static boolean solve(String s0, String s1) {
        if (s0.length() != s1.length()) {
            return false;
        }
        Map<Character, Integer> map1 = new LinkedHashMap<>();
        Map<Character, Integer> map2 = new LinkedHashMap<>();
        for (char ch : s0.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s1.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        for (char ch : map1.keySet()) {
            if (map2.containsKey(ch)) {
                int count1 = map1.get(ch);
                int count2 = map2.get(ch);
                if (count1 != count2) {
                    return false;
                }
            } else {
                return false;
            }
        }
        System.out.println(map1);
        System.out.println(map2);
        return true;
    }
}
