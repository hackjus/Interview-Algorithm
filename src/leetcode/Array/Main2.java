package leetcode.Array;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }
        in.nextLine();
        int n1 = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n1; i++) {
            fn(arr, in.nextInt());
        }
    }

    public static void fn(int[] arr, int n) {
        boolean[] flag = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                flag[i] = true;
            }
        }
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length && flag[i] == true) {
                while (i < arr.length && flag[i]) {
                    i++;
                }
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}
