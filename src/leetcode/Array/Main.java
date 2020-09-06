package leetcode.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static int get1(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            int n1 = in.nextInt();
            int[] arr = new int[n1];
            for (int j = 0; j < n1; j++) {
                set.add(get1(in.nextInt()));
            }
            System.out.println(set.size());
        }
    }
}
