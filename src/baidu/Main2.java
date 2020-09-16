package baidu;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        List<LinkedHashMap<Integer, Integer>> res = new ArrayList<>();
        res.add(new LinkedHashMap<>());
        for (int i = 1; i <= n; i++) {
            res.add(new LinkedHashMap<>());
            res.get(i).put(i, 1);
        }
        for (int i = 0; i < m; i++) {
            String s = in.nextLine();
            String s1[] = s.split(" ");
            if (s1[0].equals("C")) {
                res.get(Integer.parseInt(s1[2])).put(Integer.valueOf(s1[1]), res.get(Integer.parseInt(s1[2])).size() + 1);
            } else {
                boolean flag = false;
                for (int k = 0; k < n; k++) {
                    if (res.get(k).get(Integer.parseInt(s1[1])) != null && res.get(k).get(Integer.parseInt(s1[2])) != null) {

                        System.out.println(Math.abs(res.get(k).get(Integer.parseInt(s1[1])) + 1 - res.get(k).get(Integer.parseInt(s1[2]))));
                        return;
                    }
                }
                System.out.println(-1);

            }
        }
    }
}
