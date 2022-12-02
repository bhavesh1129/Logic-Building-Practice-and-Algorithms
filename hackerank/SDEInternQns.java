package hackerank;

public class SDEInternQns {
    public static void main(String[] args) {
        String str = "five one zero two four triple zero double three";
        System.out.println(getPhoneNumber(str));
    }

    public static String getPhoneNumber(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        String ans = "";
        for (int i = 1; i <= arr.length; i++) {
            String str = arr[i - 1];
            if (str.equals("double")) {
                String temp = arr[i];
                ans = numString(temp);
                if (!ans.equals("null")) {
                    sb.append(ans);
                }
            } else if (str.equals("triple")) {
                String temp = arr[i];
                ans = numString(temp);
                if (!ans.equals("null")) {
                    sb.append(ans);
                    sb.append(ans);
                }
            }
            ans = numString(str);
            if (!ans.equals("null")) {
                sb.append(ans);
            }
        }
        return sb.toString();
    }

    public static String numString(String str) {
        switch (str) {
            case "one":
                return "1";
            case "two":
                return "2";
            case "three":
                return "3";
            case "four":
                return "4";
            case "five":
                return "5";
            case "six":
                return "6";
            case "seven":
                return "7";
            case "eight":
                return "8";
            case "nine":
                return "9";
            case "zero":
                return "0";
        }
        return "null";
    }
}
