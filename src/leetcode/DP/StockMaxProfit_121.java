package leetcode.DP;

public class StockMaxProfit_121 {
    public int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int min= prices[0];int max=0;
        for(int i=1;i<prices.length;i++){
            max=Math.max(max, prices[i]-min);
            min=Math.min(min, prices[i]);
        }
        return max;
    }
    public int maxProfitII(int[]prices){
        //0是现金；1是股票；  //0代表不买股票（包含卖股票）；1代表买入股票（；最大的话；肯定我们最后一天不能再买股票；求的是dp[n-1][0];
        //

        int n=prices.length;
        int[][]dp=new int[n][2];// 0
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for(int i=1;i<n;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return  dp[n-1][1];
    }
}
