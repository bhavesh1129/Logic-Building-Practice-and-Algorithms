package stack;

import java.util.Stack;

public class MinAddToMakeParenthesesValid {
    public static void main(String[] args) {
        String str = "()()";
        System.out.println(minAddToMakeValid(str));
    }

    private static int minAddToMakeValid(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                st.push('(');
            } else {
                if (st.isEmpty()) {
                    st.push(')');
                } else if (st.peek() == ')') {
                    st.push(')');
                } else {
                    st.pop();
                }
            }
        }
        return st.size();
    }
}
