package CodeTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (map1.containsKey(s1.charAt(i))) {
                map1.put(s1.charAt(i), map1.get(s1.charAt(i)) + 1);
            } else {
                map1.put(s1.charAt(i), 1);
            }
        }
        int cnt = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (map1.get(s2.charAt(i)) != null && map1.get(s2.charAt(i)) > 0) {
                map1.put(s2.charAt(i), map1.get(s2.charAt(i)) - 1);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

