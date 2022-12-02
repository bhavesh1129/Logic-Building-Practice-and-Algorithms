package stack;

import java.util.*;

public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] ans = ngeI(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] ngeI(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int[] nge = new int[nums2.length];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        st.push(0);
        for (int i = 1; i < nums2.length; i++) {
            while (!st.isEmpty() && nums2[st.peek()] < nums2[i]) {
                nge[st.pop()] = nums2[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            nge[st.pop()] = -1;
        }
        for (int i = 0; i < nge.length; i++) {
            map.put(nums2[i], nge[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}