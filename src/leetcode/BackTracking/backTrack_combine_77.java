package leetcode.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class backTrack_combine_77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList();
        if (k == 0 || n == 0) {
            return res;
        }

        List<Integer> temp=new ArrayList<>();
        backtrack(n,k,1,temp,res);
        return  res;
    }
    public  void backtrack(int n,int k,int start,List<Integer> temp,List<List<Integer>> res){
        if(k==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=n;i++){
            temp.add(i);
            backtrack(n,k-1,i+1,temp,res);
            temp.remove(temp.size()-1);
        }


    }
}
