package leetcode;
/*环状；第一个房屋与最后一个房屋是相邻的；意味找不能偷第一个；然后再偷最后一个*/
public class DP_robII_213 {
    int rob(int[]nums){
        int n= nums.length;
        int[]dp=new int[n];
        dp[0]= nums[0];//偷第一个；
        dp[1]= nums[0];
        for(int i=2;i<n-1;i++){
            dp[i]=Math.max(dp[i-2]+ nums[i],dp[i-1]);
        }
        int[]dp1=new int[n];
        dp1[0]=0;dp1[1]=nums[1];
        for(int i=2;i<n;i++){
            dp1[i]=Math.max(dp1[i-2]+ nums[i],dp1[i-1]);
        }
        return Math.max(dp1[n-1],dp[n-2]);
    }

    public static void main(String[] args) {
        int[]arr={1,2,1,1};
        new DP_robII_213().rob(arr);
    }
}
