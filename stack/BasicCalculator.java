package stack;

import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        String str = "-2+ 1";
        System.out.println(calculate(str));
    }

    private static int calculate(String str) {
        Stack<Character> opeartors = new Stack<>();
        Stack<Integer> operands = new Stack<>();

        for (char ch : str.trim().toCharArray()) {
            if (Character.isDigit(ch)) {
                if (operands.size() == 1) {
                    int pop1 = ch - '0';
                    int pop2 = operands.pop();
                    if (!opeartors.isEmpty()) {
                        int res = evaluate(pop1, pop2, opeartors.pop());
                        operands.push(res);
                    } else {
                        return Integer.parseInt(str.trim());
                    }
                } else {
                    operands.push(ch - '0');
                }
            } else if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                opeartors.push(ch);
            }
        }
//        System.out.println(operands);
        return operands.pop();
    }

    private static int evaluate(int second, int first, char opeartor) {
        if (opeartor == '+') {
            return (first + second);
        } else if (opeartor == '-') {
            return (first - second);
        } else if (opeartor == '*') {
            return (first * second);
        } else {
            return (first / second);
        }
    }
}