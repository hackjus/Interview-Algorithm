package go;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postorder_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> res=new ArrayList<>();
        Stack<TreeNode> stack =new Stack<>();
        stack.push(root);
            while(!stack.isEmpty()){
                TreeNode node=stack.pop();
                if(node.left!=null){
                    stack.push(node.left);
                }
                if(node.right!=null){
                    stack.push(node.right);
                }
                res.add(node.val, 0);
            }
            return res;
        }
        public static void main(String[] args) {
    //
  }
}
