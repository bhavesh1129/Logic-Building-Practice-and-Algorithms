package binarySearchPT;

import java.util.Arrays;

public class HappyNumbers {
    public static void main(String[] args) {
//        int n = 42;
//        System.out.println(solve(n));

        int[] tops = {2, 1, 2, 4, 2, 2};
        int[] bottoms = {5, 2, 6, 2, 3, 2};
        System.out.println(minDominoRotations(tops, bottoms));
    }

    public static int minDominoRotations(int[] tops, int[] bottoms) {
        int[] countA = new int[7];
        int[] countB = new int[7];
        int[] common = new int[7];
        for (int i = 0; i < tops.length; i++) {
            countA[tops[i]]++;
            countB[bottoms[i]]++;

            if (tops[i] == bottoms[i]) {
                common[tops[i]]++;
            }
        }
        for (int i = 0; i < 7; i++) {
            if (countA[i] + countB[i] - common[i] == tops.length) {
                return Math.min(countA[i] - common[i], countB[i] - common[i]);
            }
        }
        return -1;
    }

    public static boolean solve(int num) {
        int digit = 0;
        while (num > 9) {
            int sum = 0;
            while (num != 0) {
                digit = num % 10;
                digit = digit * digit;
                num /= 10;
                sum += digit;
            }
            num = sum;
        }
        if (num == 1 || num == 7) {
            return true;
        }
        return false;
    }
}
