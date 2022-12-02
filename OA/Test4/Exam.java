package OA.Test4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (sc.nextInt() > -1) {
            list.add(sc.nextInt());
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 7 == 0) {
                list2.add(-2);
            }
            if (list.get(i) % 8 == 0) {
                list2.add(-9);
            }
            if (list.get(i) % 7 == 0 && list.get(i) % 8 == 0) {
                list2.add(-6);
            } else {
                list2.add(list.get(i));
            }
        }
        System.out.println(list2);
    }
}
