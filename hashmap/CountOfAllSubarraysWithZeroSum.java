package hashmap;

import java.util.HashMap;

public class CountOfAllSubarraysWithZeroSum {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {0, 0, 5, 5, 0, 0};
        System.out.println(subArrWithZeroSum(arr));
    }

    private static int subArrWithZeroSum(int[] arr) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(sum, -1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                count += map.get(sum);
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        System.out.println(map);
        return count;
    }
}
