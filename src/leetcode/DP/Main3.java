package leetcode.DP;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> res = new ArrayList<>();

        List<Integer> rescopy = new ArrayList<>();
//        String s = br.readLine();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            res.add(in.nextInt());
            rescopy.add(res.get(i));
        }
        for (int i = 0; i < n; i++) {
            res.remove(i);
            if (res.size() / 2 == 1) {
                System.out.println(res.get(res.size() / 2));
            } else {
                System.out.println((res.get(res.size() / 2) + res.get((res.size() + 1) / 2)) / 2);
            }
            res.add(i, rescopy.get(i));
        }
    }
}
