package Concurrent;


import java.util.Arrays;
import java.util.Scanner;


public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1[] = s.split(" ");
        int[] coins = new int[s1.length - 1];
        for (int i = 0; i < s1.length - 1; i++) {
            coins[i] = Integer.parseInt(s1[i]);
        }
        int amount = Integer.parseInt(s1[s1.length - 1]);
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
        if (dp[amount] > amount) {
            System.out.println(-1);
        } else {
            System.out.println(dp[amount]);
        }
    }
}