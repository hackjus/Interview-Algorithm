package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int x){
        val=x;
    }

}
public class leetcode_144 {

    public List<Integer> preorderTraversal1(TreeNode root){
        List<Integer> res=new ArrayList<>();
        helper(root,res);
        return  res;
    }
    public void helper(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        res.add(root.val);
        helper(root.left,res);
        helper(root.right,res);
    }
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        if(root==null){
            return res;
        }
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode cur=stack.pop();
            res.add(cur.val);
            if(cur.right!=null){
                stack.push(cur.right);
            }
            if(cur.left!=null){
                stack.push(cur.left);
            }
        }
        return res;
    }
  public static void main(String[] args) {
    //
  }
}
