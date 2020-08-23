package Concurrent;

import java.util.*;

public class Main2 {
    public static List<List<Character>> subsetsWithDup(char[] nums) {
        List<List<Character>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        Arrays.sort(nums);
        helper(res, new ArrayList<>(), nums, 0);
        return res;
    }
    public static void helper(List<List<Character>> res, List<Character> list, char[] nums, int index) {
        res.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++) {
            if (i != index && nums[i] == nums[i - 1]) continue;
            list.add( nums[i]);
            helper(res, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
    public static List<List<Character>> subsetsWithDup1(char[] nums) {
        List<List<Character>> subsets = new ArrayList<>();
        Arrays.sort(nums);
        subsets.add(new ArrayList<>());
        int startIndex = 0;
        int endIndex = 0;

        for(int i=0; i<nums.length; i++) {
            startIndex = 0;

            if (i>0 && nums[i] == nums[i-1]) {
                startIndex = endIndex + 1;
            }

            endIndex = subsets.size() - 1;

            for (int j=startIndex; j<=endIndex; j++) {
                List<Character> set = new ArrayList<>(subsets.get(j));
                set.add(nums[i]);
                subsets.add(set);
            }
        }

        return subsets;

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int n=in.nextInt();
        List<List<Character>> res=subsetsWithDup1(s.toCharArray());
        for(List<Character> a:res){
            System.out.println(a.toString());
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<res.get(n).size();i++){
            sb.append(res.get(n).get(i));
        }
        System.out.println(sb);
    }
}
