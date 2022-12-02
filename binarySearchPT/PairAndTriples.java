package binarySearchPT;

import java.util.*;

public class PairAndTriples {
    public static void main(String[] args) {
        String str = "343";
        System.out.println(solve2(str));
    }

    private static boolean solve2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        int pairs = 0;
        for (int freq : map.values()) {
            if (freq == 2 || (freq - 2) % 3 == 0)
                pairs++;
            else if (freq % 3 != 0)
                return false;
        }
        return pairs == 1;
    }

    private static boolean solve(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
        int countPair = 0, countTrip = 0;
        boolean flag = true;
        for (char i : map.keySet()) {
            int val = map.get(i);
            if ((val - 3) % 2 == 0 && (val - 2) % 3 == 0) {
                countPair++;
                countTrip++;
            } else if (val % 2 == 0) {
                if (val - 2 == 0) {
                    countPair++;
                }
            } else if (val % 3 == 0) {
                countTrip++;
            }
            if (val == 1) {
                flag = false;
            }
        }
        System.out.println(countPair + " - " + countTrip);
        if (flag && countPair == 1 && countTrip >= 0 && (countPair * 2 + countTrip * 3 == s.length())) {
            return true;
        }
        return false;
    }
}