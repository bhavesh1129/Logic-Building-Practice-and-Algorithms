package recursion;

import java.util.Scanner;

public class KthSymInGrammar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(kthGrammar(n, k));
    }

    private static int kthGrammar(int n, int k) {
        if (n == 1 && k == 1) {
            return 0;
        }
        int length = (int) Math.pow(2, n - 1);
        int mid = length / 2;
        if (k <= mid) {
            return kthGrammar(n - 1, k);
        } else {
            return kthGrammar(n - 1, k - mid) == 0 ? 1 : 0;
        }
    }
}
