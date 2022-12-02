package stack;

import java.util.Arrays;
import java.util.Stack;

public class MaxRectangle {
    public static void main(String[] args) {
        int[] ht = {2, 1, 5, 6, 2, 3};
        histogram(ht);
    }

    private static int histogram(int[] ht) {
        //NSE
        Stack<Integer> st1 = new Stack<>();
        int[] nse = new int[ht.length];
        st1.push(0);
        for (int i = 0; i < ht.length; i++) {
            while (!st1.isEmpty() && ht[st1.peek()] > ht[i]) {
                nse[st1.pop()] = i;
            }
            st1.push(i);
        }
        while (!st1.isEmpty()) {
            nse[st1.pop()] = ht.length;
        }
        System.out.println(Arrays.toString(nse));

        //PSE
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int[] pse = new int[ht.length];
        pse[0] = -1;

        for (int i = 1; i < ht.length; i++) {
            while (!st.isEmpty() && ht[st.peek()] >= ht[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                pse[i] = st.peek();
            } else {
                pse[i] = -1;
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(pse));

        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < ht.length; i++) {
            int area = ht[i] * (nse[i] - pse[i] - 1);
            maxArea = Math.max(area, maxArea);
        }
        System.out.println(maxArea);
        return maxArea;
    }

    public static int maxRect(char[][] mat) {
        int[] ht = new int[mat[0].length];
        int maxAns = Integer.MIN_VALUE;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == '1') {
                    //add 1 to ht
                    ht[j] = ht[j] + 1;
                } else {
                    ht[j] = 0;
                }
            }
            System.out.println(Arrays.toString(ht));
            int area = histogram(ht);
            maxAns=Math.max(area,maxAns);
        }
        return maxAns;
    }
}