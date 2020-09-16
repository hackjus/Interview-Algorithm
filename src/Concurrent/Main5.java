package Concurrent;

import java.util.Scanner;


public class Main5 {
    public static int dfs(int[][] arr, int i, int j) {
        int max = 1;
        for (int a = 0; a < arr.length; a++) {
            if (a != i) {
                for (int b = 0; b < arr[0].length; b++) {
                    if (b != j) {
                        max = Math.max(max, arr[a][b]);
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        in.nextLine();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int max = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(dfs(arr, i, j) * arr[i][j], max);
            }
        }
        System.out.println(max);
//        String s = in.nextLine();
//        String s1[] = s.split(" ");
//        int[] arr = new int[s1.length];
//        for (int i = 0; i < s1.length; i++) {
//            arr[i] = Integer.parseInt(s1[i]);
//        }
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length - 1; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.print(arr[arr.length - 1]);
    }
}