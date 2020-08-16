package leetcode;

import java.util.Scanner;

/*输入: amount = 5, coins = [1, 2, 5]
输出: 4
解释: 有四种方式可以凑成总金额:
5=5
5=2+2+1
5=2+1+1+1
5=1+1+1+1+1*/
public class DP_coinChangeII_518 {
    public int change(int amount, int[] coins) {
        int m = coins.length;
        int[][] dp = new int[m+1][amount+1];

        for (int i = 0; i <= m; i++) {
            for (int k = 0; k <= amount; k++) {
                if (k == 0) {
                    dp[i][k] = 1; // base case
                } else if (i == 0) {
                    dp[i][k] = 0; // base case
                } else {
                    dp[i][k] = dp[i-1][k];
                    if (k >= coins[i-1]) {
                        dp[i][k] += dp[i][k-coins[i-1]];
                    }
                }
            }
        }
        return dp[m][amount];
    }
    public int change1(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int x = coin; x < amount + 1; ++x) {
                dp[x] += dp[x - coin];
            }
        }
        System.out.println(dp[amount]);
        return dp[amount];
        }



    public static void main(String[] args) {
        int[]coin={1};
        new DP_coinChangeII_518().change1(1,coin);
    }
}
