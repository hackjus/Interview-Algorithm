package leetcode.Array;

import java.util.Scanner;

public class SpiralMatrix_59 {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        boolean visited[][] = new boolean[n][n];
        int dr[] = {0, 1, 0, -1};
        int dc[] = {1, 0, -1, 0};
        int r = 0, c = 0;
        int di = 0;
        int begin = 1;
        for (int i = 0; i < n * n; i++) {
            matrix[r][c] = begin++;
            visited[r][c] = true;
            int r1 = r + dr[di];
            int c1 = c + dr[di];
            if (r1 >= 0 && r1 < n && c1 >= 0 && c1 < n && !visited[r1][c1]) {
                r = r1;
                c = c1;
            } else {
                di = (di + 1) % 4;
                r += dr[di];
                c += dr[di];
            }
        }
        return matrix;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next().substring(2);
            System.out.println(Integer.parseInt(str, 16));
        }
    }
}
