package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class FindItineraryFromTickets {
    public static void main(String[] args) {
        int n = 4;

//        MUC LHR
//        JFK MUC
//        SFO SJC
//        LHR SFO

//        Chennai Banglore
//        Bombay Delhi
//        Goa Chennai
//        Delhi Goa
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(sc.next(), sc.next());
        }
        itineraryFromTickets(map, n);
    }

    private static void itineraryFromTickets(HashMap<String, String> map, int n) {
        HashMap<String, Boolean> startPlace = new HashMap<>();
        for (String src : map.keySet()) {
            String dest = map.get(src);
            startPlace.put(dest, false);
            if (!startPlace.containsKey(src)) {
                startPlace.put(src, true);
            }
        }
        String src = "";
        for (String startPoint : map.keySet()) {
            if (startPlace.get(startPoint)) {
                src = startPoint;
            }
        }
        while (true) {
            if (map.containsKey(src)) {
                System.out.print(src + " -> ");
                src = map.get(src);
            } else {
                System.out.print(src + ".");
                break;
            }
        }
    }
}
