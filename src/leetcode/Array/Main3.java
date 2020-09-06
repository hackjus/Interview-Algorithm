package leetcode.Array;

import java.util.Scanner;
import java.util.TreeMap;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        for (int j = 0; j < time; j++) {
            String str = in.next();
            int count = 0;
            int sum = 0;
            int res = 0;
            int start = 0;
            int end = 0;
            TreeMap<Integer, Character> map = new TreeMap<>();
            int len = str.length();
            for (int i = 0; i < len; i++) {
                if ('N' != str.charAt(i)) {
                    map.put(i, str.charAt(i));
                    count++;
                }
                if (count > 2) {
                    start = map.firstKey() + 1;
                    map.pollFirstEntry();
                    count--;
                }
                if (count <= 2) {

                    sum = end - start + 1;
                    end++;
                }
                res = Math.max(res, sum);
            }
            System.out.println(res);
        }
    }
}
