package hashmap;

import java.util.*;

public class CountDistinctElementsInEveryWindowOfSizeK {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {1, 2, 1, 3, 4, 3};
        int k = 3;
        ArrayList<Integer> ans = countElements(arr, k);
        System.out.println(ans);
    }

    private static ArrayList<Integer> countElements(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int j = 0, i = k - 1; i < arr.length; i++, j++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            System.out.println(map.size());
            list.add(map.size());
            int freq = map.get(arr[j]);
            if (freq == 1) {
                map.remove(arr[j]);
            } else {
                map.put(arr[j], freq - 1);
            }
        }
        System.out.println(map);
        return list;
    }
}
