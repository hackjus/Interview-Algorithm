package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inorderTravel_94 {
    public TreeNode KthNode(TreeNode root,int k) {
        List<TreeNode> res=new ArrayList<>();
        Stack<TreeNode> stack =new Stack<>();
//        TreeNode cur=root;
        int cnt=0;
        while (root!=null||!stack.isEmpty()){
            if(root!=null){
                stack.push(root);
                root=root.left;
            }else{
                TreeNode temp=stack.pop();
                cnt++;
                if(cnt==k){
                    return  temp;
                }
                root=temp.right;
            }
        }
        return null;

    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return  head;
        }
        ListNode cur=head;
        int len=1;
        while(cur.next!=null){
            cur=cur.next;
            len++;
        }
        cur.next=head;
        for(int i=0;i<len-k%len-1;i++){
            head=head.next;
        }
        ListNode temp=head.next;
        head.next=null;
        return temp;
    }
    public int trap(int[] height) {
      int ans=0;
      int size=height.length;
      for(int i=1;i< height.length-1;i++){
          int maxLeft=0,maxright=0;
          for(int j=i;j>=0;j++){
              maxLeft=Math.max(maxLeft, height[j]);
          }
          for (int j = i; j < size; j++) {
              maxright=Math.max(maxright, height[j]);
          }
          ans+=Math.min(maxLeft,maxright)- height[i];
      }
      return ans;
    }
    public double pow(double base,int n){
        double result=1.0;
        for(int i=0;i<n;i++){
            result*=base;
        }
        for(int i=0;i>n;i--){
            result/=base;
        }
        return  result;
    }
        public static void main(String[] args) {
    //
  }
}
