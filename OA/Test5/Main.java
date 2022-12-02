package OA.Test5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        String s1 = "act";
//        String s2 = "tac";
//        System.out.print(isAnagram(s1, s2));

//        int[] arr = {67, 76, 55, 99, 80, 33, 21, 24};
//        int k = 2;
//        System.out.println(sol(arr, k));

//        String str = "(a+b)";
//        System.out.println(isValid(str));

        String str = "";
        System.out.println(sol(str));
    }

    private static boolean sol(String str) {

        String newStr = str.toLowerCase();
        int length = newStr.length();
        int halfLength = length / 2;
        int count1 = 0, count2 = 0;
        for (int i = 0; i < halfLength; i++) {
            if (newStr.charAt(i) == 'a' || newStr.charAt(i) == 'e' || newStr.charAt(i) == 'i' ||
                    newStr.charAt(i) == 'o' || newStr.charAt(i) == 'u') {
                count1++;
            }
        }
        for (int i = halfLength; i < length; i++) {
            if (newStr.charAt(i) == 'a' || newStr.charAt(i) == 'e' || newStr.charAt(i) == 'i' ||
                    newStr.charAt(i) == 'o' || newStr.charAt(i) == 'u') {
                count2++;
            }
        }
        return count1 == count2;
    }

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (char i : str.toCharArray()) {
            if (i == '(' || i == ')' || i == '{' || i == '}' || i == '[' || i == ']') {
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
        }
        return stack.isEmpty();
    }

    public static boolean isAnagram(String str1, String str2) {
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        boolean ans = Arrays.equals(charArr1, charArr2);
        return ans;
    }

    public static boolean sol(int[] arr, int k) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (index == -1) {
                    index = i;
                } else if (i - k == index + 1) {
                    index = i;
                } else if (i - k != index + 1) {
                    return false;
                }
            }
        }
        return true;
    }
}