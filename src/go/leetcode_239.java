package go;

import java.util.PriorityQueue;

public class leetcode_239 {
    public int[]maxSlidingWindow(int[]nums,int k){
        PriorityQueue<Integer> queue=new PriorityQueue<>((a,b)->(b-a));
        int len=nums.length;
        int[]res=new int[nums.length-k+1];
        if(k>len) return res;
        for (int i=0;i<k-1;i++){
            queue.add(nums[i]);
        }
        for(int i=0,j=k-1;j<len;j++,i++){
            res[i]=queue.peek();
            queue.add(nums[j]);
            queue.remove(queue.size()-1);
        }
        return res;
    }
  public static void main(String[] args) {
    //
  }
}
