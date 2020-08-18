package leetcode.Array;

import java.util.HashSet;
import java.util.Set;

public class longConsecutiveSequence {
    public int longestConsecutive1(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int a:nums){
            set.add(a);
        }
        int longest=0;
        for(int num:nums){
            if(!set.contains(num-1)){
                int currentNum=num;
                int current=1;
                while (set.contains((currentNum+1))){
                    currentNum+=1;
                    current+=1;
                }
                longest=Math.max(longest,current);
            }
        }
        return longest;
    }
}
