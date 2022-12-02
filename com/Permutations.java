package com;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> res = permutations("", str);
        System.out.println(res);
    }

    private static ArrayList<String> permutations(String proc, String unproc) {
        if (unproc.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
            return list;
        }
        char ch = unproc.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= proc.length(); i++) {
            String left = proc.substring(0, i);
            String right = proc.substring(i, proc.length());
            ans.addAll(permutations(left + ch + right, unproc.substring(1)));
        }
        return ans;
    }
}
