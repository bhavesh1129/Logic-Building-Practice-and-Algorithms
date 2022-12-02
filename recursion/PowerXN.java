package recursion;

import java.util.Scanner;

public class PowerXN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(powerXN(x, n));
    }

    private static double powerXN(double x, int n) {
        if (n > 0) {
            return x * powerXN(x, n - 1);
        } else if (n == 0) {
            return 1;
        } else {
            double ans = x * powerXN(x, n + 1);
            return 1 / ans;
        }
    }
}
