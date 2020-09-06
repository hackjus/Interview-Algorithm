package leetcode.DP;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        List<Set<Integer>> res = new ArrayList<>();
        int[] temp1 = new int[m];
        for (int i = 0; i < m; i++) {
            Set<Integer> set = new HashSet<>();
            String s = in.nextLine();
            String s1[] = s.split(" ");
            for (int j = 0; j < s1.length; j++) {
                set.add(Integer.valueOf(s1[i]));
            }
            res.add(set);
        }
        int count = 0;
        List<Integer> flag = new ArrayList<>();
        Set<Integer> rescount = new HashSet<>();
        flag.add(0);
        rescount.add(0);
        Boolean[] visited = new Boolean[m];
        for (int i = 0; i < m; i++) {
            if (!visited[i]) {
                for (int j = 0; j < flag.size(); j++) {
                    if (res.get(i).contains(flag.get(j))) {
                        count += res.get(i).size();
                        visited[i] = true;
                        for (int a : res.get(i)) {
                            if (a != flag.get(i)) {
                                flag.add(a);
                                rescount.add(a);
                            }
                        }
                        break;
                    }
                }
            }

        }
        System.out.println(rescount.size());
    }
}
