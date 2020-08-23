package Concurrent;

import java.util.HashSet;

public class B站笔试 {
    static boolean res;
    static HashSet<Integer> set;
    public static boolean get24(int[] nums){
        res = false;
        set = new HashSet<>();
        backtrace(nums,0.0);
        return res;
    }

    private static void backtrace(int[] nums, double sum) {
        if(res)
            return;
        if(set.size() == 4){
            if(sum == 1)
                res = true;
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))
                continue;
            set.add(nums[i]);
            backtrace(nums,sum+nums[i]);
            backtrace(nums,sum-nums[i]);
            backtrace(nums,sum*nums[i]);
            backtrace(nums,sum/nums[i]);
            set.remove(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[]arr={7,2,3};
        System.out.println(get24(arr));
    }
}
