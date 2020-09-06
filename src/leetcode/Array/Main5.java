package leetcode.Array;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            for (int i1 = 0; i1 < n1; i1++) {
                String s = in.nextLine();
            }
            for (int j = 0; j < n2; j++) {
                String s = in.nextLine();
            }
            System.out.println(n1 * n2 - 1);
        }
    }
}
