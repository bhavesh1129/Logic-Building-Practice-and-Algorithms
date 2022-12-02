package hashmap;

import java.util.*;

public class SmallestSubstringContainAllCharOfAnother {
    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "aa";
        sol(str1, str2);
    }

    private static void sol(String str1, String str2) {
        Map<Character, Integer> map2 = new TreeMap<>();
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
//        System.out.println(map2);
        int matchedStr = 0;
        int resultMatchStr = str2.length();
        String ans = "";
        Map<Character, Integer> map1 = new TreeMap<>();
        int i = -1, j = -1;
        while (true) {
            boolean flag1 = false;
            boolean flag2 = false;

            //acquire
            while (i < str1.length() - 1 && matchedStr < resultMatchStr) {
                i++;
                char ch = str1.charAt(i);
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);

                if (map1.getOrDefault(ch, 0) <= map2.getOrDefault(ch, 0)) {
                    matchedStr++;
                }
                flag1 = true;
            }
//            System.out.println(map1);

            //collect
            while (j < i && matchedStr == resultMatchStr) {
                String str = str1.substring(j + 1, i + 1);
                if (ans.length() == 0 || str.length() < ans.length()) {
                    ans = str;
                }
                j++;
                //remove
                char ch = str1.charAt(j);
                if (map1.get(ch) == 1) {
                    map1.remove(ch);
                } else {
                    map1.put(ch, map1.get(ch) - 1);
                }
                if (map1.getOrDefault(ch, 0) < map2.getOrDefault(ch, 0)) {
                    matchedStr--;
                }
                flag2 = true;
            }
            if (!flag1 && !flag2) {
                break;
            }
        }
        System.out.println(ans);
    }
}
