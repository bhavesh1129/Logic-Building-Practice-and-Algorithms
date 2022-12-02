package OA.Test2;

import java.util.*;

public class Main {
    public static List<Integer> list = new ArrayList<>();
    private static Node head;

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private void add(Node head, int val) {
        if (head != null) {
            add(val);
        }
    }

    public void add(int val) {
        list.add(val);
    }

    public void display() {
        System.out.println(list);
    }

    public static void main(String[] args) {
//        [10]->[30]->[30]->[5]->[12]->[10]->[3]->[5]->NULL
//        [10]->[30]-->[5]->[12]->[3]->NULL
//        Node head = new Node(-1);
//        list.add(10);
//        list.add(30);
//        list.add(30);
//        list.add(5);
//        list.add(12);
//        list.add(10);
//        list.add(3);
//        list.add(5);
//        Main obj = new Main();
//        obj.display();
        String str = "aaabc";
        solution(str);
    }
//    aaabc -> abaca
//    aaabb -> ababa
//    aa -> Not Possible
//    aaaabc -> Not Possible

    public static void solution(String str) {
        //aaabc
//        HashMap<Character, Integer> map = new LinkedHashMap<>();
//        for (char ch : str.toCharArray()) {
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//      map-> {a=3, b=1, c=1}
//        int freq = map.size();//3
//        System.out.println(map);
        //_ _ _ _ _5->3
        //_ _ _ _ _5->2
//        6->3
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                k = str.charAt(j);
                if (str.charAt(i) == str.charAt(j)) {
//                    swap(str, i, j)
                }
            }
        }
    }

    public void storeLinkedlistToSet(Node head) {
        Node temp = head;
        Set<Integer> set = new HashSet<>();
        while (temp != null) {
            set.add(temp.val);
            temp = temp.next;
        }
        //set-> {10,30,5,12,3}
        Object[] valueArray = set.toArray();
        Node main = new Node(-1);
        for (Object i : valueArray) {
            Node point = new Node((Integer) i);
            point = point.next;
        }
        System.out.println(main.next);
    }

    public void removeDuplicatesFromLinkedList(Node head) {
//        null->[10]->[30]->[30]->[5]->[12]->[10]->[3]->[5]->[30]->NULL
//        [10]->[30]-->[5]->[12]->[3]->NULL
        Node prev = null;
        Node mainRes = prev;
        Node temp = head;
        while (temp != null) {
            if (prev.val == temp.val) {
                prev = temp.next;
            } else {
                prev = temp;
                temp = temp.next;
            }
        }
        System.out.println(mainRes);
    }
}
