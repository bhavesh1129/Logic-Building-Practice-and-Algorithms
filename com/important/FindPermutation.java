package com.important;

import java.util.ArrayList;

public class FindPermutation {
    public static void main(String[] args) {
        String str = "DIID";
        int n = 5;
        findPerm(str, n);
    }

    private static void findPerm(String str, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = n;
        int min = 1;
        for (char ch : str.toCharArray()) {
            if (ch == 'D') {
                ans.add(max);
                max--;
            } else {
                ans.add(min);
                min++;
            }
        }
        ans.add(min);
        System.out.println(ans);
    }
}
