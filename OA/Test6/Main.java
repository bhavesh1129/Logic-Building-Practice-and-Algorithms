package OA.Test6;

public class Main {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (i < j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (isVowel(ch1) && isVowel(ch2)) {
                sb.setCharAt(i, ch2);
                sb.setCharAt(j, ch1);
                i++;
                j--;
            } else if (isVowel(ch1)) {
                j--;
            } else {
                i++;
            }
        }
        return sb.toString();
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
