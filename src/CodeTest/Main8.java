package CodeTest;

import java.util.Scanner;

public class Main8 {
    private static int change = 0;

    public static int dfs(Character[][] board, int x, int y, boolean visited[][], int cnt) {
        int m = board.length;
        int n = board[0].length;
        if (board[x][y] == '#') {
            return Integer.MAX_VALUE;
        }
        if (visited[x][y]) {
            return cnt;
        }
        if (board[x][y] == '*') {
            cnt++;
        }
        if (x == m - 1 || x == 0 || y == 0 || y == n - 1) {
            return cnt;
        }
        return Math.min(Math.min(dfs(board, x + 1, y, visited, cnt), dfs(board, x - 1, y, visited, cnt)), Math.min(dfs(board, x, y - 1, visited, cnt), dfs(board, x, y + 1, visited,
                cnt)));

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        for (int i = 0; i < k; i++) {
            int m = in.nextInt();
            int n = in.nextInt();
            in.nextLine();
            Character[][] board = new Character[m][n];
            int startX = 0;
            int startY = 0;
            for (int j = 0; j < m; j++) {
                String s = in.nextLine();
                for (int a = 0; a < s.length(); a++) {
                    if (s.charAt(a) == '@') {
                        startX = j;
                        startY = a;
                    }
                    board[j][a] = s.charAt(a);
                }
            }
            boolean visited[][] = new boolean[m][n];
            System.out.println(dfs(board, startX, startY, visited, 0));
        }
    }
}
