package binarySearchPT;

import java.util.*;

public class threeSixNine {
    public static void main(String[] args) {
        int n = 26;
        String[] arr = solve2(n);
        System.out.println(Arrays.toString(arr));
    }

    public static String[] solve2(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            String s = String.valueOf(j);
            if (j % 3 == 0 || s.contains("3") || s.contains("6") || s.contains("9")) {
                arr[i] = "clap";
            } else {
                arr[i] = s;
            }
        }
        return arr;
    }

    public static String[] solve(int n) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                list.add("clap");
            } else {
                boolean find369 = false;
                if (!isSingleDigit(i)) {
                    int num = i;
                    while (num > 0) {
                        int temp = num % 10;
                        if (temp == 3 || temp == 6 || temp == 9) {
                            list.add("clap");
                            find369 = true;
                            break;
                        }
                        num /= 10;
                    }
                }
                if (!find369) {
                    list.add((String.valueOf(i)));
                }
            }
        }
        return list.toArray(new String[0]);
    }

    private static boolean isSingleDigit(int num) {
        int digits = Integer.toString(Math.abs(num)).trim().length();
        return digits == 1;
    }
}
