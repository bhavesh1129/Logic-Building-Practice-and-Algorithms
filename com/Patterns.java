package com;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        pattern3(num);
//        pattern4(num);
//        pattern31(num);
        pattern5(num);
    }

    private static void pattern31(int num) {
        int n = 2 * num;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int left = col;
                int right = n - col;
                int up = row;
                int down = n - row;
                int atEveryIndex = num - Math.min(Math.min(left, right), Math.min(up, down));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    private static void pattern4(int num) {
        for (int row = 1; row <= (2 * num - 1); row++) {
            if (row <= num) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            }
            if (row > num) {
                int val = row - num + 1;
                for (int col = 1; col <= num - val; col++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    private static void pattern3(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        int size = 2 * n - 1;
        int start = 0;
        int end = size - 1;
        int arr[][] = new int[size][size];
        while (n != 0) {
            for (int i = start; i <= end; i++) {
                for (int j = start; j <= end; j++) {
                    if (i == start || i == end || j == start || j == end) {
                        arr[i][j] = n;
                    }
                }
            }
            ++start;
            --end;
            --n;
        }
        printPattern(arr, size);
    }

    public static void printPattern(int a[][], int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j] + " ");
            }
            if (i < size - 1) {
                System.out.println();
            }
        }
    }
}
