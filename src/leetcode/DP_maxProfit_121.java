package leetcode;

public class DP_maxProfit_121 {
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
}
