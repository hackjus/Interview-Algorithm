package leetcode;
 /*不能偷相邻的；dp
 * dp[i]=(dp[i-2]+arr[i],d[[i-1]);小偷可以选择偷或者不偷；
 * */
public class DP_rob_198 {
    int rob(int[]nums){
        int n= nums.length;
        int[]dp=new int[n];
        dp[0]= nums[0];
        dp[1]=Math.max(nums[0], nums[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-2]+ nums[i],dp[i-1]);
        }
        return dp[n-1];
    }
}
