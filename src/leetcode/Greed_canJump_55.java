package leetcode;

public class Greed_canJump_55 {
    /*输入: [2,3,1,1,4]
输出: true
贪心：righMost；维护当前位置能跳的最远地方；如果rightMost>=nums.length-1；说明能调到；返回true;
解释: 我们可以先跳 1 步，从位置 0 到达 位置 1, 然后再从位置 1 跳 3 步到达最后一个位置。*/
    public boolean canJump(int[] nums) {
        int rightMost=0;
        for(int i=0;i< nums.length;i++){
            if(i<=rightMost){
                rightMost=Math.max(rightMost, nums[i]);
            }
            if(rightMost>= nums.length-1){
                return  true;
            }
        }
        return false;
    }

}