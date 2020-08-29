package leetcode.Tree;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class MAin1 {
    //验证是否是二叉搜索树的后序遍历；
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }
    boolean recur(int[] postorder, int i, int j) {
        if(i >= j) return true;
        int p = i;
        while(postorder[p] < postorder[j]) p++;
        int m = p;
        while(postorder[p] > postorder[j]) p++;
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }
    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return help(root);
    }
    public int help(TreeNode root1){
        if(root1==null){
            return 0;
        }
        int left=help(root1.left);
        int right=help(root1.right);
        return  Math.max(left,right)+1;
    }
   public int maxDepth1(TreeNode root){
        if(root==null) return 0;
       Queue<TreeNode> queue=new LinkedList<>();
       queue.offer(root);
       int depth=0;
       while (!queue.isEmpty()){
         int n=queue.size();
         for(int i=0;i<n;i++){
             TreeNode curNode = queue.poll();
             if (curNode.left != null)
                 queue.add(curNode.left);
             if (curNode.right != null)
                 queue.add(curNode.right);

         }
         depth++;

       }
       return depth;
   }
}
