package OA.Test3;

public class ZirohLabOA {
    public static void main(String[] args) {
//        String str = "Hello6 9World 2, Nic8e D7ay!";
//        System.out.println(NumSearch(str));

//        String str2 = "af5c a#!";
//        System.out.println(NumberEncoding(str2));

//        int[] arr = {2, 3, 4, 1, 6, 10};
//        System.out.println(ArrayRotation(arr));

//        String[] arr = {"100", "000"};
//        System.out.println(BitwiseTwo(arr));
    }

    private static String BitwiseTwo(String[] arr) {
        String res = "";
        String str1 = arr[0], str2 = arr[1];
        for (int i = 0; i < arr[0].length(); i++) {
            if (str1.charAt(i) == '1' && str2.charAt(i) == '1') {
                res += 1;
            } else {
                res += 0;
            }
        }
        return res;
    }

    private static int ArrayRotation(int[] arr) {
        StringBuilder sb = new StringBuilder();
        int k = arr[0];
        for (int i = 0; i < k; i++) {
            int j, first;
            first = arr[0];
            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = first;
        }
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return Integer.parseInt(sb.toString());
    }

    private static String NumberEncoding(String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str2.length(); i++) {
            if (Character.isAlphabetic(str2.charAt(i))) {
                int num = str2.charAt(i) - 'a' + 1;
                sb.append(num);
            } else if (str2.charAt(i) == ' ') {
                sb.append(" ");
            } else {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    private static String NumSearch(String str) {
        int numSum = 0, letterCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                numSum += str.charAt(i) - '0';
            } else if (Character.isAlphabetic(str.charAt(i))) {
                letterCount++;
            }
        }
        int ans = (int) (Math.round(numSum / letterCount));
        return String.valueOf(ans);
    }
}
