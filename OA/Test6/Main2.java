package OA.Test6;

import java.util.Stack;

public class Main2 {
    public void main(String[] args) {
        String str = "{(a + b)}";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (char i : str.toCharArray()) {
            if (i == '(') {
                stack.push(')');
            } else if (i == '[') {
                stack.push(']');
            } else if (i == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != i) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
