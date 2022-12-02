package binarySearchPT;

import java.util.*;

public class UnixPathResolution {
    public static void main(String[] args) {
        String[] path = {"usr", "..", "usr", ".", "local", "bin", "docker"};
        String[] ans = solve(path);
        System.out.println(Arrays.toString(ans));
    }

    public static String[] solve(String[] path) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < path.length; i++) {
            if (path[i].equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
            if (!path[i].equals(".") && !path[i].equals("..")) {
                st.push(path[i]);
            }
        }
        String[] res = new String[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}
