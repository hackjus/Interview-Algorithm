package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inorderTravel_94 {
    public List< Integer > inorderTraversal(TreeNode root) {
            List<Integer> res=new ArrayList<>();
        Stack<TreeNode> stack =new Stack<>();
//        TreeNode cur=root;
        while (root!=null||!stack.isEmpty()){
            if(root!=null){
                stack.push(root);
                root=root.left;
            }else{
                TreeNode temp=stack.pop();
                res.add(temp.val);
                root=temp.right;
            }
        }
        return res;
        }
        public static void main(String[] args) {
    //
  }
}
