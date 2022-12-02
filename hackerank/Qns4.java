package hackerank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Qns4 {
    public static void main(String[] args) {
//        int[] arr = {3, 4, 5, 2, 1, 1};
//        int target = 3;
//        System.out.println(sol(arr, target));
    }

    private static int sol(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) >= target) {
                    count++;
                    System.out.println(i + "-" + j);
                }
            }
        }
        return count;
    }
}
