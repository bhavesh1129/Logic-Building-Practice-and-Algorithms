package challengeQns.infosys;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = sc.next();
        }
        float ans = sol(strArr);
        System.out.printf("%.2f", ans);
    }

    private static float sol(String[] strArr) {
        ArrayList<Integer> newNumList = new ArrayList<>();
        boolean containsSix = false;
        for (String val : strArr) {
            char[] numArr = val.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char ch : numArr) {
                if (Objects.equals(ch, '6')) {
                    ch = '9';
                    containsSix = true;
                }
                sb.append(ch);
            }
            if (containsSix) {
                sb = sb.reverse();
            }
            containsSix = false;
            newNumList.add(Integer.parseInt(String.valueOf(sb)));
        }
        System.out.println(newNumList);
        float sum = 0;
        for (int val : newNumList) {
            sum += val;
        }
        return sum / newNumList.size();
    }
}
