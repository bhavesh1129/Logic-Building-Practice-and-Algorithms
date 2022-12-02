package hackerank;

import java.util.ArrayList;

public class Qns2 {
    public static void main(String[] args) {
        String str = "seaside the to sent be to ne2ds army ten of team a";
//        System.out.println(decryptMessage(str));
    }

    public static String decryptMessage(String str) {
        String[] wordsArr = str.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = wordsArr.length - 1; i >= 0; i--) {
            list.add(wordsArr[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i);
            int j = 0;
            while (j < string.length()) {
                if (!Character.isDigit(string.charAt(j))) {
                    sb.append(string.charAt(j));
                } else {
                    int count = Integer.parseInt(String.valueOf(string.charAt(j)));
                    char prevAlpha = string.charAt(j - 1);
                    for (int k = 0; k < count - 1; k++) {
                        sb.append(prevAlpha);
                    }
                }
                j++;
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
