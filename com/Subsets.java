package com;

import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        String str = "123";
        ArrayList<String> res = subsequenceOfStr("", str);
        System.out.println(res);
    }

    private static ArrayList<String> subsequenceOfStr(String proc, String unproc) {
        if (unproc.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
            return list;
        }
        ArrayList<String> first = subsequenceOfStr(proc, unproc.substring(1));
        ArrayList<String> second = subsequenceOfStr(proc + unproc.charAt(0), unproc.substring(1));
//        ArrayList<String> third = subsequenceOfStr(proc + (unproc.charAt(0) + 0), unproc.substring(1));

        first.addAll(second);
//        first.addAll(third);
        return first;
    }
}
