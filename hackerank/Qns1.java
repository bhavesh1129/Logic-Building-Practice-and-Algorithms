package hackerank;

import java.util.*;

public class Qns1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Alpha");
        list.add("Epsilon");
        list.add("Delta");
        list.add("Zeta");
        list.add("Zeta");
        list.add("Zeta");
        list.add("Zeta");
        list.add("Zeta");
        list.add("Zeta");
        list.add("Zeta");
        list.add("Zeta");
        list.add("Zeta");
        list.add("Beta");
        list.add("Beta");
        list.add("Beta");
        list.add("Beta");
        list.add("Beta");
        list.add("Beta");
        list.add("Beta");
        list.add("Beta");
        list.add("Beta");
        mostActive(list);
    }

    public static List<String> mostActive(List<String> customers) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < customers.size(); i++) {
            map.put(customers.get(i), map.getOrDefault(customers.get(i), 0) + 1);
        }
        System.out.println(map);
        for (String val : map.keySet()) {
            int totalTrade = map.get(val);
            float tradePercentage = (totalTrade * 100) / customers.size();
            if (tradePercentage >= 5.0) {
                list.add(val);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        return null;
    }
}
