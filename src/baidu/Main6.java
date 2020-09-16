package baidu;

import java.util.Arrays;
import java.util.Scanner;


public class Main6 {
    public static int dfs(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] conis = {100, 50, 20, 10, 5, 2, 1};
        while (in.hasNext()) {
            int n = in.nextInt();
            in.nextLine();
            int[] arr = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                sum += dfs(conis, arr[i]);
            }
            System.out.println(sum);
        }

    }

}