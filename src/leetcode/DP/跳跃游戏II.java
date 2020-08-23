package leetcode.DP;

public class 跳跃游戏II {
        public int jump(int[] nums) {
            int length = nums.length;
            int end = 0;
            int maxPosition = 0;
            int steps = 0;
            for (int i = 0; i < length - 1; i++) {
                maxPosition = Math.max(maxPosition, i + nums[i]);
                if (i == end) {
                    end = maxPosition;
                    steps++;
                }
            }
            return steps;
        }

    public static void main(String[] args) {
        int[]arr={2,3,1,2,4,2,3};
        new 跳跃游戏II().jump(arr);
    }

}
