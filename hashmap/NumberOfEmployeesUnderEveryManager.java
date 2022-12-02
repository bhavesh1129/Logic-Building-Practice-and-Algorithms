package hashmap;

import java.util.*;

public class NumberOfEmployeesUnderEveryManager {
    public static void main(String[] args) {
        int n = 6;
//        A C
//        B C
//        C F
//        D E
//        E F
//        F F
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(sc.next(), sc.next());
        }
        numOfEmpUnderMan(map, n);
    }

    private static void numOfEmpUnderMan(HashMap<String, String> map, int n) {
        HashMap<String, Integer> res = new HashMap<>();
        HashMap<String, Integer> ans = new HashMap<>();
        String ceo = "";
        for (String key : map.keySet()) {
            String manager = map.get(key);
            if (manager.equals(key)) {
                ceo += key;
            } else {
                if (map.containsKey(manager)) {
                    res.put(manager, res.getOrDefault(manager, 0) + 1);
                }
            }
        }
        for (String key : map.keySet()) {
            ans.put(key, res.getOrDefault(key, 0));
        }
        int size = ans.keySet().size() - 1;
        ans.put(ceo, size);
        System.out.println(res);
        System.out.println(ans);
//        ans.forEach((key, value) -> System.out.println(key + " " + value));
    }
}