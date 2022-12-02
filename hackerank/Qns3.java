package hackerank;

import java.util.*;

public class Qns3 {
    public static void main(String[] args) {
        String str = "caberqiitefg";
//        String str = "qwdftr";
        int k = 5;
        System.out.println(findSubstring2(str, k));
    }

    public static String findSubstring(String str, int k) {
        Map<String, Integer> map = new LinkedHashMap<>();
        int countVowels = 0;
        String s2 = "";
        for (int i = 0; i <= str.length() - k; i++) {
            for (int j = i; j < k + i; j++) {
                s2 += str.charAt(j);
                if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i'
                        || str.charAt(j) == 'o' || str.charAt(j) == 'u') {
                    countVowels++;
                }
            }
            map.put(s2, countVowels);
            s2 = "";
            countVowels = 0;
        }
        // System.out.println(map);
        for (String val : map.keySet()) {
            int vowelCount = map.get(val);
            if (vowelCount > countVowels) {
                countVowels = vowelCount;
                s2 = val;
            }
        }
        return countVowels != 0 ? s2 : "Not found!";
    }

    public static String findSubstring2(String str, int k) {
        Map<String, Integer> map = new LinkedHashMap<>();
        int countVowels = 0;
        String s2 = "";
        int i = 0;
        for (i = 0; i < k; i++) {
            s2 += str.charAt(i);
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                countVowels++;
            }
        }
        map.put(s2, countVowels);
        s2 = "";
        countVowels = 0;
        i = 1;
        for (int j = i; j < k + i && j < str.length() - k; j++) {
            s2 += str.charAt(j);
            if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i'
                    || str.charAt(j) == 'o' || str.charAt(j) == 'u') {
                countVowels++;
            }
        }
        map.put(s2, countVowels);
        i++;
        s2 = "";
        countVowels = 0;
        System.out.println(map);
        for (String val : map.keySet()) {
            int vowelCount = map.get(val);
            if (vowelCount > countVowels) {
                countVowels = vowelCount;
                s2 = val;
            }
        }
        return countVowels != 0 ? s2 : "Not found!";
    }


}
