package leetcode.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation_60 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();

        dfs(res, 0, new ArrayList<>(),nums);
        return res;
    }
    public  void dfs(List<List<Integer>> res, int start, List<Integer> temp,int[]nums){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;

        }
        for(int i=start;i< nums.length;i++){
            if (temp.contains(nums[i])) {
                continue;

            }
            temp.add(nums[i]);
            dfs(res,start,temp,nums);
            temp.remove(temp.size()-1);

        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return  res;
        Arrays.sort(nums);
        helper(res, new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }

    public void helper(List<List<Integer>> res, List<Integer> list, int[] nums, boolean[] used) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            list.add(nums[i]);
            helper(res, list, nums, used);
            used[i] = false;
            list.remove(list.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        new Permutation_60().permuteUnique(arr);

    }
}
