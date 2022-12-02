package OA.Test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "zzxyaa";
        System.out.println(firstNonRepeatChar(str));
    }

    private static char firstNonRepeatChar(String str) {
        //aaabbcdd
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
        for (char key : map.keySet()) {
            int val = map.get(key);
            if (val == 1) {
                return key;
            }
        }
        return '0';
    }
}
