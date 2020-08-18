package leetcode.DP;

public class maxSubArray_53 {
    public int maxSubArray(int[] nums) {
        int a=nums[0];
        int b=nums[0];
        for(int i=1;i<nums.length;i++){
            a=nums[i]+(a<0?0:a);
            b = Math.max(a, b);
        }
        System.out.println(b);
        return  b;
    }

    public static void main(String[] args) {
        int[]nums={-1,3,2,1};
        new maxSubArray_53().maxSubArray(nums);
    }
}